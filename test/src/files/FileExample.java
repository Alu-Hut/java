package files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileExample {
	
	public static void readFromFile (  String filename ) {
		RandomAccessFile ra = null;
		
		try {
			ra = new RandomAccessFile(filename, "r");
			int value1 = ra.readInt();
			short value2 = ra.readShort();
			long value3 = ra.readLong();
			
			String value4 = ra.readUTF();
			
			System.out.println(value1);
			System.out.println(value2);
			System.out.println(value3);
			System.out.println(value4);
			
			ra.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		readFromFile( "banana.log");
		if(true)
		return;
		
		
		RandomAccessFile ra = null;
		try {
			ra = new RandomAccessFile("banana.log", "rw");
			ra.writeInt(21394567);
			ra.writeShort(234);
			ra.writeLong(123442334745L);
			ra.writeUTF("Hallo Welt");
			ra.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			
		} catch (IOException e) {
			
			System.err.println(e.getMessage());
		}
	}
}
