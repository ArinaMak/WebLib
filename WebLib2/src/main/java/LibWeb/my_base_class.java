package LibWeb;

// Что будет после нажатия кнопок из html

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
	
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibWeb", "root", "AcbD1324_");
    st = con.createStatement();
    //rs = st.executeQuery("SELECT idbook FROM biblio_father.book where biblio_father.book.bookname = 'Новая книга';");
 //   columns = rs.getMetaData().getColumnCount();
    
    
    
	} catch (SQLException e) {
    	System.out.println(e);
	       String message = e.getMessage();
	    }   
	}
	
	
}
