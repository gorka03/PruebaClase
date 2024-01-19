/*19.Realiza la clase Java Valorabs que lee el valor de un número real por teclado y muestra su valor absoluto
por pantalla.*/

package prueba;

import java.util.Scanner;

public class gorka {

	public static void main(String[] args) {

		// Declarar variable
		Scanner teclado = new Scanner(System.in);
		int numero;

		// Devuelve el valor absoluto
		System.out.println("Dame un numero real: ");
		numero = teclado.nextInt();
		if (numero < 0) {
			System.out.println("Su valor absoluto es " + (numero * -1));
		} else {
			System.out.println("Su valor absoluto es " + (numero));

		}
		teclado.close();
	}

}