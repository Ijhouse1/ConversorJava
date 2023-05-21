package Moneda;

import javax.swing.JOptionPane;

public class conversorDePesosA implements AutoCloseable{
	
	// convertir pesos a Dolares
	public void convertiraDolar(double valor) {
		double dolar = valor / 4708.25;
		dolar = (double) Math.round(dolar *100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $ " + dolar + " Dolares");
	}
	
	// convertir pesos a Euros
	public void convertiraEuro(double valor) {
		double euro = valor / 5167.82;
		euro = (double) Math.round(euro *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + euro + " Euro");
		
	}
	
	// convertir pesos a Yuan
	public void convertiraYuan(double valor) {
		double yuan = valor / 681.16;
		yuan = (double) Math.round(yuan *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + yuan + " Yuan");
		
	}
	
	// convertir pesos a Libras
	public void convertiraLibra(double valor) {
		double libra = valor / 5884.84;
		libra = (double) Math.round(libra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + libra + " Libras");
		
	}
	
	// convertir pesos a Rupias
	public void convertiraRupia(double valor) {
		double rupia = valor / 57.58;
		rupia = (double) Math.round(rupia *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + rupia + " Rupias");
		
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
