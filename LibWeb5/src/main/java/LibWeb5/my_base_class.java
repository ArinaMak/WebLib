package LibWeb5;
import java.io.PrintWriter;
// Что будет после нажатия кнопок из html

//import java.sql.*;
//import java.sql.PreparedStatement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

import java.sql.*;

public class my_base_class {
//class my_base_class {

	// JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/libweb2";
    private static final String user = "root";
    private static final String password = "AcbD1324_";

    // JDBC variables for opening and managing connection
    private static Connection con = null;
    private static Statement stmt;
    private static ResultSet rs = null;
    
    
    
    private static final String url_db = "jdbc:mysql://localhost:3306/libweb2";
    private static final String user_db = "root";
    private static final String password_db = "AcbD1324_";
    
    public static void getDBConnection() throws ClassNotFoundException{
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection(url_db, user_db, password_db);		// opening database connection to MySQL server
		    stmt = con.createStatement();
    	} catch (SQLException sqlEx) {
		    sqlEx.printStackTrace();
		}
    }
    
    public static void closeAllDBConnection() {
    	try { con.close(); con=null;} catch(SQLException se) { /*can't do anything */ }
	    try { stmt.close(); stmt=null;} catch(SQLException se) { /*can't do anything */ }
	    try { rs.close(); rs=null;} catch(SQLException se) { /*can't do anything */ }
    }
    
    public static void addingDataByQuery(String query) throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection(url, user, password);		// opening database connection to MySQL server
		    stmt = con.createStatement();	// getting Statement object to execute query
		    stmt.executeUpdate(query);
		} catch (SQLException sqlEx) {
		    sqlEx.printStackTrace();
		} finally {
		    try { con.close(); } catch(SQLException se) { /*can't do anything */ }
		    try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
		}
    }
    
    public static void addingDataByQuery2(String query){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection(url, user, password);		// opening database connection to MySQL server
		    stmt = con.createStatement();	// getting Statement object to execute query
		    stmt.executeUpdate(query);
		} catch (SQLException sqlEx) {
		    sqlEx.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		    try { con.close(); } catch(SQLException se) { /*can't do anything */ }
		    try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
		}
    }
    
	public static void insertAuthorInDB(String name, String surname, String middle_name) throws ClassNotFoundException{
			
		String query = String.format("INSERT INTO libweb2.author (name, surname, middle_name) \n" +
	               " VALUES ('%s', '%s', '%s');", name, surname, middle_name);
		addingDataByQuery(query);
	}
	public static void insertUserInDB(String name, String surname, String middle_name, String login, String email, int email_status, String password1, int number_of_books, int number_of_books_taken) throws ClassNotFoundException{
		
		String query = String.format("INSERT INTO libweb2.usr (name, surname, middle_name, login, email, email_status, password, number_of_books, number_of_books_taken) \n" +
	               " VALUES ('%s', '%s', '%s', '%s', '%s', '%d', '%s', '%d', '%d');", name, surname, middle_name, login, email, email_status, password1, number_of_books, number_of_books_taken);
		addingDataByQuery(query);
	}
	public static void insertBookInDB(String title, String description, int section, int publishin_house, int year_of_publication, int quantity_of_total, int quantity_left) throws ClassNotFoundException{
		
		String query = String.format("INSERT INTO libweb2.book (title, description, section, publishin_house, year_of_publication, quantity_of_total, quantity_left) \n" +
	               " VALUES ('%s', '%s', '%d', '%d', '%d', '%d', '%d');", title, description, section, publishin_house, year_of_publication, quantity_of_total, quantity_left);
		addingDataByQuery(query);
	}
	public static void insertSectionInDB(String section) throws ClassNotFoundException{
		String query = String.format("INSERT INTO libweb2.section (section) \n" +
	               " VALUES ('%s');", section);
		addingDataByQuery(query);
	}
	public static void insertPublishingHouseInDB(String title, String city){
		String query = String.format("INSERT INTO libweb2.publishing_house (title, city) \n" +
	               " VALUES ('%s', '%s');", title, city);
		try {
			addingDataByQuery(query);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    ////////////////////////////////
    
	
	
	
	
	
	public static void selectAuthor(){

		String query = "select id_author, name, surname, middle_name from libweb2.author";
		try {
		    con = DriverManager.getConnection(url, user, password);		// opening database connection to MySQL server
		    stmt = con.createStatement();	// getting Statement object to execute query
		    rs = stmt.executeQuery(query);

			while (rs.next()) {
			   int id = rs.getInt(1);
			   String name = rs.getString(2);
			   String surname = rs.getString(3);
			   String middle_name = rs.getString(4);
			   System.out.printf("id: %d, name: %s, surname: %s, middle_name: %s %n", id, name, surname, middle_name);
			 }
		} catch (SQLException sqlEx) {
		    sqlEx.printStackTrace();
		} finally {
		    try { con.close(); } catch(SQLException se) { /*can't do anything */ }
		    try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
		    try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
		}
		
    }
	
	
    
    
    /////////////////////////////////////////
    /*
    public static void main(String args[]) {
    	System.out.println("hello привет");
    	///insertAuthor("Имя3","Отчество","Фамилия");
    	insertUser("name1", "surname", "middle_name", "login", "email", 1, "password", 0, 0);
    	//insertBook("title2", "description2", 1, 1, 2001, 0, 0);
    	//insertSection("section2");
    	//insertPublishingHouse("title2", "city2");
    	System.out.println("hello2 привет2");
    	
    }
    //*/

}
