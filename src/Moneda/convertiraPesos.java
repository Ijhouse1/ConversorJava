package Moneda;

import javax.swing.JOptionPane;

public class convertiraPesos implements AutoCloseable{
	
	
	// Convertir de Dolar a pesos
	public void ConvertirDeDolar(double valor) {
		double dolar = valor * 4708.25;
		dolar = (double) Math.round(dolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + dolar + " Pesos Colombianos");
	}
	
	// Convertir de Euro a pesos
	public void ConvertirDeEuro(double valor) {
		double euro = valor * 5167.82;
		euro = (double) Math.round(euro*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ "+ euro + "Pesos Colombianos");
		
	}
	
	// Convertir de Yuan a pesos
	public void ConvertirDeYuan(double valor) {
		double yuan = valor * 681.16;
		yuan = (double) Math.round(yuan*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ "+ yuan + "Pesos Colombianos");
		
	}
	
	// Convertir de Libras a pesos
	public void ConvertirDeLibra(double valor) {
		double libra = valor * 5884.84;
		libra = (double) Math.round(libra*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ "+ libra + "Pesos Colombianos");
		
	}
	
	// Convertir de Rupias a pesos
	public void ConvertirDeRupia(double valor) {
		double rupia = valor * 57.58;
		rupia = (double) Math.round(rupia*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ "+ rupia + "Pesos Colombianos");
		
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
