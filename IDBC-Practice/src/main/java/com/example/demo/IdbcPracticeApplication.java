package com.example.demo;
import java.sql.*;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IdbcPracticeApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		SpringApplication.run(IdbcPracticeApplication.class, args);
		
		//steps to connect postgreSQL using JDBC
		//Import package java.sql.* and load the driver using Class.forName.
		//Register the Driver.
		//create a connection.
		//create a statement.
		//execute a statement.
		//process  the results.
		//close the connection.
		 String url="jdbc:postgresql://localhost:5432/Demo";
		 String uname="postgres";
		 String password="532662";
		Class.forName("org.postgresql.Driver");
		
		Connection c= DriverManager.getConnection(url, uname, password);
		System.out.println("Connection established");
		
	    Statement s= c.createStatement();
	   ResultSet b= s.executeQuery("Select * from students where id=1");
	   if(b.next())
	   {
		   System.out.println(b.getInt("id")+" "+b.getString("name")+" "+b.getInt("age"));
	   }
	   
	   ResultSet rs= s.executeQuery("select * from students");
	   while(rs.next())
	   {
		   System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("age"));
	   }
//	   
//	   boolean b1=s.execute("insert into students values(3,'xyz', 29)");
//	   System.out.println(b1);
	   
	   s.execute("update students set age=27 where id=3");
	    s.execute("delete from students where id=3");
	    
	    
	    Scanner sc= new Scanner(System.in);
	    int id= sc.nextInt();
	    String name = sc.next();
	    int age= sc.nextInt();
	    
	    s.execute("insert into students values("+id+", '"+name+"',"+age+")");//it's very difficult to insert user input records. so use prepared statements.
	    
	    //prepared statements.
	    PreparedStatement p= c.prepareStatement("insert into students values(?,?,?)");
	    p.setInt(1, sc.nextInt());
	    p.setString(2, sc.next());
	    p.setInt(3, sc.nextInt());
	    p.execute();
	   
	   c.close();
	   System.out.println("Connection closed");
	   sc.close();
	 
	}

}
