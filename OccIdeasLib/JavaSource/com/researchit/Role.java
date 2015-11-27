/**
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 *     Revision 1.11  2008/08/25 01:37:23  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.10  2008/07/31 01:56:58  ray.welburn
 *     MainDB removed
 *
 *     Revision 1.9  2008/07/24 01:57:11  ray.welburn
 *     Allow add studymgrlogin to user/role
 *
 *     Revision 1.8  2008/07/08 11:46:48  ray.welburn
 *     Rolepermissions update causes database corruption
 *
 *     Revision 1.7  2008/07/05 03:29:09  troy.sadkowsky
 *     removed square brackets
 *
 *     Revision 1.6  2008/05/26 08:22:02  troy.sadkowsky
 *     Removed old code
 *
 *     Revision 1.5  2007/08/19 03:40:58  troy.sadkowsky
 *     check if roles exists and an ismysql function
 *
 *     Revision 1.4  2007/04/18 02:46:21  jeff.keys
 *     Role associations and edit role permissions
 *
 *     Revision 1.3  2007/04/12 11:06:33  jeff.keys
 *     breadcrumbs
 *
 *     Revision 1.2  2007/03/15 13:46:37  jeff.keys
 *     Questionnaire Roles Tab
 *
 *     Revision 1.1  2007/03/14 02:59:52  Troy.Sadkowsky
 *     modifications for showing user roles and setting a user a roleid
 *
 *     Revision 1.18  2007/03/13 14:57:56  jeff.keys
 *     Questionnaire User Roles
 *
 *     Revision 1.17  2007/03/12 02:44:41  Troy.Sadkowsky
 *     update save permission
 *
 *     Revision 1.16  2007/03/11 07:37:34  jeff.keys
 *     Questionnaire User Roles
 *
 *     Revision 1.15  2007/03/09 06:43:25  jeff.keys
 *     Questionnaire User Roles
 *
 *     Revision 1.14  2007/03/08 23:23:15  jeff.keys
 *     User Permission Admin Form
 *
 *     Revision 1.13  2007/03/06 04:41:53  troy.sadkowsky
 *     user permissions
 *
 *     Revision 1.12  2007/02/28 13:06:07  Troy.Sadkowsky
 *     new admin import template jsms function
 *
 *     Revision 1.11  2007/02/28 12:04:00  Troy.Sadkowsky
 *     first phase of roles and permissions
 *
 *     Revision 1.10  2007/02/28 05:28:26  Troy.Sadkowsky
 *     build v1.16 updates
 *
 *     Revision 1.9  2007/02/28 00:31:02  troy.sadkowsky
 *     rett syndrom requirements of new login
 *
 *     Revision 1.8  2007/02/25 23:15:25  troy.sadkowsky
 *     rules are now study specific
 *
 *     Revision 1.7  2007/02/18 11:07:16  troy
 *     new dynamic rule creation
 *
 *     Revision 1.6  2007/01/29 07:40:20  Jeff
 *     Removing commented out code
 *
 *     Revision 1.5  2006/11/03 07:24:54  admin
 *     changed question types
 *
 *     Revision 1.4  2006/10/31 21:09:27  admin
 *     build v1.08
 *
 *     Revision 1.3  2006/06/28 08:30:31  administrator
 *     updates for rework
 *
 *     Revision 1.2  2006/06/12 04:10:02  administrator
 *     restructure progress
 *
 *     Revision 1.1  2006/06/07 07:07:27  administrator
 *     updates for rework
 *
 *     Revision 1.2  2006/05/26 06:57:37  administrator
 *     updates for rework
 *
 *     Revision 1.1  2006/05/22 06:06:01  administrator
 *     Version 2
 *
 *     Revision 1.7  2006/03/29 02:25:53  administrator
 *     updates for exposure assessment
 *
 *     Revision 1.6  2006/03/02 23:19:34  administrator
 *     changed objects to throw excpetions not throwables
 *
 *     Revision 1.5  2006/02/24 06:28:49  administrator
 *     attempt to fix connection bug
 *
 *     Revision 1.4  2006/02/23 07:11:59  administrator
 *     attempt to fix connection bug
 *
 *     Revision 1.3  2006/02/16 22:44:06  administrator
 *     new connection pool
 *
 *     Revision 1.2  2005/12/13 23:42:15  administrator
 *     updates for jobhistory import
 *
 *     Revision 1.1  2005/11/16 05:28:39  administrator
 *     new library to share amongst mql, ims and ams
 *
 *     Revision 1.4  2005/10/21 07:00:25  administrator
 *     tidy up code and new servlet to act as main controller
 *
 *     Revision 1.3  2005/10/21 03:58:17  administrator
 *     user logins and permissions
 *
 *     Revision 1.2  2005/10/20 05:48:54  administrator
 *     Login functions
 *
 *     Revision 1.1  2005/08/04 23:52:26  administrator
 *     Rules
 *
 *     
 */
