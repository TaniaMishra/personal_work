package examReview;

public class AlterImage {
	public AlterImage() {
		
	}
	
	public Pixel[][] generatePixelArray(int[][] reds, int[][] greens, int[][] blues) {
		if (reds.length == greens.length && greens.length == blues.length) {
			if (reds[0].length == greens[0].length && greens[0].length == blues[0].length) {
				Pixel[][] pix = new Pixel[reds.length][reds[0].length];
				for (int i = 0; i < reds.length; i++) {
					for (int k = 0; k < reds[0].length; k++) {
						pix[i][k] = new Pixel(reds[i][k], greens[i][k], blues[i][k]);
					}
				}
				return pix;
			}
		}
		else {
			Pixel[][] emptyPix = new Pixel[1][1];
			return emptyPix;
		}
	}
	public Pixel[][] flipImage(Pixel[][] image, boolean horiz) {
		
	}
}
