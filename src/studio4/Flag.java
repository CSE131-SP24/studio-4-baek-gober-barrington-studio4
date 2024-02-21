package studio4;

import java.awt.Color;
import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) 
	{
		StdDraw.setCanvasSize(600, 400);
	       StdDraw.setScale(0, 20);
	       StdDraw.setPenColor(255, 0, 0);
	       StdDraw.filledRectangle(10, 10, 10, 10);
	       StdDraw.setPenColor(StdDraw.YELLOW);
	       Font freedom = new Font("Papyrus", Font.BOLD, 42);
	    StdDraw.setFont(freedom);
	       StdDraw.text(10, 10, "Profits are stolen wages");
	       StdDraw.show();
	     
	}
}