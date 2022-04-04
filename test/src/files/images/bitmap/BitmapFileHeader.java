package files.images.bitmap;

import java.io.IOException;

public class BitmapFileHeader {
	private byte[] signature;
	private int fileSize;
	private int reserved;
	private int dataOffset;

	
	public BitmapFileHeader() {
		super();
		this.signature = new byte[2];
	}
	
	public void read( BitmapFileReader bfr ) throws IOException{
		bfr.read( this.signature );
		
		if( !(this.signature[0] == 'B' && this.signature[1] == 'M')) {
			throw new NotABitmapFileException();
		}
		
		this.fileSize = bfr.readInt();
		this.reserved = bfr.readInt();
		this.dataOffset = bfr.readInt();
	}
	
	
}
