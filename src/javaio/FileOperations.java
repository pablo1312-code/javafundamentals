package javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
		
		bufferedWriter();
		
	}
	
	private static void bufferedWriter() {
		try {
			BufferedWriter writer = 
					new BufferedWriter(new FileWriter("contacts.txt"));
			writer.write("manolo" + ";" + "manu@G");
			writer.newLine();
			writer.write("Pablo" + ";" + "pab@G");
			writer.newLine();
			writer.write("Carlos" + ";" + "pab@G");
			writer.newLine();
			//writer.flush();
			writer.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}
	
	private static void bufferedReader() {
		try {
			System.out.println();
			System.out.println("buffered reader");
			//Wrap an instance of @link{FileREader} in an instance of @link{BufferedReader}
			//so we can manipulate the data in another way in our case 
			//reading the data line by line 
			BufferedReader br=
					new BufferedReader(new FileReader("contacts.txt"));
			//read a line from the file
			//System.out.println(br.readLine());
			String data;
			do {
				//define what we want to do 
				//read a line 
			    data = br.readLine();
				System.out.println(data);	
			}
			while(data != null);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
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
