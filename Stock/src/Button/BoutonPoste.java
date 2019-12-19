package Button;
import Fenetre.Fenetre;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Fenetre.Poste;
import Fenetre.Poste.BoutonListener;

public class BoutonPoste extends JButton {
	private String name;
	Font fontEntered = new Font(Font.SANS_SERIF, Font.BOLD, 30);
	public BoutonPoste(String str) {
		super(str);
		
		this.name = str;

		this.setPreferredSize(new Dimension(150, 120));
		this.setBackground(Color.BLACK);
		this.setForeground(Color.white);
		this.setFont(fontEntered);
		this.addActionListener(new BoutonListener());
	}

	
	public class BoutonListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			Fenetre.cl.show(Fenetre.content, name);
			Fenetre.content.updateUI();
			

			}
	
}}
	 