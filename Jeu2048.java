
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Jeu2048 extends JFrame implements KeyListener
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L; // jcpa ça sert à quoi A LOOK SUR LE NET //

	int[][]tuiles={	{0,2,0,0}, // Matrice de dimension 4x4 en ayant des le debut 2,2//
                    	{0,2,0,0},
                    	{0,0,0,0},
                    	{0,0,0,0}
                    };
    
    private int ii=0;
    private int jj=0;
    
    public Jeu2048()
    {
        setSize(500,500);
        setTitle("2048");
        setLocationRelativeTo(null); // Position de la fentre au milieu // 
        
        
        addKeyListener(this);
        
        
        
    }
    
    public void paint(Graphics g)
    {
        dessinDestuiles(g);
    }

    public void dessinDestuiles(Graphics g)
    {
        Image img= createImage(getSize().width, getSize().height);
        Graphics2D g2=(Graphics2D)img.getGraphics();
        for(int i=0;i<4; i++)
        {
            for(int j=0; j<4;j++)
            {
                g2.setColor(Color.LIGHT_GRAY); // Background couleur et design //
                g2.fillRect(50+j*100, 50+i*100, 100, 100);
                
                if(ii==i&&j==jj)
                {
                    if(tuiles[ii][jj]==2||tuiles[ii][jj]==4)
                    {
                        g2.setColor(Color.gray);
                        System.out.println();
                          g2.fillRect(50+jj*100, 50+ii*100, 100, 100);
                    }
                }
                g2.setColor(Color.black); // design de la grille // 
                g2.drawLine(50, 50, 450, 50); // ligne du haut // // x1 (longeur de la ligne) , y1 (angle de la ligne) , x2, y2 // 
                g2.drawLine(50, 150, 450, 150); // 2eme ligne // //x1,y1,x2,y2//
                g2.drawLine(50, 250, 450, 250); // 3eme ligne //
                g2.drawLine(50, 350, 450, 350);
                g2.drawLine(50, 450, 450, 450);
                
                g2.drawLine(50, 50, 50, 450);
                g2.drawLine(150, 50, 150, 450);
                g2.drawLine(250, 50, 250, 450);
                g2.drawLine(350, 50, 350, 450);
                g2.drawLine(450, 50, 450, 450);
               
               switch(tuiles[i][j])
               {
                   case 2:

                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("2", 90+j*100, 120+i*100);
                       break;
                   case 3:
                       
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("2", 90+j*100, 120+i*100);
                       break;
                   case 4:

                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("4", 90+j*100, 120+i*100);
                       break;
                   case 5:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("4", 90+j*100, 120+i*100);
                       break;    
                   case 8:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("8", 90+j*100, 120+i*100);
                       break;
                   case 9:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("8", 90+j*100, 120+i*100);
                       break;
                   case 16:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("16", 70+j*100, 120+i*100);
                       break;
                   case 17:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("16", 70+j*100, 120+i*100);
                       break;    
                   case 32:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("32", 70+j*100, 120+i*100);
                       break;
                   case 33:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("32", 70+j*100, 120+i*100);
                       break;
                   case 64:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("64", 90+j*100, 120+i*100);
                       break;
                   case 65:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("64", 90+j*100, 120+i*100);
                       break;
                   case 128:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("128", 70+j*100, 120+i*100);
                       break;
                   case 129:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("128", 70+j*100, 120+i*100);
                       break;    
                   case 256:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("256", 70+j*100, 120+i*100);
                       break;
                   case 257:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("256", 70+j*100, 120+i*100);
                       break;
                   case 512:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("512", 90+j*100, 120+i*100);
                       break;
                   case 513:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("512", 90+j*100, 120+i*100);
                       break;
                   case 1024:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("1024", 70+j*100, 120+i*100);
                       break;
                   case 1025:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("1024", 70+j*100, 120+i*100);
                       break;    
                   case 2048:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("2048", 70+j*100, 120+i*100);
                       break;
                   case 2049:
                       g2.setFont(new Font("Arial",Font.BOLD,40));
                       g2.setColor(Color.BLUE.darker());
                       g2.drawString("2048", 70+j*100, 120+i*100);
                       break;    
                   
                   default: 
                       break;
               }
                
            }
        }
        
        
        
   
