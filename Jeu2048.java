
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
    
    public void paint(Graphics g) // fonction dessin de la tuile //
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
 // :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
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
        
        g.drawImage(img, 0, 0, this);
    }
    
    
    public static void main(String[] args) 
    {
      Jeu2048 jeu= new Jeu2048();
      jeu.setVisible(true);
      jeu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void fusiongauche(int x, int y)
    {
        int valeur=0;
        if(tuiles[x][y]%2!=0)
        {
            System.out.println("apuuie");
           
            valeur= tuiles[x][y];
            valeur--;
            tuiles[x][y]=valeur;
             System.out.println(valeur);
        }
        else
        {
            
        valeur= tuiles[x][y];
        }
        int ile=0;
       
       
       for(int i=1; i<4;i++)
           {
               if(y-i>=0)
               {
                   if(tuiles[x][y-i]==0)
                    {
                        
                        tuiles[x][y-i]=valeur;
                       tuiles[x][y-i+1]=0;
                       
                         continue; // internet =D //
               
                    }
                   else if(valeur==tuiles[x][y-i]&&(ile==0))
                    {
                        valeur=valeur*2+1;
                        
                        tuiles[x][y-i]=valeur;
                        tuiles[x][y-i+1]=0;
                        ile++;
                        
                        
                         
                    }
                   else
                     {
                         
                         break;
                     }
                   
               }
           }
        
    }
    
    public void fusionDroite(int x, int y)
    {
        int valeur=0;
        if(tuiles[x][y]%2!=0)
        {
            System.out.println("OKE");
           
            valeur= tuiles[x][y];
            valeur--;
            tuiles[x][y]=valeur;
             System.out.println(valeur);
        }
        else
        {
            
        valeur= tuiles[x][y];
        }
        int ile=0;
       
       
       for(int i=1; i<4;i++)
           {
               if(y+i<=3)
               {
                   if(tuiles[x][y+i]==0)
                    {
                        
                        tuiles[x][y+i]=valeur;
                       tuiles[x][y+i-1]=0;
                       
                         continue;
               
                    }
                   else if(valeur==tuiles[x][y+i]&&(ile==0))
                    {
                        valeur=valeur*2+1;
                        
                        tuiles[x][y+i]=valeur;
                        tuiles[x][y+i-1]=0;
                        ile++;
                        
                        
                         
                    }
                   else
                     {
                         
                         break;
                     }
                   
               }
           }
        
    }
    
     public void ajouterADroite(int x, int y)
    {
        int valeur=0;
        if(tuiles[x][y]%2!=0)
        {
            System.out.println("OKE");
           
            valeur= tuiles[x][y];
            valeur--;
            tuiles[x][y]=valeur;
             System.out.println(valeur);
        }
        else
        {
            
        valeur= tuiles[x][y];
        }
        int ile=0;
       
       
       for(int i=1; i<4;i++)
           {
               if(x-i>=0)
               {
                   if(tuiles[x-i][y]==0)
                    {
                        
                        tuiles[x-i][y]=valeur;
                       tuiles[x-i+1][y]=0;
                       
                         continue;
               
                    }
                   else if(valeur==tuiles[x-i][y]&&(ile==0))
                    {
                        valeur=valeur*2+1;
                        
                        tuiles[x-i][y]=valeur;
                        tuiles[x-i+1][y]=0;
                        ile++;

                    }
                   else
                     {
                         
                         break;
                     }
                   
               }
           }
        
    }
     

     public void fusionBas(int x, int y)
    {
        int valeur=0;
        if(tuiles[x][y]%2!=0)
        {
            System.out.println("OKE");
           
            valeur= tuiles[x][y];
            valeur--;
            tuiles[x][y]=valeur;
             System.out.println(valeur);
        }
        else
        {
            
        valeur= tuiles[x][y];
        }
        int ile=0;
       
       
       for(int i=1; i<4;i++)
           {
               if(x+i<=3)
               {
                   if(tuiles[x+i][y]==0)
                    {
                        
                        tuiles[x+i][y]=valeur;
                       tuiles[x+i-1][y]=0;
                       
                         continue;
               
                    }
                   else if(valeur==tuiles[x+i][y]&&(ile==0))
                    {
                        valeur=valeur*2+1;
                        
                        tuiles[x+i][y]=valeur;
                        tuiles[x+i-1][y]=0;
                        ile++;
                        
                        
                         
                    }
                   else
                     {
                         
                         break;
                     }
                   
               }
           }
        
    }
     
     
    public void ajouterCaseAlea()
    {
        int ile=0;
        int[]nombreMax={2,4}; // nombres qui sont rajouter au max //
        ArrayList<Integer> poleI= new ArrayList<Integer>(); 		// instentiation des p
        ArrayList<Integer> poleJ= new ArrayList<Integer>();
        Random r= new Random();
        for(int i=0; i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(tuiles[i][j]==0)
                {
                    poleI.add(i);
                    poleJ.add(j);
                  ile++;
                  
                }
            }
        }
        if(ile==0)
            JOptionPane.showMessageDialog(this, "Fin du jeu");
        else
        {
            int los= r.nextInt(ile);
             ii=poleI.get(los);
             jj=poleJ.get(los);
            int los2=r.nextInt(2);
            if(los2==0)
            {
               tuiles[ii][jj]=2; 
            }
            else
            {
                 tuiles[ii][jj]=4;
                
            }
        }
    }
  
    
   

    
// pour les touches du clavier ICI // 
    // Faire comme avec les boutons en cours //
    // Gestionnaires de mise en forme !!!!!!!! //
    @Override
    public void keyPressed(KeyEvent e)
    {
        int k=e.getKeyCode();
        
        switch(k)								
                {
            case 39:										// DROITE //
                
                for(int i=0;i<4;i++)
                {
                  for(int j=3;j>=0;j--)
                  {
                      fusionDroite(i, j);
                  } 
                }
                ajouterCaseAlea();
                System.out.println("Touche droite");
                break;
                
                
            case 40:								// EN BAS //
                for(int i=3;i>=0;i--)
                {
                  for(int j=0;j<4;j++)
                  {
                      fusionBas(i, j);
                  } 
                }
                ajouterCaseAlea();
                System.out.println("Touche bas");
                break;
                
                
            case 38:			
                for(int i=0;i<4;i++)
                {
                  for(int j=0;j<4;j++)
                  {
                      ajouterADroite(i, j);
                  } 
                }
                ajouterCaseAlea();
                System.out.println("Touche haut");
                break;
            case 37:
                for(int i=0;i<4;i++)
                {
                  for(int j=0;j<4;j++)
                  {
                      fusiongauche(i, j);
                  } 
                }
               ajouterCaseAlea();
                System.out.println("Touche gauche");
                break;    
                    
                }
        
        repaint(); // MAJ du panel au niveau des graphismes  apl seulement paint //
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }
    
}
