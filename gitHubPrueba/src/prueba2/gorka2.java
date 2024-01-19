/*20.Realiza la clase Java Parimpar que lee el valor de un número entero por teclado y muestra por pantalla si
es par o impar.*/

package prueba2;

import java.util.Scanner;

public class gorka2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero;

		System.out.println("Dame un numero entero: ");
		numero = teclado.nextInt();

		if (numero % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
		teclado.close();
	}

}
