package files.images.bitmap;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class BitmapFileReader {
	
	private RandomAccessFile ra;
	
	private BitmapFileHeader bfh;
	private BitmapInfoHeader bih;
	
	public BitmapFileReader() {
		this.bfh = new BitmapFileHeader();
		this.bih = new BitmapInfoHeader();
	}
	
	/**
	 * Reads an integer from a file with RandomAccessFile
	 * @param ra RandomAccessFile
	 * @return an integer little endian 
	 * @throws IOException
	 */
    public int readInt() throws IOException {
        int ch1 = this.ra.read();
        int ch2 = this.ra.read();
        int ch3 = this.ra.read();
        int ch4 = this.ra.read();
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
    public int readShort() throws IOException{
        int ch1 = this.ra.read();
        int ch2 = this.ra.read();
        if ((ch1 | ch2) < 0)
            throw new EOFException();
        return (short)((ch2 << 8) + (ch1 << 0));    	
    }
    
    public void read(byte[] signature) throws IOException{
    	this.ra.read(signature);
    }
    
    public static void main(String[] args) {
    	BitmapFileReader bfr = new BitmapFileReader();
    	bfr.readBitmapFile("art.bmp");
    	
    }
    
    
    public void readBitmapFile( String filename ) {
    	
    	try {
	    	this.ra = new RandomAccessFile(filename, "r");
	    	bfh.read(this);
	    	bih.read(this);
	    	
	    	this.ra.close();
    	}
    	catch( FileNotFoundException e ) {
    		System.err.println("Datei konnte nicht geoeffnet werden");
    	}    	
    	catch( IOException e ) {
    		System.err.println("Lesefehler");
   		
    	}
    	catch( NotABitmapFileException e ) {
    		System.err.println("Datei ist keine Bitmap Datei");
    	}
    	
    }

    

}
