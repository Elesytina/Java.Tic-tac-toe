package game;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Cross extends Rectangle {

	Cross(int x, int y){
		super(x,y,20,20);
	}
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.drawLine(x,y,height,width);
	}

	}


