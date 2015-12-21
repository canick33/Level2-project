import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Window implements ActionListener{
	JFrame frame;
	Rectangle test;
	Animation a; 
	private int x,y,w,h;
	Timer time;
	KeyListener l;


public static void main (String[] args)
{ 
	Window w = new Window();
	
}
public Window()
{
	x=100;
	y=100;
	w=100;
	h=100;


	a = new Animation();
	a.addKeyListener(l);
	frame = new JFrame();
	frame.setVisible(true);
	frame.add(a);
	frame.setSize(1500, 500);
	
	time = new Timer(1000/60, this);
	time.start();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	a.Update();
	a.repaint();
}
}
