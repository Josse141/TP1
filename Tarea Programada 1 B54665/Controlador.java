/**
 * 
 * Clase Controlador que maneja los datos otorgados por la interfaz y Action Listener y los pasa a logica
 * 
 * @author josse
 * 
 * @version 0.9
 *
 */
public class Controlador {


	private Vista interfaz;


	JugadorVirtual jugadorVirtual = new JugadorVirtual();


	Logica logica = new Logica();

	StringBuilder tableroLogica[][];


	public Controlador() {


		this.iniciar();


		interfaz = new Vista(this);


		interfaz.mostrar();


	}
	/**
	 * 
	 * Inicio de menu para programa
	 */
	public void iniciar() {

		logica.llenarTablero();


		//prueba de llenado de tablero
		System.out.println("Tablero creado");

		//	interfaz.menu();



	}

	/**
	 * 
	 * Se encarga de chequear si el juego tiene ganador e indicar en pantalla
	 */
	public void chequearGanador() {

		if(logica.revisarGanador().contentEquals("El Jugador Ganado es el Jugador Numero 1")) {

			interfaz.showMessage("El Jugador Ganado es el Jugador Numero 1");
			
		}else {

			if(logica.revisarGanador().contentEquals("El Jugador Ganado es el Jugador Numero 2")) {

				interfaz.showMessage("El Jugador Ganado es el Jugador Numero 2");
				
			}else {
				
				if(logica.revisarGanador().contentEquals("No Hay Ganador")) {

					interfaz.showMessage("No Hay Ganador");
					
				}
			}
			
		}
	}

	public int columnaLibre(int columna) {


		return logica.espacioEnColumna(columna);
	}

	/**
	 * 
	 * Turno Jugador 1 o Humano
	 */
	public void turnoJugador1(int fila, int columna) {
		/*
		 * 
		 * 
		 */
		logica.agregarFicha(fila, columna, "N");

	}

	/**
	 * 
	 * Elige la columna de la maquina
	 * 
	 * @return
	 */

	public int columnaJugador2() {

		return jugadorVirtual.elegirColumna();

	}

	/**
	 * 
	 * Turno Jugador 2 o Maquina
	 */

	public void turnoJugador2(int fila, int columna) {
		/*
		 * 
		 * 
		 */
		logica.agregarFicha(fila, columna, "B");


	}


	/**
	 * 
	 * Ficha Jugador 1
	 * 
	 * @param fila
	 * @param columna
	 */
	
	
	public boolean agregarFichaJ1(int fila, int columna) {

		if(this.columnaLibre(columna)>-1) {

			this.turnoJugador1(this.columnaLibre(columna), columna);

			interfaz.setCasilla(fila, columna, "N");

			logica.agregarFicha(fila, columna, "N");

			this.setTableroLogica(logica.getTablero());
			
			return true;

		}else {
			
			return false;
		}

	}
	
	
	/**
	 * 
	 * Ficha Jugador 2
	 * 
	 * @param fila
	 * @param columna2
	 */


	public boolean agregarFichaJ2() {
		
		int columna2 = this.columnaJugador2();

		int fila = this.columnaLibre(columna2);	
				
		
		if(this.columnaLibre(columna2)>-1) {
		
		
		if(this.columnaLibre(this.columnaJugador2())>-1) {

			this.turnoJugador2(this.columnaLibre(columna2), columna2);

			interfaz.setCasilla(fila, columna2, "B");

			logica.agregarFicha(fila, columna2, "B");

			this.setTableroLogica(logica.getTablero());
			
			return true;

			// si no hay espacio disponible para jugador 2, vuelva a intentar colocar ficha en otro lugar

		}else {

			if(this.columnaLibre(this.columnaJugador2())==-1) {

				columna2 = this.columnaJugador2();

				fila = this.columnaLibre(columna2);		

				while(this.columnaLibre(this.columnaJugador2())==-1) {

					this.turnoJugador2(this.columnaLibre(columna2), columna2);

					interfaz.setCasilla(fila, columna2, "B");

					logica.agregarFicha(fila, columna2, "B");

					return true;
				}		


			}else{ 

				if(this.columnaLibre(this.columnaJugador2())<-1) {
					
				this.agregarFichaJ2();
				
				
				}else {
					
					interfaz.showMessage("No se pudo encontrar espacio para la ficha del jugador 2");
						
					return false;
						
					}
				}
			
			}
		}
		return false;
		
	}






	public void setTableroLogica(StringBuilder tab[][]) {

		tableroLogica = tab;

		logica.setTablero(tableroLogica);

	}

	public StringBuilder[][] getTableroLogica() {


		logica.getTablero();

		return tableroLogica;
	}

}
