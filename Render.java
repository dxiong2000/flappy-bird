import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Render extends JPanel{
	
	protected void paintComponent(Graphics g){ // override paintComponent
		super.paintComponent(g);

		flappybird.fb.repaint(g); 
	}

}