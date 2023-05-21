package Longitud;

import javax.swing.JOptionPane;

//import Longitud.ConvertiraCms;
//import Longitud.ConvertiraMetros;

public class OpcionesLongitud implements AutoCloseable{

	
	ConvertiraCms centimetros = new ConvertiraCms();
	ConvertiraMetros longitud = new ConvertiraMetros();
	
	public void convertirUnidades(double entradaLongitud) {
		String opciones = (JOptionPane.showInputDialog(null, "Que operación desea realizar?","Longitud",
				JOptionPane.PLAIN_MESSAGE,null,new Object[] {"De Cms a Metros", "De Cms a Kms", "De Cms a Pulg", 
						"De Cms a Pies","De Pies a Cms","De Pulg a Cms", "De Kms a Cms", "De Metros a Cms"},"Seleccion")).toString();
		
		switch (opciones) {
		
		// Aqui tenemos las opciones para convertir de Pesos a Otras divisas
		case "De Cms a Metros": {
			longitud.pasaraMetros(entradaLongitud);
			break;
		}
		
		case "De Cms a Kms": {
			longitud.PasaraKms(entradaLongitud);
			break;
		}
		
		case "De Cms a Pulg": {
			longitud.pasaraPulg(entradaLongitud);
			break;
		}
		
		case "De Cms a Pies": {
			longitud.pasaraPie(entradaLongitud);
			break;
		}
		
		// Aqui tenemos las opciones para convertir de otras Longitudes a Centimetros
		case "De Pies a Cms": {
			centimetros.pasarDePie(entradaLongitud);
			break;
		}
		
		
		
		case "De Pulg a Cms": {
			centimetros.pasarDePulg(entradaLongitud);
			break;
		}
		
		case "De Kms a Cms": {
			centimetros.pasarDeKms(entradaLongitud);
			break;
		}
		
		case "De Metros a Cms":{
			centimetros.pasarDeMts(entradaLongitud);
			break;
		}
		
				
		
		}
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
