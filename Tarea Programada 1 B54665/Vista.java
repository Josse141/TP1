/**
 * 
 * Clase interfaz que trabaja de la mano con la clase Al
 * 
 * @author Jose Alonso Mora
 * 
 * B54665
 * 
 * @version 1.0
 * 
 */

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Vista extends JFrame{

	
	private JButton tablero[][];
	
	private JButton botonesColumna[];

	
	private JOptionPane interfazPane = new JOptionPane(); 

	Controlador controlador;

	
	/**
	 * 
	 * Constructor de vista que recibe parametro de tipo Controlador para darle funcionalidad a clase Al
	 * 
	 * @param control controlador interno creado por Al para uso temporal
	 */
	
	public Vista(Controlador control) {
		
		this.setTitle("4 en Linea");
		controlador = control;
		Al al = new Al(this, control);


		setBounds(100, 100, 450, 750);
		setLayout(null);

		tablero = new JButton[6][7];


		/**
		 * 
		 * creacion de tablero de botones JFrame usando ciclo
		 * 
		 */

		for (int i = 0; i < tablero.length; i++) {

			for (int j = tablero[0].length-1; j >= 0; j--) {
				tablero[i][j] = new JButton("");
				tablero[i][j].setBounds(j*50+40, i*50+90, 50, 50);
				add(tablero[i][j]);

			}
			
		}
		
		botonesColumna = new JButton[7];
		
		int numeralesCalc = 0;
		
		for (int j = 0; j < botonesColumna.length; j++) {
			numeralesCalc++;
			botonesColumna[j] = new JButton(numeralesCalc + "");
			botonesColumna[j].setBounds(j*50+40, 0*50+400, 50, 50);
			botonesColumna[j].setActionCommand(numeralesCalc + "");
			botonesColumna[j].addActionListener(al);
			add(botonesColumna[j]);

		}
		
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	/**
	 * 
	 * hace visible la ventana del juego
	 * 
	 */

	public void mostrar() {
		setVisible(true);
		
	}
	
	
	/**
	 * 
	 * agrega la ficha del jugador al boton del tablero de la ventana
	 * 
	 * @param fila posicion de ficha en fila
	 * @param columna posicion de ficha en columna
	 * @param valor Color de ficha a utilizar por el jugador
	 */
	
	public void setCasilla(int fila, int columna, String valor) {
		
		tablero[fila-1][columna-1].setText(valor);
		
		setVisible(true);
	}

	/**
	 * 
	 * Salida universal para mensajes
	 * 
	 * @param mensaje
	 */
	
	@SuppressWarnings("static-access")
	public void showMessage(String mensaje){

		interfazPane.showMessageDialog(null, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE, null);

	}
}