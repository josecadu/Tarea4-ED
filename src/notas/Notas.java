package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
		int numero ;
		String calific ;
		System.out.print("Introduzca el valor de una calificación: ");
		numero = reader.nextInt();

		calific = Califica.califica(numero);

		System.out.println(calific);
		reader.close() ;
	}
}