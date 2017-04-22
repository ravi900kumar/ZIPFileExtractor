package com.fileextractor;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
public class UnzipController extends ActionSupport {
	private File userImage;  
    private String userImageContentType;  
    private String userImageFileName;  
    private String beforezip;
    private String afterzip;
	public String execute() {
        System.out.println("extract");
        
       try {
    	     beforezip = ServletActionContext.getServletContext().getRealPath("/").concat("beforezip").concat("\\");  
    	     afterzip = ServletActionContext.getServletContext().getRealPath("/").concat("afterzip").concat("\\");  
           
           System.out.println("Image Location:" + beforezip);//see the server console for actual location  
           File fileToCreate = new File(beforezip,userImageFileName);  
           FileUtils.copyFile(userImage, fileToCreate);//copying source file to new file  
           UnzipUtility unzipper = new UnzipUtility();
           	
             beforezip= beforezip+userImageFileName;
        System.out.println(beforezip);
        System.out.println(afterzip);
            unzipper.unzip(beforezip, afterzip);

	} catch (Exception e) {
	  
	}
        
        return SUCCESS;
		
	}
	public File getUserImage() {
		return userImage;
	}
	public void setUserImage(File userImage) {
		this.userImage = userImage;
	}
	public String getUserImageContentType() {
		return userImageContentType;
	}
	public void setUserImageContentType(String userImageContentType) {
		this.userImageContentType = userImageContentType;
	}
	public String getUserImageFileName() {
		return userImageFileName;
	}
	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
	}
	public String getBeforezip() {
		return beforezip;
	}
	public void setBeforezip(String beforezip) {
		this.beforezip = beforezip;
	}
	public String getAfterzip() {
		return afterzip;
	}
	public void setAfterzip(String afterzip) {
		this.afterzip = afterzip;
	}
	
	
}
