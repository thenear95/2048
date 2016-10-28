package sabak;

import javax.swing.JFrame;

public class Start {
	public static void main (String[]args){
		Jeu jeu = new Jeu();
		
		JFrame window = new JFrame("2048"); // Création de la fenetre du jeu //
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.add(jeu);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		jeu.start();
	}

}
