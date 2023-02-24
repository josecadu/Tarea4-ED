package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
		int numero ;
		String calific ;
		System.out.print("Introduzca el valor de una calificación: ");
		numero = reader.nextInt();

		if (numero >= 0 && numero < 5)						
			calific = "Suspenso";     
		else if (numero >= 5 && numero < 7)
			calific = "Aprobado";
		else if (numero >= 7 && numero <9)
			calific = "Notable";
		else if (numero >= 9 && numero <= 10)
			calific = "Sobresaliente";
		else
			calific = "El valor de la calificación introducida no es correcta";

		System.out.println(calific);
		reader.close() ;
	}
}