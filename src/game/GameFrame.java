package game;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame {
	
	GamePanel panel;
	
	GameFrame(){
		GamePanel panel=new GamePanel();
		this.add(panel);
		this.setTitle("Tic-tac-toe");
		this.setResizable(true);
		this.setBackground(Color.yellow);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
	}
	
		 
}

