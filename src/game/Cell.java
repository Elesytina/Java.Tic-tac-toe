package game;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cell extends JButton  {
	final protected int widht=40;
	final protected int height=40;
	protected int type;
	protected boolean isPress;
	
	public Cell(){
		super();
		this.setSize(widht, height);
		this.type=1;
		}
	public static Cell[] cells() {
		Cell[] cells=new Cell[9];
		return cells;
		}

	public boolean equals(Cell c1, Cell c2) {
		if((c1.type==this.type)&&(c2.type==this.type))
		   return true;
		else
			return false;
	}
	
	
	}
			
		
	


