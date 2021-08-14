package activities;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\PriyankaKhurana\\Documents\\first3.txt");
		boolean fStatus = file.createNewFile();
		if(fStatus==true) {
			System.out.println("File is created");
		}else {
			System.out.println("error in creating file");
		}
		
		//get the file Object
		File fileUtil = FileUtils.getFile("C:\\Users\\PriyankaKhurana\\Documents\\first3.txt");
		//Read file
		System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));
		
		PrintWriter out = new PrintWriter("C:\\Users\\PriyankaKhurana\\Documents\\first3.txt"); // Step 2

        // Write the name of four oceans to the file
        out.println("Atlantic");   // Step 3
        out.println("Pacific");
        out.println("Indian");
        out.println("Arctic");

        // Close the file.
        out.close(); 
		
		//Create directory
		File destDir = new File("C:\\Users\\PriyankaKhurana\\eclipse-workspace\\Java\\resources");
		//Copy file to directory
		FileUtils.copyFileToDirectory(file, destDir);
		
		//Get file from new directory
		File newFile = FileUtils.getFile(destDir, "first3.txt");
		//Read data from file
		String newFileData = FileUtils.readFileToString(newFile, "UTF8");
		
		System.out.println("Data in new file: " +newFileData);
		
	}

}
