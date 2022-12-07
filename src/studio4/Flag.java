package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		StdDraw.filledRectangle(0,0,1.0,1.0);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(0.5,0.5,0.32);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(0.37,0.57,0.05);
		StdDraw.filledCircle(0.63,0.57,0.05);
		StdDraw.filledRectangle(.5,.32,.07,.02);
		StdDraw.filledRectangle(.5,.32,.07,.02);
		StdDraw.filledRectangle(.5,.43,.02,.04);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(0.37,0.57,0.01);
		StdDraw.filledCircle(0.63,0.57,0.01);
		StdDraw.filledRectangle(.5,.32,.03,.02);
	}
}