package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Salman@2002");
			
//			PreparedStatement ps= c.prepareStatement("insert into student values(?,?);");
//			ps.setString(1,"Ruturaj");
//			ps.setString(2,"Chinchwad");
//			ps.executeUpdate();
//			System.out.println("Data inserted.....");
//			
//			
//			PreparedStatement ps = c.prepareStatement("update Student set city=? where name=?;");
//			ps.setString(1, "akurdi");
//			ps.setString(2, "Ruturaj");
//			ps.executeUpdate();
//			
//			System.out.println("Data updated...");
			
//			
//			PreparedStatement ps = c.prepareStatement("delete from student where name=?");
//			ps.setString(1,"Ruturaj");
//			ps.executeUpdate();
//			
//			System.out.println("Data deleted....");
		
			
			PreparedStatement ps= c.prepareStatement("select * from Student");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("name")+" "+ rs.getString("city"));
			}
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e  ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
