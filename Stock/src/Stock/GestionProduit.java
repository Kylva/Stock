package Stock;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;



public class GestionProduit extends AbstractTableModel {

	 private ArrayList<Produit> listProduit = new ArrayList<>();
	 String  title[] = {"Produit", "Prix Unitaire", "Quantité","Prix du Stock"};
	


	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}}