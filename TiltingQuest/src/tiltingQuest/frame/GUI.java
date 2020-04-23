package tiltingQuest.frame;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

import com.sun.prism.paint.Color;



public class GUI extends JFrame{
	
	
	private BufferedImage house;
	
	
	public GUI(int x, int y) {
		
	try {
		house = ImageIO.read(new File("rsc/Grass01.png"));
	}catch(IOException e) {
		e.printStackTrace();
		System.out.println("Bilder konnten nicht geladen werden");
	}
	
		
		setName("Tilting Quest");
		setSize(x, y);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	//Pixelgroesse des Images 32x32 -> füllt  x-Achse und y-aus
	public void paint(Graphics g) {
	      super.paint(g);
	      if(house != null) {
	        for(int y=0; y<=this.getHeight();y+=32) {
	        	for(int x=0; x<=this.getWidth();x+=32) {	
	        		g.drawImage(house,x ,y , this);
	        	}
	        }
	      }
	}
}
