package files.images;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

//
// Standard 
// http://www.ece.ualberta.ca/~elliott/ee552/studentAppNotes/2003_w/misc/bmp_file_format/bmp_file_format.htm
//
public class BitmapExample {
	
	/**
	 * Reads an integer from a file with RandomAccessFile
	 * @param ra RandomAccessFile
	 * @return an integer little endian 
	 * @throws IOException
	 */
    public static int readInt(RandomAccessFile ra) throws IOException {
        int ch1 = ra.read();
        int ch2 = ra.read();
        int ch3 = ra.read();
        int ch4 = ra.read();
        if ((ch1 | ch2 | ch3 | ch4) < 0)
            throw new EOFException();
        return ((ch4 << 24) + (ch3 << 16) + (ch2 << 8) + (ch1 << 0));
    }
    
    /**
     * Reads a short value from file with RandomAccessFile
     * @param ra
     * @return short value in little endian
     * @throws IOException
     */
    public static int readShort(RandomAccessFile ra) throws IOException{
        int ch1 = ra.read();
        int ch2 = ra.read();
        if ((ch1 | ch2) < 0)
            throw new EOFException();
        return (short)((ch2 << 8) + (ch1 << 0));    	
    }
    

	public static void main(String[] args) {
		RandomAccessFile ra = null;
		
		try {
			byte[] signature = new byte[2];
			
			//
			// create object, open "art.bmp" file for reading
			//
		
			ra = new RandomAccessFile("art.bmp", "r");
			
			//
			// reads two bytes
			//
			ra.read(signature);
			
			//
			// check file header "BM"
			//
			if( signature[0] == 'B' && signature[1] == 'M') {
				
				//
				// move file pointer to position 0x12 (width & height)
				//
				ra.seek( 0x12 );
				
				int width = readInt(ra);
				
				// nicht notwendig, wir befinden uns schon am Offset 0x16
				//ra.seek( 0x16 );
				int height = readInt(ra);
				
				//
				// move file pointer to position 0x1c (bits per pixel)
				//
				ra.seek(0x1c );
				int bitsPerPixel = readShort(ra);
				
				//
				// print values to console
				//
				System.out.println(width);
				System.out.println(height);
				System.out.println(bitsPerPixel);
			
			}
			else {
				System.err.println("Diese Datei entspricht nicht dem BMP Dateiformat");
			
			}
			
			ra.close();
			
			
		}
		catch( FileNotFoundException e ) {
			System.err.println("Datei konnte nicht gefunden werden");
		}
		catch( IOException e ) {
			System.err.println("Fehler beim Lesen der Datei");	
		}

	}

}
