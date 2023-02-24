package notas;

import java.util.Scanner;
/**
 * @author jmcab
 * Aqui dimos formato al codigo 
 * mejoramos el codigo con la ayuda de la herramienta PMD
 * refactorizamos las variables para que fueran mas descriptivas
 * refactorizamos el codigo que valora la calificacion generandolo en un metodo,
 * renombrando el metodo y su parametro de entrada
 * y por ultimo le dimos una clase propia a ese metodo 
 */

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