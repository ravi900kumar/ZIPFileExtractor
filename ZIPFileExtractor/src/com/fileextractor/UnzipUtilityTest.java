package com.fileextractor;

public class UnzipUtilityTest {

	public static void main(String[] args) {
		String zipFilePath = "G:/rar/Changes.zip";
        String destDirectory = "G:/rar/extract/";
        UnzipUtility unzipper = new UnzipUtility();
        try {
            unzipper.unzip(zipFilePath, destDirectory);
            System.out.println("extract");
        } catch (Exception ex) {
          
            ex.printStackTrace();
        }

	}

}
