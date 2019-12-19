package Fenetre;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import Button.BoutonPoste;

public class Poste extends JPanel {
	
	JButton sup = new JButton("Supprimer");
	private JTextField supPoste = new JTextField();
	private JLabel label2 = new JLabel("Supprimer Poste");

	ArrayList<BoutonPoste> listPoste = new ArrayList<>();
	ArrayList<StockPoste> listStockPoste = new ArrayList<>();
	
	private JTextField jtf = new JTextField();
	private JLabel label = new JLabel("New Poste");
	private JButton b = new JButton("OK");

	String nom;
	static JPanel posiPoste = new JPanel();

	public Poste() {

	
		this.setBackground(Color.DARK_GRAY);
		JPanel newPoste = new JPanel();
		Font police = new Font("Arial", Font.BOLD, 14);
		label.setForeground(Color.WHITE);
		jtf.setFont(police);
		jtf.setPreferredSize(new Dimension(150, 30));
		supPoste.setPreferredSize(new Dimension(150, 30));
		jtf.setForeground(Color.BLACK);
		this.setLayout(new BorderLayout());
		b.addActionListener(new BoutonListener());
		sup.addActionListener(new BoutonListener2());
		newPoste.add(label);
		newPoste.add(jtf);
		newPoste.add(b);
		newPoste.add(label2);
		newPoste.add(supPoste);
		newPoste.add(sup);

		this.add(posiPoste, BorderLayout.CENTER);
		newPoste.setBackground(Color.DARK_GRAY);
		posiPoste.setBackground(Color.DARK_GRAY);
		this.add(newPoste, BorderLayout.SOUTH);

	}

	public class BoutonListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (!jtf.getText().equals("")) {
				BoutonPoste poste = new BoutonPoste(jtf.getText());
				StockPoste stockPoste = new StockPoste(jtf.getText());
				Fenetre.content.add(stockPoste, jtf.getText());
				
				
				
				listPoste.add(poste);
				for (BoutonPoste n : listPoste) {
					Poste.posiPoste.add(n);
				}
				jtf.setText("");
				Poste.this.updateUI();

			}
		}

	}

	public class BoutonListener2 implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			for (int i = 0; i < listPoste.size(); i++) {
				
				if (supPoste.getText().equals(listPoste.get(i).getText())) {
					Poste.posiPoste.remove(i);
					listPoste.remove(i);
					Fenetre.content.remove(supPoste);
					
				
				Poste.this.updateUI();
				// supPoste.setText(null);

			}

		}

	}
}}
