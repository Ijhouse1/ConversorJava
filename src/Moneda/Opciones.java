package Moneda;

import javax.swing.JOptionPane;


public class Opciones implements AutoCloseable{
	
	conversorDePesosA divisas = new conversorDePesosA();
	convertiraPesos pesos = new convertiraPesos();
	
	public void convertirDivisas(double entrada) {
		String opciones = (JOptionPane.showInputDialog(null,"Que operación desea realizar?","Divisas",
				JOptionPane.PLAIN_MESSAGE,null,new Object[] {"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Yuan", "De Pesos a Libras",
			"De Pesos a Rupias","De Rupias a Pesos", "De Libras a Pesos", "De Yuan a Pesos",
			"De Euro a Pesos", "De Dolar a Pesos"
	},"Seleccion")).toString();
		
		switch (opciones) {
		
		// Aqui tenemos las opciones para convertir de Pesos a Otras divisas
		case "De Pesos a Dolar": {
			divisas.convertiraDolar(entrada);
			break;
		}
		
		case "De Pesos a Euro": {
			divisas.convertiraEuro(entrada);
			break;
		}
		
		case "De Pesos a Yuan": {
			divisas.convertiraYuan(entrada);
			break;
		}
		
		case "De Pesos a Libra": {
			divisas.convertiraLibra(entrada);
			break;
		}
		
		case "De Pesos a Rupias": {
			divisas.convertiraRupia(entrada);
			break;
		}
		
		// Aqui tenemos las opciones para convertir de otras divisas a pesos
		
		case "De Rupias a Pesos": {
			pesos.ConvertirDeRupia(entrada);
			break;
		}
		
		case "De Libras a Pesos": {
			pesos.ConvertirDeLibra(entrada);
			break;
		}
		
		case "De Yen a Pesos":{
			pesos.ConvertirDeYuan(entrada);
			break;
		}
		
		case "De Euro a Pesos":{
			pesos.ConvertirDeEuro(entrada);
			break;
		}
		
		case "De Dolar a Pesos":{
			pesos.ConvertirDeDolar(entrada);
			break;
		}
		
		
		}
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
