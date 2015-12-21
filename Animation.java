import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Animation extends JPanel implements KeyListener{
	private int x,y,w,h;
	GameObject dinosaur;
	GameObject cactus;
	
	public Animation()
	{
		x = 100;
		y = 390;
		w = 50;
		h = 100;
		dinosaur = new GameObject(x,y,w,h);
		cactus = new GameObject(1000,390,25,100);
		

	}
	
	public void Update()
	{ 
		dinosaur.jump();
		cactus.Update();
	}
	
	public void paint(Graphics g)
	{
		dinosaur.paint(g);
		cactus.paint(g);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyPressed(KeyEvent e) {

		if(e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			dinosaur.jump();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
