package files.images.bitmap;

import java.io.IOException;

public class BitmapInfoHeader {
	private int size;
	private int width;
	private int height;
	private short planes;
	private short bpp;
	private int compression;
	private int imageSize;
	private int xppm;
	private int yppm;
	private int colorsUsed;
	private int importantColors;
	
	public void read( BitmapFileReader bfr ) throws IOException {
		this.size = bfr.readInt();
		this.width = bfr.readInt();
		this.height = bfr.readInt();
		
		this.planes = (short)bfr.readShort();
		this.bpp = (short)bfr.readShort();
		
		this.compression = bfr.readInt();
		this.imageSize = bfr.readInt();
		
		this.xppm = bfr.readInt();
		this.yppm = bfr.readInt();

		this.colorsUsed = bfr.readInt();
		this.importantColors = bfr.readInt();
		
	}

}
