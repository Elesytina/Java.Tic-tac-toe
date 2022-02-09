package game;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.applet.*; 

   public class GamePanel extends JPanel {
	
	static final int GAME_WIDTH =1000;
	static final int GAME_HEIGHT =1000;
	static final Dimension SCREEN_SIZE =new Dimension(GAME_WIDTH,GAME_HEIGHT);
	
	
	Thread gameThread;
	Graphics g;
	Nought[] nought;
	Cross[] cross;
	Icon icon1, icon2;
	boolean flag=true;
	Cell[]  cells_mas=Cell.cells();

	public GamePanel() {
		  this.setVisible(true);
	      this.setFocusable(true);
	      this.setPreferredSize(SCREEN_SIZE);
	      this.setLayout(new GridLayout(3,3));
	      ButtonGroup group = new ButtonGroup();
	      
	      ActionListener actionlist1=new ButtonEventList();
	     
	      icon1 = new ImageIcon("D:\\Ó÷¸áà\\JAVA\\close.png");
	      icon2= new ImageIcon("D:\\Ó÷¸áà\\JAVA\\radio-button.png");
	      for(int i=0; i<9;i++) {
	    	  cells_mas[i]=new Cell();
	          group.add(cells_mas[i]);
	          this.add(cells_mas[i]);
	          cells_mas[i].addActionListener(actionlist1);
	      }
	    
    }	    		
 
    class ButtonEventList implements ActionListener {
     	 public void actionPerformed(ActionEvent e) {
     		 Cell c=(Cell)e.getSource();
     		
     		 if (flag) {
             c.setIcon(icon1);
             c.setBackground(Color.blue);
             c.isPress=true;
             flag=false;
     		 }
     		 else {
     			 c.setIcon(icon2);
     			 c.setBackground(Color.yellow);
     			 flag=true;
     			 c.type=0;
     			 c.isPress=true;
     		 }
     		 for (int i=0;i<9;i++) {
     			 if (c==cells_mas[i]) {
     				 cells_mas[i].setEnabled(false); 
     				 
     		 } 
     		 }
     		 
     		 if((cells_mas[0].equals(cells_mas[1], cells_mas[2]))&&(cells_mas[0].isPress)&&(cells_mas[1].isPress)&&(cells_mas[2].isPress)){
     			  cells_mas[0].setBackground(Color.red);
      			  cells_mas[1].setBackground(Color.red);
      			  cells_mas[2].setBackground(Color.red);
   			  JOptionPane.showMessageDialog(null,"Stop game", "There is a winner", JOptionPane.PLAIN_MESSAGE);	
   			 
   			  }
     		 if((cells_mas[0].equals(cells_mas[3], cells_mas[6]))&&(cells_mas[0].isPress)&&(cells_mas[3].isPress)&&(cells_mas[6].isPress)){
     			 cells_mas[0].setBackground(Color.red);
   			     cells_mas[6].setBackground(Color.red);
   			     cells_mas[3].setBackground(Color.red);
    			  JOptionPane.showMessageDialog(null,"Stop game", "There is a winner", JOptionPane.PLAIN_MESSAGE);	
    			 }
     		 if((cells_mas[0].equals(cells_mas[4], cells_mas[8]))&&(cells_mas[0].isPress)&&(cells_mas[4].isPress)&&(cells_mas[8].isPress)){
     			 cells_mas[0].setBackground(Color.red);
  			     cells_mas[4].setBackground(Color.red);
  			     cells_mas[8].setBackground(Color.red);
   			  JOptionPane.showMessageDialog(null,"Stop game", "There is a winner", JOptionPane.PLAIN_MESSAGE);}
   		    if((cells_mas[2].equals(cells_mas[5], cells_mas[8]))&&(cells_mas[2].isPress)&&(cells_mas[5].isPress)&&(cells_mas[8].isPress)){
   		    	 cells_mas[2].setBackground(Color.red);
  			     cells_mas[5].setBackground(Color.red);
  			     cells_mas[8].setBackground(Color.red);
   			  JOptionPane.showMessageDialog(null,"Stop game", "There is a winner", JOptionPane.PLAIN_MESSAGE);}
   		    if((cells_mas[6].equals(cells_mas[7], cells_mas[8]))&&(cells_mas[6].isPress)&&(cells_mas[7].isPress)&&(cells_mas[8].isPress)){
   		    	 cells_mas[6].setBackground(Color.red);
  			     cells_mas[7].setBackground(Color.red);
  			     cells_mas[8].setBackground(Color.red);
   			  JOptionPane.showMessageDialog(null,"Stop game", "There is a winner", JOptionPane.PLAIN_MESSAGE);}
   		    if((cells_mas[2].equals(cells_mas[4], cells_mas[6]))&&(cells_mas[2].isPress)&&(cells_mas[4].isPress)&&(cells_mas[6].isPress)){
   		    	 cells_mas[2].setBackground(Color.red);
  			     cells_mas[4].setBackground(Color.red);
  			     cells_mas[6].setBackground(Color.red);
   			  JOptionPane.showMessageDialog(null,"Stop game", "There is a winner", JOptionPane.PLAIN_MESSAGE);}
   			 if((cells_mas[3].equals(cells_mas[4], cells_mas[5]))&&(cells_mas[3].isPress)&&(cells_mas[4].isPress)&&(cells_mas[5].isPress)){
   				 cells_mas[3].setBackground(Color.red);
  			     cells_mas[4].setBackground(Color.red);
  			     cells_mas[5].setBackground(Color.red);
   			  JOptionPane.showMessageDialog(null,"Stop game", "There is a winner", JOptionPane.PLAIN_MESSAGE);	}
   			 if((cells_mas[1].equals(cells_mas[4], cells_mas[7]))&&(cells_mas[1].isPress)&&(cells_mas[4].isPress)&&(cells_mas[7].isPress)){
   				 cells_mas[1].setBackground(Color.red);
  			     cells_mas[4].setBackground(Color.red);
  			     cells_mas[7].setBackground(Color.red);
      			  JOptionPane.showMessageDialog(null,"Stop game", "There is a winner", JOptionPane.PLAIN_MESSAGE);	}
   			
           }
     		 
    }
    }
   
   
   	
    
	


   


