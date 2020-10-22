/**
 * Clase que maneja la logica y almacena los datos del programa
 * 
 * @author Jose Alonso Mora 
 * 
 * B54665
 * 
 * @version 0.9
 */
public class Logica {

	private StringBuilder [] [] tablero = new StringBuilder[6][7];

	private int jugadorGanador=10;

	private String tableroImpresion;

	private final StringBuilder inicialTablero = new StringBuilder(".");
	
	String chequeo = "";
	
	


	/**
	 * 
	 * Constructor de Logica()
	 * 
	 */

	public Logica() {


	}

	/**
	 * 
	 * Llena el tablero con String con puntos iniciales
	 * 
	 */

	public void llenarTablero () {

		for(int filas = 0; filas < 6; filas++) {

			for(int columnas = 0; columnas < 7; columnas++) {

				tablero [filas] [columnas] = new StringBuilder(".");

				//prueba de creacion de tablero

				System.out.println(tablero);

			}
		}
	}


	/**
	 * 
	 * Chequea si hay espacio en la columna para agregar un simbolo
	 * 
	 * @param columna
	 * @return
	 */

	public int espacioEnColumna(int columna) {

		for(int indice = 6; indice >0; indice--) {

			if((tablero[indice-1][columna-1].toString()).contentEquals(inicialTablero.toString())) {

				return indice;

			}


		}

		return -1;

	}



	/**
	 * 
	 * Agrega ficha en el tablero cuando controlador pide
	 * 
	 * @param fila
	 * @param columna
	 * @param ficha
	 */

	public void agregarFicha(int fila, int columna, String ficha) {

		tablero[fila-1][columna-1].replace(0, 1, ficha);

		this.imprimirTablero();
	}


	/**
	 * 
	 * chequea el tablero para ver si existen 4 en linea o no
	 * 
	 * @return
	 */

	public String revisarGanador() {

		int filaParaRevisar = 0;
		
		this.revisarLineasVerticales(filaParaRevisar);
		
		this.revisarLineasHorizontales(filaParaRevisar);
		
		this.revisarLineasDiagonales(filaParaRevisar);
		
		if(this.getJugadorGanador() == 1) {

			return "El Jugador Ganador es el Jugador Numero 1";
		}else {

			if(this.getJugadorGanador() == 2) {

				return "El Jugador Ganador es el Jugador Numero 2";
			}else {

				if(this.getJugadorGanador() == 10) {
					
					
				return "No hay Ganador";
				}
			}

		}
		return null;
	}

	/**
	 * 
	 * imprimir tablero en cualquier lugar por medio de un String
	 * @return
	 */
	public String imprimirTablero(){

		for(int filas = 0; filas < 6; filas++) {

			for(int columnas = 0; columnas < 7; columnas++) {

				tableroImpresion = tableroImpresion + tablero [filas] [columnas];


			}

			tableroImpresion = tableroImpresion + "\n";
		}

		System.out.println(tableroImpresion);
		return tableroImpresion;
	}

	/**
	 * 
	 * establece el tablero segun parametro recibido
	 * @param tab
	 */
	
	public void setTablero(StringBuilder tab[][]) {

		tablero=tab;
	}

	/**
	 * 
	 * devuelve el tablero
	 * 
	 * @return devuelve el tablero
	 */
	
	public StringBuilder[][] getTablero(){

		return tablero;
	}
	
	
	/**
	 * establece el valor de chequeo para uso de revision de ganador
	 * 
	 * @param lineaRevisar
	 * @return retorna linea String para chequea posibilidades de gane
	 */
	
	public String establecerChequeo(int lineaRevisar) {
		
		chequeo = "";
				
		int filas = lineaRevisar;
		
				
		for(int columna = 0; columna<6; columna++) {
		
			chequeo = chequeo + tablero[columna][filas];
		}
		
		return chequeo;
	}
	
	
	/**
	 * 
	 * Ganador en lineas Verticales
	 * 
	 * return si existiera una linea diagonal, retorna 1 si es "N" o 2 si es "B"
	 * 
	 * @param lineaRevisar
	 * @return 
	 */
	
	public void revisarLineasVerticales(int lineaRevisar) {
		
		
		
		chequeo = this.establecerChequeo(lineaRevisar);
		
		System.out.println(chequeo);
		
		int filas = lineaRevisar;
		
		int indice = 0;
		
		while (indice < 3) {
		
			String subChequeo = chequeo.substring(indice, indice+4);
			
			indice=indice+1;
			
			System.out.println(chequeo);
			
			if(subChequeo.contentEquals("NNNN")){
				
				this.setJugadorGanador(1);
				
				System.out.println(chequeo);				
			
			}else {
								
				
				if(subChequeo.contentEquals("BBBB")){
					
					this.setJugadorGanador(2);
				
			}else{
				
				if(filas<6) {
				
				filas = filas + 1;
				
				this.revisarLineasVerticales(filas);
				
				}else {
										
					
				}
			}
			
			}
		}
		
				
		}
		
	
	
	/**
	 * 
	 * Ganador en lineas Horizontales
	 * 
	 * @param lineaRevisar
	 * @return si existiera una linea diagonal, retorna 1 si es "N" o 2 si es "B"
	 */
	
	public void revisarLineasHorizontales(int lineaRevisar) {
		
		int columnas = lineaRevisar;

		chequeo = "";		


		for(int fila = 0; fila<7; fila++) {

			chequeo = chequeo + tablero[columnas][fila];
		}



		for (int indice = 0; indice < 2; indice++) {

			String subChequeo = chequeo.substring(indice, indice+4);

			if(subChequeo.contentEquals("NNNN")){

				this.setJugadorGanador(1);			

			}else {

				if(subChequeo.contentEquals("BBBB")){

					this.setJugadorGanador(2);

				}else{

					if(columnas<7) {

						columnas = columnas+1;

						this.revisarLineasVerticales(columnas);

					}else {


					}
				}

			}
		}
			
	}
	
	/**
	 * 
	 * Ganador en lineas Diagonales
	 * 
	 * @param lineaRevisar
	 * @return si existiera una linea diagonal, retorna 1 si es "N" o 2 si es "B"
	 */
	
	public int revisarLineasDiagonales(int lineaRevisar) {
		
		return -1;
	}
	
	/**
	 * da valor a jugador ganador
	 * 
	 * @param ganador asigna valor a jugadorGanador
	 */
	public void setJugadorGanador(int ganador) {
		
		jugadorGanador = ganador;
	}
	
	/**
	 * devuelve el valor de jugador ganador
	 * 
	 * @return jugadorGanador
	 */
	public int getJugadorGanador() {
		
		return jugadorGanador;
	}


}
