package Model;

import InOut.ClassInOut;
import java.util.Random;

public class HangManClass {

	ClassInOut obj2IO = new ClassInOut();
	Model.RedirectionClass objectRedirect = new RedirectionClass();

	public int indice = 0;
	public char letra = ' ';
	public String[] dibujo = { "q", "(", "X", "_", "X", ")", "p" };
	public String[] errores = { "", "", "", "", "", "", "" };
	public String palabra = "";
	public String[] guiones;

	public void validOption(int opc) {
		if (opc < 1 || opc > 4) {
			obj2IO.showError("Opcion Errada");
		}
	}

	public boolean repLetter(String repetida) {
		boolean buscar = false;
		for (int x = 0; x < repetida.length(); x++) {
			if (repetida.charAt(x) == letra) {
				buscar = true;
			}
		}
		return buscar;
	}

	public void searchLetter() {
		boolean buscar = false;
		for (int x = 0; x < palabra.length(); x++) {
			if (palabra.charAt(x) == letra) {
				buscar = true;
			}
		}
		if (buscar == true) {

		} else {
			errores[indice] = dibujo[indice];
			indice++;
			obj2IO.showInfo("THE SECRET WORD DOES NOT HAVE TH LETTER : '" + letra+"'");

		}
	}

	public String[] giveGuiones() {
		guiones = new String[palabra.length()];
		for (int x = 0; x < guiones.length; x++) {
			guiones[x] = "_";
		}
		return guiones;
	}

	public String[] inicializarArray(String array[]) {
		for (int x = 0; x < array.length; x++) {
			array[x] = "";
		}
		return array;
	}

	public String[] searchPositionletter() {
		for (int x = 0; x < palabra.length(); x++) {
			if (palabra.charAt(x) == letra) {
				guiones[x] = String.valueOf(letra);
			}
		}
		return guiones;
	}

	public String showArreglo(String[] arreglo) {
		String text = "";
		for (int x = 0; x < arreglo.length; x++) {
			text += "  " + arreglo[x];
		}
		return text;
	}

	public boolean validWin() {
		boolean win = true;
		String text = "";
		for (int x = 0; x < guiones.length; x++) {
			if (guiones[x].equals("_")) {
				win = false;
			}
		}
		return win;
	}

	public void validChar(String text) {

		do {
			letra = obj2IO.requestInfoChar();
			if (letra < 97 || letra > 122) {
				obj2IO.showError("THE CHARACTER ENTERED IS INVALID. \n WATCH CAPITAL LETTERS OR NUMBERS");
			}
			if (repLetter(text) == true) {
				obj2IO.showError("THE LETTER HAS ALREADY BEEN WRITTEN");
			}

		} while (letra < 97 || letra > 122 || repLetter(text) == true);
	}

	public void executeMenu() {
		Class_Sentences obWords = new Class_Sentences();

		String letrasDigitadas = "";
		palabra = obWords.selectWord();
		giveGuiones();
		obj2IO.showInfo("PLAY....\n");

		do {

			obj2IO.showInfo(showArreglo(guiones) + "\n\nLETTERS ENTERED: "
					+ letrasDigitadas + "\n\nFIGURE: \n" + showArreglo(errores));
			validChar(letrasDigitadas);
			letrasDigitadas += letra + ", ";
			searchLetter();
			guiones = searchPositionletter();
		} while (errores[6] != "p" && validWin() == false);

		char election = ' ';
		if (validWin() == true) {
			obj2IO.showInfo("CONGRATULATIONS!!!!!!\nYOU WIN\n ( ^ _ ^ )"
					+ "\nSECRET WORD: " + palabra);
			obj2IO.showInfo("You Win!! , Do you want play again? y/n\n ");
			election = obj2IO.requestInfoChar();
			if (election == 'y' || election == 'Y') {
				executeMenu();
			} else {
				objectRedirect.redireccionProyecto();
			}
		} else {
			obj2IO.showInfo(showArreglo(errores) + "\nTHE SECRET WORD WAS: "
					+ palabra);
			obj2IO.showInfo("You Lose, Do you want play again? y/n\n ");
			election = obj2IO.requestInfoChar();
			if (election == 'y' || election == 'Y') {
				executeMenu();
			} else {
				objectRedirect.redireccionProyecto();
			}
		}
		inicializarArray(errores);
		indice = 0;

	}

}
