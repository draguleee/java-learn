/*
 * Exemplul 1
 * 
 * Programul urmator exemplifica o aplicatie ce construieste o fereastra grafica si o afiseaza pe 
 * ecran.
 */

package isp_l9_ui1;

import javax.swing.*;


// Clasa publica SimpleApp, care extinde clasa JFrame
public class SimpleApp extends JFrame {
	
	// Constructor - fara parametrii
	public SimpleApp() {
		setTitle("Titlul ferestrei");						// Seteaza titlul ferestrei
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// Seteaza operatiunea de terminare a programului (inchiderea ferestrei)
		setSize(400,500);									// Seteaza dimensiunea ferestrei
		setVisible(true);									// Seteaza vizibilitatea ferestrei
	}
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unei ferestre
		SimpleApp a = new SimpleApp();
	}

}
