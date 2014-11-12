package InOut;

import javax.swing.JOptionPane;

public class ClassInOut {

	public char requestInfoChar() {
		char letra;
		String text;
		text = JOptionPane.showInputDialog("PLEASE YOU WRITE A LETTER.");
		letra = text.charAt(0);
		return letra;
	}

	public String requestInfo(String text) {
		text = JOptionPane.showInputDialog(text);
		return text;
	}

	public String requestInfo(int num) {
		String text = "" + num;
		text = JOptionPane.showInputDialog(text);
		return text;
	}

	public void showInfo(String text) {
		JOptionPane.showMessageDialog(null, text);
	}
	public void showInfo(int n) {
		JOptionPane.showMessageDialog(null, n);
	}

	public void showError(String text) {
		JOptionPane.showMessageDialog(null, text, "ERROR",
				JOptionPane.ERROR_MESSAGE);
	}

	public void menu() {
		String text = "";
		text += "LEARN ENGLISH\n\n" + "1.) LEARN PRESENT SIMPLE\n"
				+ "2.) LEARN PAST\n" + "3.) LEARN FUTURE\n" + "4.) PLAY HANGMAN\n"
				+ "5.) EXIT";
		showInfo(text);
	}

	public void subMenu(String tema) {
		String text = "";
		text += "LEARN ENGLISH * " + tema + " \n\n"
				+ "1.) COMPLETE THE SENTENCES\n" + "2.) QUESTION WITH IMAGE\n"
                                + "3.) HELP\n"
				+ "4.) RETURN";
		showInfo(text);
	}

	public int requestIntPositive1_9(String msj) {
		int dato = 0;
		String datoString = "";

		do {
			datoString = JOptionPane.showInputDialog(msj);

			if (datoString.matches("[1-9]") == true) {

				dato = Integer.parseInt(datoString);
				// showInfo("valor exitoso.");
			} else {
				showInfo("WRONG ");
			}
		} while (datoString.matches("[1-9]") == false);
		dato = Integer.parseInt(datoString);
		return dato;
	}

	// //SOLO PERMITE INGRESAR NUMEROS DEL 0 EN ADELANTE
	public int requestIntPositive(String msj) {
		int dato = 0;
		String datoString = "";

		do {
			datoString = JOptionPane.showInputDialog(msj);

			if (datoString.matches("(^[0-9]{1})+") == true) {

				dato = Integer.parseInt(datoString);
				showInfo("valor exitoso.");
			} else {
				showInfo("El Numero ingresado no puede ser una letra o menor que 0. ");
			}
		} while (datoString.matches("(^[0-9]{1})+") == false);
		dato = Integer.parseInt(datoString);
		return dato;
	}

	// ///PERMITE INGRESAR NUMEROS NEGATIVOS Y POSITIVOS
	public int requestOnlyInt(String msj) {
		int numero = 0;
		boolean valida = true;
		String strNumero = ""; // variable que almacena el dato ingresado por el
								// usuario
		do {
			strNumero = JOptionPane.showInputDialog(null, msj);
			try {
				numero = Integer.parseInt(strNumero);
				valida = true;
			} catch (NumberFormatException e) {
				showInfo("El dato Ingresado no es un numero");
				valida = false;
			}
		} while (valida == false);

		return numero;
	}

	// SOLO PERMITE INGRESAR TEXTO NO DEJA NI CARACTERES ESPECIALES NI NUMEROS
	public String requestOnlyString(String msj) {
		String dato = "";
		do {
			dato = JOptionPane.showInputDialog(msj);
			if (dato.matches("([A-Z]|[a-z]|"
					+ "[  ])+") == false) {
				showInfo("El Valor ingresado no es Valido");
			}
		} while (dato.matches("([A-Z]|[a-z]|[ ])+") == false);

		return dato;
	}
        
        public boolean validateStringBoolean(String msj) {
			if (msj.matches("([A-Z]|[a-z]|"+ "[  ])+") == false) {
                                return false;
                        }else{
                            return true;
                        }
	}
        
        public boolean validateCharBoolean(String msj) {
			if (msj.matches("[yn]") == false) {
                                return false;
                        }else{
                            return true;
                        }
	}
        
	public String requestOnlyString(String msj, int indice) {
		String dato = "";
		do {
			
			dato = JOptionPane.showInputDialog(msj);
			if (dato.matches("([A-Z]|[a-z]|"
					+ "[  ])+") == false) {
				showInfo("El Valor ingresado no es Valido");
			}
		} while (dato.matches("([A-Z]|[a-z]|[ ])+") == false);

		return dato;
	}

}
