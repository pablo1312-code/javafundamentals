package javaio;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Write and binary to and from a file
 * @author panblo
 * 15 ene 2026
 */

public class BinaryDataOperations {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		writeBinaryData();
		readBinaryData();
		
		//Avariable with null initialization
		//DataOutputStream os = null ;
		
		
		
try (DataOutputStream os =
new DataOutputStream(new FileOutputStream("hola.txt"));){
	
	os.writeChar(01);
	os.writeInt(10);
	os.writeUTF("Pablo is MARICON");

//os.close();
} catch (Exception e) {
	
	e.printStackTrace();
	
   }

  }

	private static void readBinaryData() throws FileNotFoundException {
		DataInputStream is = new DataInputStream(new FileInputStream("hola.txt"));
		try {
			is.readChar();
			is.readUTF();
			System.out.println(is.readUTF());
			is.readInt();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	private static void writeBinaryData() {
		
	}
	
}
