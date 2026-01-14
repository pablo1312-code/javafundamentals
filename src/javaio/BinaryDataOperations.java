package javaio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 
 * @author panblo
 * 14 ene 2026
 */
public class BinaryDataOperations {
	
	public static void main(String[] args) {
		writeBinaryData();
		readBinaryData();
		
	
	}
	
	private static void writeBinaryData() {
		//A variable with null initialization
		//DataOutputStream os = null;
		
		try (DataOutputStream os =
				new DataOutputStream(new FileOutputStream("data.bat"));){
		
		
		os.writeChar(25);
		os.writeInt(32);
		os.writeUTF("Pablo is playing");
		
		//os.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	private static void readBinaryData() {
		DataInputStream is = new DataInputStream("");
		try {
			is.readChar();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			is.readInt();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			is.readUTF();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}

}