package com.researchit;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.researchit.common.DBBaseObject;

public class Role extends DBBaseObject {
  
	private ArrayList<User.Permission> permissions;
	
    public Role() {
        super();
    }   
    public Role(String roleId) throws Exception {
    	super();
    	this.setId(roleId);
    	getPersistentObject();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }   
    public void savePermissions(ArrayList<User.Permission> ups) throws Exception {
    	this.deletePermissions();
    	//if(!this.hasPermission(p)){
    	//	this.insertPermission(p);
    	//}
//	    String insertQuery = "INSERT rolepermissions (roleId, permissionId)  " +
//	    		" SELECT roles.id,permissions.id FROM permissions INNER JOIN roles " +
//	    		"	ON roles.id = "+this.getId()+" AND permissions.name = '"+p.toString()+"'  ";
    	try {
    	for (User.Permission p : ups ) {
    	String insertQuery = "INSERT INTO rolepermissions (roleid, permissionid) VALUES(" + this.getId()+ ", (SELECT id FROM permissions where name = '" + p.toString() + "'))";
	        this.sqlExecuteUpdate(insertQuery);
    	}
	    } catch (Exception e) {
	        throw new Exception(e.getMessage());
	    } finally {
	          this.closeConnection();
	    }   	
    }   
//    private void insertPermission(Permission p) throws Exception {
//	    String insertQuery = "INSERT permissions (name) VALUES ('"+p.toString()+"')  ";	    			
//        this.sqlExecuteUpdate(insertQuery);		
	//}  
    public void deletePermissions()throws Exception {
    	if(permissionCount() > 0) {
    		String deleteQuery = "DELETE FROM rolepermissions WHERE roleid = " + getId();   
    		try {
    			sqlExecuteUpdate(deleteQuery);
    		}
		    catch (Exception e) {
		        throw new Exception(e.getMessage());
		    } finally {
		          closeConnection();
		    }   	
    	}
    }   
    public int permissionCount() throws Exception {
 	   int returnVal = 0;	   
 		String sql = "SELECT COUNT(*)AS _count FROM rolepermissions WHERE roleid = " + getId();	    
 		try {
 			ResultSet rs = sqlExecuteSelect(sql);
 			if(rs != null) {
 				if (rs.next()) {
 					returnVal = Integer.parseInt(rs.getString("_count").toString());
 				}
 			}
 		}
 	    catch (Exception e) {
 	        throw new Exception(e.getMessage());
 	    } finally {
 	          closeConnection();
 	    }   	
 	    return returnVal;
    }   
    public ArrayList<User.Permission> getPermissions() throws Exception {
    	if (permissions == null) {
    		permissions = new ArrayList<User.Permission>();
    		String strSQL = " SELECT p.name "
					+ " FROM permissions p " 
					+ " INNER JOIN rolepermissions rp "
					+ " ON p.id = rp.permissionid "
					+ " WHERE rp.roleid = " + getId();
    		ResultSet rs = null;
    		try {
    			rs = this.sqlExecuteSelect(strSQL);
    			User.Permission p;
    			while(rs.next()) {
    				try {
						p = User.Permission.valueOf(rs.getString("name"));
						permissions.add(p);
					} catch (RuntimeException e) {
						// Permission must not exist anymore so ignore
						e.printStackTrace();
					}    				
    			}
    			rs.close();
    		} catch (Exception e) {
    			throw new Exception(e.getMessage());
    		} 
    		finally {
    			this.closeConnection();
    		}
    	}
    	return permissions;
    }    
    public ArrayList<Role> getAllRoles() throws Exception {
		ArrayList<Role> retValue = new ArrayList<Role>();
		String strSQL = "SELECT id,name FROM roles ";
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					Role role = new Role();
					role.setId(rs.getString("id"));
					role.setName(rs.getString("name"));
					retValue.add(role);
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
		return retValue;
	}	
	public boolean  hasPermission(User.Permission p) throws Exception{
		boolean retValue = false;
		ArrayList<User.Permission> rolePermissions = getPermissions();
		for(User.Permission rp: rolePermissions) {
			retValue |= (p.toString().compareTo(rp.toString()) == 0);
		}
		return retValue;
	}	
	protected void getPersistentObject() throws Exception {
		String strSQL = "SELECT id, name, description FROM roles WHERE id = "
				+ this.getId();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setName(rs.getString("name"));
					this.setDescription(rs.getString("description"));
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	
    public void save() throws Exception {
    }
}



