/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.*;

/**
 *
 * @author Escalante
 */
public class Conexion {
    
    private Connection con=null;
	private static Conexion db;
	private Statement statement;
	
	// private String url= "jdbc:mysql://localhost:3306/";
        
    private String url= "andrew.mi.com.co:2083/cpsess3199279067/3rdparty/phpMyAdmin/db_structure.php?server=1&db=usinsych_sinsy";
    private String dbName = "sinsy";
    private String driver = "com.mysql.jdbc.Driver";
    private String userName = "root";
    private String password = "";
    
    
    
    public String getDriver(){
    	
    	return this.url+""+this.dbName+""+this.userName+""+this.password;
    }
    
    

	public Connection getCon() {
		return con;
	}



	public void setCon(Connection con) {
		this.con = con;
	}



	public static Conexion getDb() {
		return db;
	}



	public static void setDb(Conexion db) {
		Conexion.db = db;
	}



	public Statement getStatement() {
		return statement;
	}



	public void setStatement(Statement statement) {
		this.statement = statement;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getDbName() {
		return dbName;
	}



	public void setDbName(String dbName) {
		this.dbName = dbName;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public void setDriver(String driver) {
		this.driver = driver;
	}



	public Conexion() {
		try {
			Class.forName(driver).newInstance();
			con = (Connection)DriverManager.getConnection(url+dbName,userName,password);
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	public static Conexion getConexion(){
		if ( db == null ) {
            db = new Conexion();
        }
		return db;
	}
 
	public void cerrarConexion(){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet query(String query) throws SQLException{
        statement = db.con.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }
		
	public int insert(String insertQuery) throws SQLException {
        statement = db.con.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;
 
    }
	
        
       
	public static void main(String args[]){
		 System.out.println(Conexion.getConexion());
                 System.out.println(Conexion.getDb());
                 System.out.println(Conexion.db.getDriver());
		
	}
        /**  */
    
}
