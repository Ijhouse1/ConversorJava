package Longitud;

import javax.swing.JOptionPane;

public class ConvertiraMetros implements AutoCloseable{

	
	// convertir Cms a Metros
	public void pasaraMetros(double valor) {
		double metros = valor / 100;
		metros = (double) Math.round(metros *100d)/100;
        JOptionPane.showMessageDialog(null,valor + " Cms son  " + metros + " Metros");
	}
	
	// convertir Cms a Kilometros
	public void PasaraKms(double valor) {
		double kms = valor / 100000;
		kms = (double) Math.round(kms *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " Cms son  " + kms + " kms");
		
	}
	
	// convertir Cms a Pulgadas
	public void pasaraPulg(double valor) {
		double pulg = valor / 2.54;
		pulg = (double) Math.round(pulg *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " Cms son  " + pulg + " pulgadas");
		
	}
	
	// convertir Cms a Pies
	public void pasaraPie(double valor) {
		double pie = valor / 30.48;
		pie = (double) Math.round(pie *100d)/100;
        JOptionPane.showMessageDialog(null, valor + "Cms son " + pie + " pies");
		
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	


}
