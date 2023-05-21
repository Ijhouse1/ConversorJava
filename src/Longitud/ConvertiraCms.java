package Longitud;

import javax.swing.JOptionPane;

public class ConvertiraCms implements AutoCloseable{
	

	
	// convertir Metros a Cms
	public void pasarDeMts(double valor) {
		double metros = valor * 100;
		metros = (double) Math.round(metros *100d)/100;
        JOptionPane.showMessageDialog(null, valor + "mts son " + metros + " Cms");
	}
	
	// convertir Kms a Cms
	public void pasarDeKms(double valor) {
		double Kms = valor * 100000;
		Kms = (double) Math.round(Kms *100d)/100;
        JOptionPane.showMessageDialog(null, valor +" Kms son " + Kms + " Cms");
		
	}
	
	// convertir Pulgadas a Cms
	public void pasarDePulg(double valor) {
		double pulg = valor * 2.54;
		pulg = (double) Math.round(pulg *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " pulg son " + pulg + " Cms");
		
	}
	
	// convertir Pies a Cms
	public void pasarDePie(double valor) {
		double pies = valor * 30.48;
		pies = (double) Math.round(pies *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " pies son " + pies + " Cms");
		
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}
