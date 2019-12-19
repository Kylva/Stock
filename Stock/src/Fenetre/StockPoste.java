package Fenetre;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Button.ButtonProduit;
import Stock.Produit;

public class StockPoste extends JPanel {

	ButtonProduit bProduit = new ButtonProduit();
	JPanel back = new JPanel();
	JButton retour = new JButton("<");
	
	private DefaultTableModel model;

	  private JTable table;

	

	String name = new String();
	JPanel produits = new JPanel();

	public StockPoste(String name) {
		this.name = name;
		back.setBackground(Color.GRAY);
		this.setBackground(Color.GRAY);
		this.setLayout(new BorderLayout());
		back.setLayout(new BorderLayout());

		
		model = new DefaultTableModel();
		model.addColumn("Produit");
	    model.addColumn("Prix Unitaire");
	    model.addColumn("Quantité");
	    model.addColumn("Prix Du Stock");
		
		table = new JTable(model);

		JButton ajouter = new JButton("Ajouter une ligne");
		ajouter.addActionListener(new MoreListener());
		retour.addActionListener(new BoutonListener());

	
		 JButton removeButton = new JButton("Supprimer");
		 
		removeButton.addActionListener(new ActionListener() {

		      public void actionPerformed(ActionEvent event) {
		        model.removeRow(table.getSelectedRow());
		      }
		    });
		this.add(new JScrollPane(table), BorderLayout.CENTER);
	    
		JPanel supAjou = new JPanel();
		supAjou.add(ajouter);
		supAjou.add(removeButton);
		this.add(supAjou, BorderLayout.SOUTH);
		back.add(retour, BorderLayout.WEST);
		this.add(back, BorderLayout.NORTH);
	}

	class MoreListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String produit = null;
			double prix = 0;
			int quantite = 0;
			Double prixStock = new Double(prix*quantite);
			String result = prixStock.toString();
			
			Object[] donnee = new Object[] { produit, prix, quantite, new JLabel(result)};
			((DefaultTableModel) table.getModel()).addRow(donnee);
			Fenetre.content.updateUI();
		}
	}

	public class BoutonListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			Fenetre.cl.show(Fenetre.content, "poste");
			Fenetre.content.updateUI();

		}
	}


}