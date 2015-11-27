/**
 * 
 */
package com.researchit.common;

// import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * @author Troy Sadkowsky
 * 
 */
public class DBBaseObject {

	protected String id = "";
	//protected String username = "";
	protected String name = "";
	protected String description = "";
//	protected String password = "p0puh0m3";
 //   protected String databaseURL = "jdbc/RITOStudyManager";
 //   protected String databaseURL = "jdbc/OccIDEASDB"

	public Connection connection = null;
	//public Connection conn = null;
	protected Connection connectionTracker = null;
	protected Statement statement = null;
	protected ResultSet resultSet = null;
	protected String connection_string;

	public static final int MAX_DEC = 4;
    private Map<String, String> warnings;

	public DBBaseObject() {
	}

	public DBBaseObject(String id) {
		setId(id);
	}

	public String getId() {
		if (this.id == null) {
			this.id = "";
		}
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<String, String> getWarnings() {
        if(this.warnings==null){
            this.warnings = new HashMap<String,String>();
        }
        return warnings;
    }

    /**
     * @param warnings
     *            The warnings to set.
     */
    public void setWarnings(Map<String, String> warnings) {
        this.warnings = warnings;
    }
    
//	protected void setPassword(String password) {
//		this.password = password;
//	}
//
//	protected String getUsername() {
//		return username;
//	}
//
//	protected void setUsername(String username) {
//		this.username = username;
//	}

	protected Connection getConnection() {
		return connection;
	}

	protected void setConnection(Connection connection) {
		this.connection = connection;
	}

	public Connection connect() throws Exception {
        // Obtain our environment naming context
        Context initCtx = new InitialContext();
        
        // Look up our data source
		try {
			DataSource ds = (DataSource) initCtx.lookup("java:comp/env/" + "jdbc/RITOStudyManager");
//			 Allocate and use a connection from the pool
	        if (connection==null || connection.isClosed()) {
	            this.connection = ds.getConnection();
	        }
		} catch (NamingException e) {
			e.printStackTrace();
		}
        
        
        
		return connection;
	}

	public void closeConnection() {
        try {
    		if (connection != null && !connection.isClosed()) {
    			connection.close(); /* close the connection */
    		}
        } catch (SQLException e) {
        	//To Do
        }
	}

	protected void closeStatement() throws Exception {
		if (this.statement != null) {
			this.statement.close();
		} else {
			//To Do warning: There is no valid Statement to close!");
		}
	}

	public Statement getStatement() throws Exception {
		if (this.connection != null) {
			this.statement = connection.createStatement();
		}else{
//			To Do deal with Warning: connection is null!");
		}
		return this.statement;
	}

	public ResultSet executeQuery(String query) throws Exception {
		if (this.statement != null) {
			resultSet = (ResultSet) this.getStatement().executeQuery(query);
		} else {
			//To Do Warning: statement is null!");
		}

		return resultSet;
	}

	protected int insertUpdate(String query) throws Exception {
		int rows = 0; /* the number of rows affected with the update */
		if (this.statement != null) {
			rows = this.statement.executeUpdate(query);			
			this.closeStatement();
		} else {
			//To Do Warning: statement is null!");
		}

		return rows;

	}

	// runs an insert query passed in as the string then sets the auto id of the
	// last inserted id
	protected void insertQuery(String query) throws Exception {
		if (this.statement != null) {
			this.statement.executeUpdate(query);
			
			// get last inserted id
			ResultSet rs = this.statement.getGeneratedKeys();
			if (rs != null && rs.next()) {
				setId(rs.getString(1));
			} else {
				throw new Exception("Couldn't get generated ID");
			}
			this.closeStatement();
		} else {
			//To Do Deal with statement error
		}
	}


	protected ResultSet getResultSet() {
		return this.resultSet;
	}

	protected void setResultSet(ResultSet resultSet) {
		this.resultSet = resultSet;
	}

	protected void setStatement(Statement statement) {
		this.statement = statement;
	}

	/**
	 * Check whether a record currently exists
	 * 
	 */
	public boolean recordExists(String query) throws Exception {
		/* initialise result set to null */
		resultSet = null;
		boolean exists = false;
        try {
    		connect();
    		getStatement();
    		resultSet = this.executeQuery(query);
            if (resultSet.next()) {
                // get the id so that we can use the id for other purposes
                this.setId(resultSet.getString("id"));
                exists = true;
            }
    		this.closeStatement();
        } finally {
    		this.closeConnection();
        }
		return exists;
	}

	//public abstract void save() throws Exception;

//	public String getDatabaseURL() {
//		return databaseURL;
//	}
//
//	public void setDatabaseURL(String databaseURL) {
//		this.databaseURL = databaseURL;
//	}
	protected void sqlInsertQuery(String query) throws Exception {	
		try{
			this.connect();
			Statement statement = this.getStatement();
			statement.executeUpdate(query);	
			// get last inserted id
			ResultSet rs = this.statement.getGeneratedKeys();
			if (rs != null && rs.next()) {
				setId(rs.getString(1));
			} else {
				// TODO deal with error
				throw new Exception("Couldn't get generated ID");
			}
			statement.close();
		}catch(Exception ex){
			throw new Exception("Critical Database problem "+ex.getMessage());
		}finally{
			this.closeConnection();
		}
		
	}
	protected void sqlUpdateQuery(String query) throws Exception {	
		try{
			this.connect();
			Statement statement = this.getStatement();
			statement.executeUpdate(query);		
			statement.close();
		}catch(Exception ex){
			throw new Exception("Critical Database problem "+ex.getMessage());
		}finally{
			this.closeConnection();
		}
		
	}
	//Occideas stuff
    public ResultSet sqlExecuteSelect(String sql) throws Exception {

        Statement stmt = null;
        ResultSet rs = null;
        try {
            this.connect();
            stmt = this.connection.createStatement();
            if(this.connection.getMetaData().getDriverName().contains("MySQL")){
            	sql = sql.replaceAll("GETDATE","NOW");
            	sql = sql.replaceAll("SET DATEFORMAT dmy;","");
            }
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            if(ex.getSQLState().equalsIgnoreCase("08S01")){
            	try {
	            	this.connection.close();
	            	this.connect();
	            	stmt = this.connection.createStatement();
	            	rs = stmt.executeQuery(sql);
            	} catch (Exception e1){
            		//To Do deal with connection exception
            	}
            }else{
            	throw new Exception(ex.getMessage());
            }          
        }
        return rs;
    }
    public ResultSet sqlExecuteSelect(String sql,Connection openConn) throws Exception {
        Statement stmt = null;
        ResultSet rs = null;
        try {
        	if(openConn==null){
        		this.connect();
        	}else if(openConn.isClosed()){
        		this.connect();
        	}else{
        		this.connection = openConn;
        	}
            stmt = this.connection.createStatement();
            if(this.connection.getMetaData().getDriverName().contains("MySQL")){
            	sql = sql.replaceAll("GETDATE","NOW");
            	sql = sql.replaceAll("SET DATEFORMAT dmy;","");
            }
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        }
        return rs;
    }
	protected String escapeSpecialCharacters(Object value) {
		String retValue = "";
		if(value==null){
			retValue = "NULL";
		} else if(value.getClass()==String.class){
			if((value==null)||(((String)value).equalsIgnoreCase(""))){
				retValue = "NULL";
			}else{
				retValue = ((String)value).replace("'","''");
				retValue = retValue.replace("\"","''");
			}		
		}else if(value.getClass()==Integer.class){
			if(((Integer)value == -1)||((Integer)value == 0)){
				retValue = "NULL";
			}
		}
		
		return retValue;
	}
    public void sqlExecuteUpdate(String sql) throws Exception {
    	this.sqlExecuteUpdate(sql,null);
    }
    public void sqlExecuteUpdate(String sql,Connection conn) throws Exception {
        Statement stmt = null;
        try {
        	if(conn==null){
        		this.connect();
        	}else if(conn.isClosed()){
        		this.connect();
        	}else{
        		this.connection = conn;
        	}
            stmt = this.connection.createStatement();
            if(this.connection.getMetaData().getDriverName().contains("MySQL")){
//            	if(!sql.contains("[free text")){
//            		if(!sql.contains("[number")){
//            			sql = sql.replaceAll("\\[","");
//                    	sql = sql.replaceAll("\\]","");
//            		}
//            	}          	
            	sql = sql.replaceAll("GETDATE","NOW");
            	sql = sql.replaceAll("SET DATEFORMAT dmy;","");
            }
            
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (SQLException ex) {
            throw new Exception("sqlExecuteUpdate " + ex.getMessage());
        } finally {
            this.closeConnection();
        }

    }
    public Long sqlExecuteInsert(String sql) throws Exception {
    	return this.sqlExecuteInsert(sql,null);
    }
    public Long sqlExecuteInsert(String sql,Connection openConn) throws Exception {
        Statement stmt = null;
        Long iRetValue;
        iRetValue = Long.valueOf(-1);
        ResultSet rs = null;
        try {
        	if(openConn==null){
        		this.connect();
        	}else if(openConn.isClosed()){
        		this.connect();
        	}else{
        		this.connection = openConn;
        	}
            this.connection.setAutoCommit(false);
            stmt = connection.createStatement();
            if(this.connection.getMetaData().getDriverName().contains("MySQL")){
//            	if(!sql.contains("[free text")){
//            		if(!sql.contains("[number")){
//            			sql = sql.replaceAll("\\[","");
//                    	sql = sql.replaceAll("\\]","");
//            		}
//            	}   
            	sql = sql.replaceAll("GETDATE","NOW");
            	sql = sql.replaceAll("SET DATEFORMAT dmy;","");
           }
            stmt.executeUpdate(sql);
            if (stmt.execute("SELECT @@IDENTITY")) {
                rs = (ResultSet) stmt.getResultSet();
                if (rs.next()) {
                    iRetValue = Long.valueOf(rs.getLong(1));
                }
                if (rs.getStatement() != null) {
                    rs.getStatement().close();
                }
                rs.close();
            }
            this.connection.commit();
            stmt.close();
            this.connection.setAutoCommit(false);
        } catch (SQLException ex) {
            throw new Exception("sqlExecuteUpdate " + ex.getMessage());
        } finally {
            this.closeConnection();
        }
        return iRetValue;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
    	if(this.description == null){
    		description = "&lt;not set&gt;";
    	}else if (this.description.equalsIgnoreCase("null")) {
    		description = "&lt;not set&gt;";
    	}else if (this.description.equalsIgnoreCase("")) {
    		description = "&lt;not set&gt;";
    	}
    	return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Long sqlExecuteInsertExport(String sql,Connection openConn) throws Exception {
        Statement stmt = null;
        Long iRetValue;
        iRetValue = Long.valueOf(-1);
        ResultSet rs = null;
        try {
        	if(openConn==null){
        		this.connect();
        	}else if(openConn.isClosed()){
        		this.connect();
        	}else{
        		this.connection = openConn;
        	}
            this.connection.setAutoCommit(false);
            stmt = connection.createStatement();          
            stmt.executeUpdate(sql);
            if (stmt.execute("SELECT @@IDENTITY")) {
                rs = (ResultSet) stmt.getResultSet();
                if (rs.next()) {
                    iRetValue = Long.valueOf(rs.getLong(1));
                }
                if (rs.getStatement() != null) {
                    rs.getStatement().close();
                }
                rs.close();
            }
            stmt.close();
        } catch (SQLException ex) {
            throw new Exception("sqlExecuteUpdate " + ex.getMessage());
        } 
        return iRetValue;
    }
	public ArrayList<DBBaseObject> convertTODBObjects(ArrayList array) {
		ArrayList<DBBaseObject> retValue = new ArrayList<DBBaseObject>();
		for(Iterator it = array.iterator();it.hasNext();){
			retValue.add((DBBaseObject)it.next());
		}
		return retValue;
	}
	@Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if (obj != null) {
            if (obj.getClass() == this.getClass()) {
                if (((DBBaseObject) obj).getId().equalsIgnoreCase(this.getId())) {
                    isEqual = true;
                }
            }
        }
        return isEqual;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
