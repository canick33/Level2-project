import java.awt.Color;
import java.awt.Graphics;

public class GameObject {
	private int x,y,w,h;
	public static void main (String[] args)
	{
	}
	public GameObject(int X,int Y,int W,int H)
	{
		x=X;
		y = Y;
		w = W;
		h = H;
		

	}
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(x, y, w, h);
	}
	public void Update()
	{
		x=x-2;
	}
	public void jump()
	{

			y = y-1;
			
		
		System.out.println("test");
	}
	public void fall()
	{
		 y = y +1;
	}
	
}


