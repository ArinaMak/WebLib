package LibWeb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class my_base_class {

	
	ResultSet rs = null;
	ResultSet rs_book = null;
	Connection con = null;
	
	public Statement st = null;

	
	public my_base_class() 
	{
		my_connect();
	}
	
	public void my_connect()
	{
		try {
	
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibWeb", "root", "4444");
    st = con.createStatement();
    //rs = st.executeQuery("SELECT idbook FROM biblio_father.book where biblio_father.book.bookname = 'Новая книга';");
 //   columns = rs.getMetaData().getColumnCount();
    
    
    
	} catch (SQLException e) {
    	System.out.println(e);
	       String message = e.getMessage();
	    }   
	}
	
	
/*	public ResultSet RS(String sql) throws SQLException
	{
		rs = st.executeQuery(sql);
		
		return rs;
	}*/
	/*
	 //stmt.executeUpdate(sql);
	public String Update(String sql_update) throws SQLException
	{
		//st.executeUpdate(sql_update);
		try {
			st.executeUpdate(sql_update);
			return "ok";
		}catch (SQLException e1){
			return e1.toString();
		}
		
	}
	
	public String Insert_book_with_author(String book, String author1 ,String author2, String author3) throws SQLException
	{
		String ID_BOOK = "51";
		String sql_author1 = "";
		String sql_author2 = "";
		String sql_author3 = "";
		String sql_book = String.format("INSERT INTO `biblio_father`.`book` (`bookname`) VALUES ('%s');", book);
		String sql_id_book = String.format("SELECT biblio_father.book.idbook FROM biblio_father.book WHERE bookname = '%s' ORDER BY idbook DESC;", book);
		sql_author1 = String.format("INSERT INTO `biblio_father`.`autor` (`FIO`) VALUES ('%s');", author1);
		sql_author2 = String.format("INSERT INTO `biblio_father`.`autor` (`FIO`) VALUES ('%s');", author2);
		sql_author3 = String.format("INSERT INTO `biblio_father`.`autor` (`FIO`) VALUES ('%s');", author3);
		String sql_id_author1 = String.format("SELECT biblio_father.autor.idautor FROM `biblio_father`.`autor` WHERE `FIO` = '%s'", author1 );
	//	//st.executeUpdate(sql_update);
	//	System.out.println(sql_book);
		String sql_id_author2 = String.format("SELECT biblio_father.autor.idautor FROM `biblio_father`.`autor` WHERE `FIO` = '%s'", author2 );
		String sql_id_author3 = String.format("SELECT biblio_father.autor.idautor FROM `biblio_father`.`autor` WHERE `FIO` = '%s'", author3 );
		String ID_AUTOR = String.format("SELECT idautor FROM biblio_father.autor  WHERE FIO = '%s'", author1);
		//System.out.println(ID_AUTOR);
		//System.out.println(sql_id_author1);
		//System.out.println(author1);
		
		
		
		
		
		
		
		
		
		System.out.println("Stop");
		
		try {
			st.executeUpdate(sql_book);
			rs = st.executeQuery(sql_id_author1);
			
			
			//rs_book = st.executeQuery(sql_id_author1);
			rs = st.executeQuery(sql_id_book);
			//int columns = rs.getMetaData().getColumnCount();
			
			
			
			
			while(rs.next()){
		            int i = 1;
		                System.out.print(rs.getString(i) + "\t");
		                ID_BOOK = rs.getString(i);
		                System.out.print(ID_BOOK + " Yes&!");
		            System.out.println("stage");
		            break;
		        }
			
			//rs = st.executeQuery(sql_id_author1);
			
			//while(rs.next()){
	     //       int i = 1;
	   //             System.out.print(rs.getString(i) + "\t");
	     //           ID_BOOK = rs.getString(i);
	   //             System.out.print(ID_BOOK + " Yes&!");
	   //         System.out.println("stage");
	 //           break;
	   //     }
			
			
			String sql_finish1 = String.format("INSERT INTO biblio_father.autorinbook (idbook, idautor) \r\n"
					+ "SELECT '%s' as idbook, idautor FROM autor \r\n"
					+ "WHERE FIO = '%s';", ID_BOOK, author1 );
			
			String sql_finish2 = String.format("INSERT INTO biblio_father.autorinbook (idbook, idautor) \r\n"
					+ "SELECT '%s' as idbook, idautor FROM autor \r\n"
					+ "WHERE FIO = '%s';", ID_BOOK, author2 );
			
			
			String sql_finish3 = String.format("INSERT INTO biblio_father.autorinbook (idbook, idautor) \r\n"
					+ "SELECT '%s' as idbook, idautor FROM autor \r\n"
					+ "WHERE FIO = '%s';", ID_BOOK, author3 );
			
			System.out.println(sql_finish1);
			
			//System.out.println(rs);
			
			System.out.println("Update book");
		//	var id_book = st.executeQuery(sql_id_book);
			System.out.println("ID&!&!&");
			//System.out.println("id_book = " + id_book);

			st.executeUpdate(sql_author1);
			st.executeUpdate(sql_author2);
			st.executeUpdate(sql_author3);
			st.execute(sql_id_author1);
			System.out.println("COOL");
			st.executeUpdate(sql_finish1);
			st.executeUpdate(sql_finish2);
			st.executeUpdate(sql_finish3);
			
			System.out.println("COOL OUT");
			
			System.out.println("Update author");
		//	var id_author1 = st.executeUpdate(sql_id_author);
			//System.out.println("id_author1 = " + id_author1);
			return "ok";
		}catch (SQLException e1){
			return e1.toString();
		}
		
	}*/
}
