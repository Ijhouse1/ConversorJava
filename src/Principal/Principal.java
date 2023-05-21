package Principal;

import javax.swing.JOptionPane;
import Moneda.Opciones;
import Longitud.OpcionesLongitud;

public class Principal {
	public static void main(String[] args) {
		
		final Opciones monedas = new Opciones();
		final OpcionesLongitud longitudes = new OpcionesLongitud();

		while (true) {
			final String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción", "MENU",
					JOptionPane.INFORMATION_MESSAGE, null, new Object[] { "DIVISAS", "LONGITUD" },
					"Seleccion")).toString();
		
				switch (opciones) {
				case "DIVISAS": {
					final String input = JOptionPane.showInputDialog("Cuanto dinero deseas convertir: ");
					try {
						if (ValidarNumero(input) == true) {
							double entradaMoneda = Double.parseDouble(input);
							monedas.convertirDivisas(entradaMoneda);

							int respuesta = JOptionPane.showConfirmDialog(null, "Otra conversión?");
							if (JOptionPane.OK_OPTION == respuesta) {

								System.out.println("Selección Afirmativa");

							} else {

								JOptionPane.showMessageDialog(null, "Operación Finalizada");
								System.out.println("Seleccion Negativa");
								break;

							}
						}
					}catch(Exception e) {
						new Exception(e);
					}
				}

				// Inincio Longitud

				case "LONGITUD": {
					final String inputLongitud = JOptionPane.showInputDialog("Cuantas unidades desea convertir: ");
					
					try{
						if (ValidarNumero(inputLongitud) == true) {
							double entradaLongitud = Double.parseDouble(inputLongitud);
							longitudes.convertirUnidades(entradaLongitud);

							int resp = JOptionPane.showConfirmDialog(null, "Otra conversión?");
							if (JOptionPane.YES_OPTION == resp) {
								longitudes.convertirUnidades(entradaLongitud);

								System.out.println("Selección Afirmativa: " + resp);
								reinicio(resp);

							}

						}

						else {

							JOptionPane.showMessageDialog(null, "Operación Finalizada");

							System.out.println("Seleccion Negativa");
							break;

						}
					}catch(Exception e) {
						new Exception(e);
					}
					
				}

				// Fin Longitud
				}
			 //

			// Capturamos NullPointerExceptio en caso de ocurrir
			/*catch (NullPointerException ex) {
				ex.printStackTrace();
				System.out.println("fin de la tarea");
				break;
			}*/
			// Finalizamos de forma controlada la ejecucion
			// finally {
			break;
			// }

		}
	}
	

	private static boolean reinicio(int resp) {
		Principal principal = new Principal();
		if (resp == 0) {
			System.out.println("Reiniciar");
		}
		return true;
	}

	private static boolean ValidarNumero(String input) {
		double x = Double.parseDouble(input);
		if (x >= 0 || x <= 0) {
			return true;
		}
		return false;

	}
	

}
