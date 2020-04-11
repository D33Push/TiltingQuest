package tiltingQuest.frame;

import java.awt.Dimension;

import javax.swing.JFrame;

import com.sun.javafx.tk.Toolkit;

public class Frame extends JFrame{
	
	public Frame() {
		
		setName("Tilting Quest");
		setSize(800, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
