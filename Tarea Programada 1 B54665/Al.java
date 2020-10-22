/**
 * Clase Action Listener que recibe la informacion de los botones de la interfaz del tablero
 * 
 * @author Jose Alonso Mora
 * 
 * B54665
 * 
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Al implements ActionListener{

	public Vista interfaz;
	private Logica logica = new Logica();
	public Controlador controlador;

	int columna;

	public Al(Vista i, Controlador c) {
		controlador= c ;
		interfaz = i;
	}

	public void actionPerformed(ActionEvent arg0) {

		int fila;
		
		String h = arg0.getActionCommand();

		switch(h) {

		case "1":

			try {

				//actualiza el tablero en logica

				logica.setTablero(this.controlador.getTableroLogica());

				columna = Integer.parseInt("1");

				fila = this.controlador.columnaLibre(columna);

				//agrega la ficha de jugador 1

				if(controlador.agregarFichaJ1(fila, columna)==true) {


				}else {

					this.interfaz.showMessage("No hay espacio disponible en la columna seleccionada" + "\n" + "Por favor selecione otra");

					break;

				}

			}
			catch(Exception ArrayIndexOutOfBoundsException) {

				this.interfaz.showMessage("No hay espacio disponible en la columna seleccionada" + "\n" + "Por favor selecione otra");
			}




			try {

				//jugador 2 o Maquina

				//actualiza el tablero en logica
				logica.setTablero(this.controlador.getTableroLogica());


				//agrega la ficha de jugador 2

				if(controlador.agregarFichaJ2()==true){

					this.controlador.setTableroLogica(logica.getTablero());

				}

			}
			catch(Exception e) {


			}


			this.controlador.chequearGanador();


			break;
			//-----------------------------	

		case "2":

			try {

				logica.setTablero(this.controlador.getTableroLogica());

				columna = Integer.parseInt("2");

				fila = this.controlador.columnaLibre(columna);

				if(controlador.agregarFichaJ1(fila, columna)==true) {


				}else {

					this.interfaz.showMessage("No hay espacio disponible en la columna seleccionada" + "\n" + "Por favor selecione otra");

					break;


				}

			}
			catch(Exception ArrayIndexOutOfBoundsException) {

				this.interfaz.showMessage("No hay espacio disponible en la columna seleccionada" + "\n" + "Por favor selecione otra");
			}




			try {

				//jugador 2 o Maquina

				//actualiza el tablero en logica
				logica.setTablero(this.controlador.getTableroLogica());


				//agrega la ficha de jugador 2

				if(controlador.agregarFichaJ2()==true){

					this.controlador.setTableroLogica(logica.getTablero());

				}

			}
			catch(Exception e) {


			}
			
			this.controlador.chequearGanador();

			break;

			//-----------------------


		case "3":
			try {

				logica.setTablero(this.controlador.getTableroLogica());

				columna = Integer.parseInt("3");


				fila = this.controlador.columnaLibre(columna);

				if(controlador.agregarFichaJ1(fila, columna)==true) {


				}else {

					this.interfaz.showMessage("No hay espacio disponible en la columna seleccionada" + "\n" + "Por favor selecione otra");

					break;

				}

			}
			catch(Exception ArrayIndexOutOfBoundsException) {

				this.interfaz.showMessage("No hay espacio disponible en la columna seleccionada" + "\n" + "Por favor selecione otra");
			}




			try {

				//jugador 2 o Maquina

				//actualiza el tablero en logica
				logica.setTablero(this.controlador.getTableroLogica());


				//agrega la ficha de jugador 2

				if(controlador.agregarFichaJ2()==true){

					this.controlador.setTableroLogica(logica.getTablero());

				}

			}
			catch(Exception e) {


			}

			
			this.controlador.chequearGanador();
			

			break;
			//-----------------------------	

		case "4":

			//Jugador 1 o Humano

			try {

				logica.setTablero(this.controlador.getTableroLogica());

				columna = Integer.parseInt("4");


				fila = this.controlador.columnaLibre(columna);

				//agrega la ficha de jugador 1

				if(controlador.agregarFichaJ1(fila, columna)==true) {


				}else {

					this.interfaz.showMessage("No hay espacio disponible en la columna seleccionada" + "\n" + "Por favor selecione otra");

					break;

				}

			}
			catch(Exception ArrayIndexOutOfBoundsException) {

				this.interfaz.showMessage("No hay espacio disponible en la columna seleccionada" + "\n" + "Por favor selecione otra");
			}




			try {

				//jugador 2 o Maquina

				//actualiza el tablero en logica
				logica.setTablero(this.controlador.getTableroLogica());


				//agrega la ficha de jugador 2

				if(controlador.agregarFichaJ2()==true){

					this.controlador.setTableroLogica(logica.getTablero());

				}

			}
			catch(Exception e) {


			}


			this.controlador.chequearGanador();
			
			break;
			//-----------------------------	


		case "5":

			try {

				logica.setTablero(this.controlador.getTableroLogica());

				columna = Integer.parseInt("5");

				fila = this.controlador.columnaLibre(columna);

				if(controlador.agregarFichaJ1(fila, columna)==true) {


				}else {

					this.interfaz.showMessage("No hay espacio disponible en la columna seleccionada" + "\n" + "Por favor selecione otra");

					break;

				}

			}
			catch(Exception ArrayIndexOutOfBoundsException) {

				this.interfaz.showMessage("No hay espacio disponible en la columna seleccionada" + "\n" + "Por favor selecione otra");
			}




			try {

				//jugador 2 o Maquina

				//actualiza el tablero en logica
				logica.setTablero(this.controlador.getTableroLogica());


				//agrega la ficha de jugador 2

				if(controlador.agregarFichaJ2()==true){

					this.controlador.setTableroLogica(logica.getTablero());

				}

			}
			catch(Exception e) {


			}


			this.controlador.chequearGanador();

			break;
			//-----------------------------	

		case "6":

			try {

				logica.setTablero(this.controlador.getTableroLogica());

				columna = Integer.parseInt("6");

				fila = this.controlador.columnaLibre(columna);

				if(controlador.agregarFichaJ1(fila, columna)==true) {


				}else {

					this.interfaz.showMessage("No hay espacio disponible en la columna seleccionada" + "\n" + "Por favor selecione otra");

					break;

				}

			}
			catch(Exception ArrayIndexOutOfBoundsException) {

				this.interfaz.showMessage("No hay espacio disponible en la columna seleccionada" + "\n" + "Por favor selecione otra");
			}




			try {

				//jugador 2 o Maquina

				//actualiza el tablero en logica
				logica.setTablero(this.controlador.getTableroLogica());


				//agrega la ficha de jugador 2

				if(controlador.agregarFichaJ2()==true){

					this.controlador.setTableroLogica(logica.getTablero());

				}

			}
			catch(Exception e) {


			}
			
			this.controlador.chequearGanador();


			break;
			//-----------------------------	

		case "7":

			try {

				logica.setTablero(this.controlador.getTableroLogica());

				columna = Integer.parseInt("7");

				fila = this.controlador.columnaLibre(columna);

				if(controlador.agregarFichaJ1(fila, columna)==true) {


				}else {

					this.interfaz.showMessage("No hay espacio disponible en la columna seleccionada" + "\n" + "Por favor selecione otra");

					break;

				}

			}
			catch(Exception ArrayIndexOutOfBoundsException) {

				this.interfaz.showMessage("No hay espacio disponible en la columna seleccionada" + "\n" + "Por favor selecione otra");
			}




			try {

				//jugador 2 o Maquina

				//actualiza el tablero en logica
				logica.setTablero(this.controlador.getTableroLogica());


				//agrega la ficha de jugador 2

				if(controlador.agregarFichaJ2()==true){

					this.controlador.setTableroLogica(logica.getTablero());

				}

			}
			catch(Exception e) {


			}

			this.controlador.chequearGanador();

			break;
			//-----------------------------	


		default:

			



			break;

		}

	}


}

