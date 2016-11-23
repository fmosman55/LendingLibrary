package com.fosmanhost.lendinglibrary.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MaterialCatalogDB implements MaterialCatalogInterface {

	@Override
	public int getNumberOfMaterials() 
	{
		Connection conn = null;
		Statement stm =  null;
		ResultSet rs = null;


		try 
		{
			try
			{	
				Class.forName("org.apache.derby.jdbc.ClientDriver");
				conn = DriverManager.getConnection("jdbc:derby://localhost/library");
				stm = conn.createStatement();
				rs = stm.executeQuery("select count(id) from materials");

				rs.next();
				return rs.getInt(1);

			}
			finally
			{
				//Close connectons					
				if(rs!=null) 
				{rs.close();}
				if(rs!=null)
				{rs.close();}
				if(conn!=null)
				{conn.close();}

				System.out.println();
				System.out.println("Finally was run");			
			}
		}
		catch(ClassNotFoundException e)
		{
			throw new RuntimeException(e);

		}

		catch(SQLException e)
		{

			throw new RuntimeException(e);
		}
	}

	@Override
	public void addMaterial(Material newMaterial)
	{
		Connection conn = null;
		PreparedStatement stm = null;

		try
		{
			try
			{
				Class.forName("org.apache.derby.jdbc.ClientDriver");
				conn = DriverManager.getConnection("jdbc:derby://localhost/library");

				if(newMaterial instanceof Book)
				{
					Book newBook = (Book)newMaterial;
					//create a preparedStatement
					String sql = "insert into materials(barcode, title, author, isbn, numberofpages, branch, type) values(?, ?, ?, ?, ?, ?, 'BOOK')";
					//to put into preparedStatement
					stm = conn.prepareStatement(sql);
					// apply each field into the statement
					stm.setString(1, newBook.getId());
					stm.setString(2, newBook.getTitle());
					stm.setString(3, newBook.getAuthor());
					stm.setString(4, newBook.getIsbn());
					stm.setInt(5, newBook.getNoOfPages());
					stm.setString(6, "Any Town BranchDB");

				}
				else if(newMaterial instanceof DVD)
				{
					DVD newDVD =(DVD)newMaterial;
					//DVD dvd1 = new DVD("1","Epic Film about Java in the Jungle", "London","Faisal and Abdul","1234ABC",125);
					String sql = "insert into materials(barcode, title,catalognumber, runningtime, numberofpages, branch, type) values(?, ?, ?, ?, ?, ?, 'DVD')";
					//to put into preparedStatement
					stm = conn.prepareStatement(sql);
					// apply each field into the statement
					stm.setString(1, newDVD.getId());
					stm.setString(2, newDVD.getTitle());
					stm.setString(3, newDVD.getCatalogNo());
					stm.setInt(4, newDVD.getRunningTime());
					stm.setBoolean(5, newDVD.getLicenced());
					stm.setString(6, "Any Town BranchDB");
				}

				//Execute preParedStatement
				int result = stm.executeUpdate();
				System.out.println("Records added: "+result);

			}

			//Finally
			finally
			{
				//Close connectons

				if(stm!=null)
				{stm.close();
				}
				if(conn!=null)
				{
					conn.close();
				}
				System.out.println();
				System.out.println("Finally was run");

			}

		}
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

	}



	@Override
	public Material findMaterial(String title) throws MaterialNotFoundException 
	{
		Connection conn = null;
		Statement stm =  null;
		ResultSet rs = null;


		try 
		{
			try
			{	
				Class.forName("org.apache.derby.jdbc.ClientDriver");
				conn = DriverManager.getConnection("jdbc:derby://localhost/library");
				stm = conn.createStatement();
				rs = stm.executeQuery("select * from materials where title like '%"+ title + "%'");

				if(rs.next())
				{
					//Declare a String that checks which object to find
					String materialType = rs.getString("type");
					if(materialType.equalsIgnoreCase("BOOK"))
					{
						//Book newBook = new Book()
						//barcode, title, author, isbn, numberofpages, branch, type
						//add and return a Book"
						Book newBook = new Book(rs.getString("barcode"),rs.getString("title"),rs.getString("author"),rs.getString("isbn"),rs.getString("branch"),rs.getInt("numberofpages"));
						return newBook;
					}
					else if(materialType.equalsIgnoreCase("DVD"))
					{
						//add and return DVD
						DVD newDVD = new DVD(rs.getString("barcode"),rs.getString("title"),rs.getString("branch"),rs.getString("director"),rs.getString("catalognumber"),rs.getInt("runningTime"));
						return newDVD;
					}
					else
					{
						throw new MaterialNotFoundException();
					}						
				}
				else
				{
					throw new MaterialNotFoundException();
				}

			}
			finally
			{
				//Close connectons

				if(rs!=null) 
				{rs.close();}
				if(rs!=null)
				{rs.close();}
				if(conn!=null)
				{conn.close();}

				System.out.println();
				System.out.println("Finally was run");				
			}
		}		
		catch(ClassNotFoundException e)
		{
			throw new RuntimeException(e);
			//System.out.println("Sorry for that!!. Something Went Wrong");
			//e.printStackTrace(); 
		}

		catch(SQLException e)
		{
			//					System.out.println("Sorry for that!!. Something Went Wrong");
			//					e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public Map<String, Material> getMaterialMap() 
	{
		// TODO Auto-generated method stub
		//return null;

		Connection conn = null;
		Statement stm =  null;
		ResultSet rs = null;


		try 
		{
			try
			{	
				Class.forName("org.apache.derby.jdbc.ClientDriver");
				conn = DriverManager.getConnection("jdbc:derby://localhost/library");
				stm = conn.createStatement();
				rs = stm.executeQuery("select * from materials");

				// a Map of all materials to be returned
				Map<String, Material> allMaterials = new LinkedHashMap<String, Material>();

				while(rs.next())
				{
					//Declare a String that checks which object to find
					String materialType = rs.getString("type");
					if(materialType.equalsIgnoreCase("BOOK"))
					{
						//add and return a Book"
						Book newBook = new Book(rs.getString("barcode"),rs.getString("title"),rs.getString("author"),rs.getString("isbn"),rs.getString("branch"),rs.getInt("numberofpages"));
						allMaterials.put(rs.getString("barcode"), newBook);
					}
					else if(materialType.equalsIgnoreCase("DVD"))
					{
						//add and return DVD
						DVD newDVD = new DVD(rs.getString("barcode"),rs.getString("title"),rs.getString("branch"),rs.getString("director"),rs.getString("catalognumber"),rs.getInt("runningTime"));
						allMaterials.put(rs.getString("barcode"), newDVD);	
					}
				}

				//return allMaterials;
				return allMaterials;

			}
			finally
			{
				//Close connectons

				if(rs!=null) 
				{rs.close();}
				if(rs!=null)
				{rs.close();}
				if(conn!=null)
				{conn.close();}

				System.out.println();
				System.out.println("Finally was run");				
			}
		}		
		catch(ClassNotFoundException e)
		{
			throw new RuntimeException(e); 
		}

		catch(SQLException e)
		{
			throw new RuntimeException(e);
		}

	}
}
