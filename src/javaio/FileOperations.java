package javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;
/**
 * 
 * @author panblo
 * 3 dic 2025
 */

public class FileOperations {
	public static void main(String[] args) {
		File file = new File("/logs/user.log");
		
		File directory = new File("/pablo/logs/");
		
		System.out.println("working directory : " + System.getProperty("user.dir"));
		
		
	
		
		createPath(directory);
		
		
		createFile(file);
		
		
		createAbsolutPath();
		
		writeFile();
		
		ReadFile();
		
	}
	
	private static void ReadFile() {
	     try {
			FileReader reader = new FileReader("log.txt");
			
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			
			
		 } catch (IOException e) {
			e.printStackTrace();
		 }
		
	}

	private static void writeFile() {
		try {
			FileWriter writer = new FileWriter("log.txt");
			writer.write("Black holes");
			writer.write("Pollas en vinagre");
			writer.write(4);
			//Close the writer and refresh the data to the file 
			writer.close();
			//Refresh data we have written to the file 
			//writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void createAbsolutPath() {
		//create directory using absolute path 
				File absoluteDir = new File(System.getProperty("user.dir") + "/logs/user.log");
				absoluteDir.mkdir();	
		
	}

	private static void createPath(File file) {
		System.out.println(file.isAbsolute());
		
		System.out.println(file.getPath());
		//create directories specified by the "file" object
		file.getParentFile().mkdirs();
		
		System.out.println(file.getAbsolutePath());
		
	}

	private static void createFile(File file) {
		
		if(file.exists()) {
			System.out.println("the log file exists");
		}
		else {
			System.out.println("the log file does not exist");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//With try catch, we can continue executing the program without interruption
			System.out.println("finished");
		}
	}
}
