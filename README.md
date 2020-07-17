# Library-Management-System

Library Management System using Java and MySQL

# Developed By
- Pranjal Raj

# Environment and Requirement
- Programming Language: JAVA with  Swings
- MySQL Conncector: MySQL JConnector 5.1.40(JDBC Driver)
  https://dev.mysql.com/downloads/connector/j/
- IDE: NetBeans 8.1
- MySQL Version: 5.7.29
- MySQL WorkBench: 8.0.21

# About Files
-  /SQL: Contains the Exported Database Schema+Data
- /src/mainlibrary: Contains JAVA source codes
- /MySQL Connector: Contains JDBC/MySQL JConnnector

# Instructions
1) Clone the Project using link https://github.com/Pranjalraj0046/Library-Management-System.git or Download the zip

2) Importing Java Project in NetBeans
- Clone the project in the NetBeans 8.1
- NetBeans->Team->Git->Clone and copy-paste the https://github.com/Pranjalraj0046/Library-Management-System.git link

3) Importing Database(Schema+Data)
- Import the Database in the MySQL database using MySQL WorkBench(Version is mentioned above)
- MySQL Workbench->Connect to server
- MySQL Workbench->Server->Data Import->Load Folder Contents->SQL->exportdb.sql

4) Connect the JDBC driver(JConnector) by including the it's JAR File in the Project
- Expand Project->Libraries->(Right Click)ADD JAR File->include file: mysql-connector-java-5.1.40-bin.jar

5) Database setting can be changed
- Expand Project->Source Packages->mainlibrary->DB.java
- Change the Authentication Setting

# How Does This Project Work
- After connecting database with the server
- Run the project in NetBeans
- After Successfully run of the project, this page will open

