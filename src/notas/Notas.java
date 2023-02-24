package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
		int numero ;
		String calific ;
		System.out.print("Introduzca el valor de una calificación: ");
		numero = reader.nextInt();

		calific = califica(numero);

		System.out.println(calific);
		reader.close() ;
	}

	/**
	 * @param num_nota
	 * @return
	 */
	public static String califica(int num_nota) {
		String calific;
		if (num_nota >= 0 && num_nota < 5)						
			calific = "Suspenso";     
		else if (num_nota >= 5 && num_nota < 7)
			calific = "Aprobado";
		else if (num_nota >= 7 && num_nota <9)
			calific = "Notable";
		else if (num_nota >= 9 && num_nota <= 10)
			calific = "Sobresaliente";
		else
			calific = "El valor de la calificación introducida no es correcta";
		return calific;
	}
}