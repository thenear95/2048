package jeu;

import java.awt.Color; 
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Fenetre extends JFrame {
	
  public Fenetre(){
	  
    this.setTitle("2048");
    this.setSize(500, 500); // x, y //
    this.setLocationRelativeTo(null); // Position de la fentre au milieu // 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    this.setVisible(true);
    
    //Instanciation de lobjet JPanel
    JPanel pan = new JPanel();
    
    //Définition de sa couleur de fond
    pan.setBackground(Color.gray);     
    
    //On prévient notre JFrame que notre JPanel sera son content pane
    this.setContentPane(pan);               
    this.setVisible(true);
    

  }
}
