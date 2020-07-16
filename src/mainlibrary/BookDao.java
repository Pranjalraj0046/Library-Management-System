package mainlibrary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookDao {
public static int save(String callno,String name,String author,int quantity){
	int status=0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into books(callno,name,author,quantity) values(?,?,?,?)");
		ps.setString(1,callno);
		ps.setString(2,name);
		ps.setString(3,author);
		ps.setInt(4,quantity);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}


      public static int SaveBook(String BookN, String AuthorN, String Year, String ISBN) {
            int status= 0;
        try(Connection con = DB.getConnection()) {
		PreparedStatement ps=con.prepareStatement("insert into Books(BookName,Author,ISBN,Year) values(?,?,?,?)");
		ps.setString(1,BookN);
                ps.setString(2, AuthorN);
                ps.setString(3, ISBN);
                ps.setString(4, Year);
		status=ps.executeUpdate();
                con.close();
	}catch(Exception e){System.out.println(e);}
	return status;    }
    
    public static int Delete(int BookID)
    {
          int status= 0;
        try(Connection con = DB.getConnection()) {
		PreparedStatement ps=con.prepareStatement("DELETE FROM Books where BookID=?");
		ps.setInt(1,BookID);
		status=ps.executeUpdate();
                con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
        
    }
            
    
 

}
