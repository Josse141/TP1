/**
 * Jugador Virtual que elige la columna en la que va a jugar
 * 
 * @author jose Alonso Mora
 * 
 * @version 1.0
 * 
 */

import java.util.Random;

public class JugadorVirtual {
	
	Random generador = new Random();

		
	public JugadorVirtual() {
		
		
	}
	
	/**
	 * 
	 * Elige la columna en la que va a jugar el jugador 2
	 * 
	 * @return
	 */
	
	public int elegirColumna() {
		
		return generador.nextInt(7)+1;
		
	}
}
