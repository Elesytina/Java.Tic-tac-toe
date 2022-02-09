package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Nought extends Rectangle 
{

  Nought(int x, int y){
	super(x,y,20,20);
}
public void draw(Graphics g) {
	g.setColor(Color.red);
	g.drawOval(x,y,20,20);
}
public void keyPressed(KeyEvent e) {
	
	
}

}
