package com.fosmanhost.lendinglibrary.ui;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
;



public class DatabaseConnection {

	public static void main(String[] args)  {

		//declare global variables
		//Connection conn = null;
		//Statement stm = null;
		//ResultSet rs = null;

		//This code of three try blocks are only available from Java 7 and onwards.
		//NOTE: By using these nested try blocks. We are telling Java to automatically close those nested statements.
		try
		{

			Class.forName("org.apache.derby.jdbc.ClientDriver");

			try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost/library"))
			{
				try (Statement stm = conn.createStatement())
				{
					try (ResultSet rs = stm.executeQuery("Select * from Materials"))
					{

						while(rs.next())
						{
							//System.out.println(rs.getString("title"));
							System.out.println("Book: "+rs.getString("title")+" | Author: "+rs.getString("Author"));
						}
					}
				}
			}
		}
		//System.out.println(rs.getString("title"));
		/*	finally
			{
				if(rs!=null) 
					{
					rs.close();
					}

				if(stm!=null)
					{
					stm.close();
					}
				if(conn!=null)
					{
					conn.close();
			}
				System.out.println();
				System.out.println("Finally was run");
		}
		}*/
		catch(ClassNotFoundException e)
		{
			System.out.println("Sorry for that!!. Something Went Wrong");
			e.printStackTrace();
		}

		catch(SQLException e)
		{
			System.out.println("Sorry for that!!. Something Went Wrong");
			e.printStackTrace();
		}

		/*	try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			Connection connection = DriverManager.getConnection("jdbc:derby://localhost/library");
			Statement st = connection.createStatement();
			ResultSet result = st.executeQuery("select * from materials");
			//st.executeUpdate("Insert into Customers values('mrs','Osman','faysal','8 buulo','89','kii@kok.com',9,'Mile')");


			while (result.next()) {
				//System.out.println(result.getString("title"));
				System.out.println("Book Name:"+result.getString("title")+" | Author Name: "+result.getString("Author"));

			}


			result.close();
			st.close();
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Something Went Wrong");
			e.printStackTrace();

		}*/

	}

}
