package sabak;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Jeu extends JPanel implements KeyListener, Runnable{


	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 400;
	public static final int HEIGHT = 630;
	public static final Font main = new Font(" Mettre un nom !!!", Font.PLAIN,28);
	private Thread game;
	private boolean running;
	private BufferedImage image=new BufferedImage(WIDTH,HEIGHT, BufferedImage.TYPE_INT_RGB);
	
	private long startTime;
	private long elapsed;
	private boolean set;
	
	public Jeu() {
		setFocusable(true);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		addKeyListener(this);
	}
	
	private void update(){
		
	}
	
	private void render(){
	Graphics2D g = (Graphics2D) image.getGraphics();	
	g.setColor(Color.gray);
	g.fillRect(0,0, WIDTH, HEIGHT);
	
	g.dispose();
	
	Graphics2D g2d =(Grapahics2D) getGraphics();
			g2d.drawImage(image,0,0,null);
			g2d.dispose();
	}
	
	@Override
	public void run() {

		
	}

	@Override
	public void keyPressed(KeyEvent e) {

		
	}

	@Override
	public void keyReleased(KeyEvent e) {

		
	}

	@Override
	public void keyTyped(KeyEvent e) {

		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

}
