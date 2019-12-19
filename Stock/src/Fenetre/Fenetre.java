package Fenetre;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	
	Poste poste = new Poste();
	 public static CardLayout cl = new CardLayout();
	 public static JPanel content = new JPanel();
	
	
	 public Fenetre(){
		  this.setTitle("Gestion des Stock");
		    this.setSize(1000, 600);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setLocationRelativeTo(null);
		    content.setLayout(cl);
		    
		    content.add(poste, "poste");
		    
		    
		    this.setContentPane(content);
		    this.setVisible(true);
}
}