package com.researchit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.researchit.common.DBBaseObject;


public class Image extends DBBaseObject {

	private String id = "";
	private String description = "";
	private String fileName = "";
	private String fileSize = "";
	private String fileType = "";
	private Blob imageData = null;
	
	public Image() {
		super();
	}	
	public Image(String fileName, String fileType) throws Exception {
		super();
		if (!fileName.equals("")) {
			this.setFileName(fileName);
			this.setFileType(fileType);
			this.getPersistentObject();
		}
	}
	protected void getPersistentObject() throws Exception {
		String strSQL = "SELECT id, description, filename, filesize, filetype, image_data FROM images WHERE filename = '"
				+ this.getFileName() + "' AND filetype = '" + this.getFileType() + "'";
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setDescription(rs.getString("description"));
					this.setFileName(rs.getString("filename"));
					this.setFileSize(rs.getString("filesize"));
					this.setFileType(rs.getString("filetype"));
					this.setImageData(rs.getBlob("image_data"));
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Blob getImageData() {
		return imageData;
	}
	public void setImageData(Blob imageData) {
		this.imageData = imageData;
	}
	public InputStream getImageStream() throws IOException{
		InputStream is = null;
		try {
			is = getImageData().getBinaryStream();
		}
		catch (Exception e) {
			is.close();
		}
		return is;
	}
	public void deleteAllImages() throws Exception {
		String strSQL = "DELETE FROM images";
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public void insertImagesToDB(String imageFolder) throws Exception{
		File directory = new File(imageFolder);
        String[] files = directory.list();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                String filename = files[i];
                File file = new File(imageFolder + "\\" + filename);              
                if (file.exists()) {
                    if (file.canRead()) {       
                        if (!file.isDirectory()) {
                        	String fname = filename.substring(0,filename.lastIndexOf("."));
                            String ftype = filename.substring(filename.lastIndexOf(".")+1);
                            java.sql.PreparedStatement pst;
                    		InputStream is = new FileInputStream(file);
                            try {
                            	this.connect();         
                                String sql = "INSERT INTO images (filename, image_data, filetype) VALUES(?,?,?)";
                                pst = this.connection.prepareStatement(sql);
                                pst.setString(1,fname);
                                pst.setBinaryStream(2, is,(int)file.length());
                        		pst.setString(3, ftype);                 		
                                pst.execute();
                                pst.close();     
                            } finally {
                                closeConnection();
                            }  
                            is.close();
                        }
                    }
                }
            }
        }		
	}
	
    public void save() throws Exception {
    }
}
