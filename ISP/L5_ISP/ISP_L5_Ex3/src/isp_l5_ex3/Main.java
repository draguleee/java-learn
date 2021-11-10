/* 
 * Exercitiul 3
 * 
 * Sa se implementeze o aplicatie bazata pe diagrama UML din laborator. Sa se creeze o clasa de test
 * pentru testarea programului.
 * 
 * Sa se urmareasca instructiunile si sa se implementeze programul in acord cu specificatiile.
 */

package isp_l5_ex3;

// Clasa Main - programul principal
public class Main {
	
	// Metoda main - programul care se va rula
	public static void main(String[] args) throws InterruptedException {
		
		// Creare instanta de tip Controller
		Controller controller = new Controller();
		controller.control();
	}
}
