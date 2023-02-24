/**
 * 
 */
package notas;

/**
 * @author jmcab
 *
 */
public class Califica {

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
