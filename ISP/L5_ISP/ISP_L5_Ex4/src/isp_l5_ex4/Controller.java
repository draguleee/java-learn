/* 
 * Exercitiul 4
 * 
 * Sa se actualizeze clasa Controller din exercitiul anterior astfel incat sa fie implementat
 * ca fiind un Singleton.
 */

package isp_l5_ex4;

import java.util.concurrent.TimeUnit;

// Clasa publica Controller, implementata ca un Singleton (Design Pattern)
public class Controller {
	
	// Variabilele de instanta - private, statice
	private static TemperatureSensor tempSensor = new TemperatureSensor();
	private static LightSensor lightSensor = new LightSensor();
	private static Controller controller = new Controller();
	
	// Constructorul clasei - privat
	// Se blocheaza mecanismul standard de construire a obiectelor folosind operatorul "new",
	// deoarece, fiind privati, constructorii nu mai sunt accesibili din exteriorul clasei
	private Controller() {}
	
	// Metoda control() - statica
	public static void control() throws InterruptedException {
		for(int i=0 ; i<=20 ; i++) {													// Perioada de timp
			System.out.println("Temperatura: " + tempSensor.readValue());				// Afisarea valorii temperaturii
			System.out.println("Intensitatea luminii: " + lightSensor.readValue());		// Afisarea valorii intensitatii luminoase
			System.out.println();
			TimeUnit.SECONDS.sleep(1);													// Perioada de o secunda intre masuratori
		}
	}
	
	// Metoda main
	public static void main(String[] args) throws InterruptedException {
		Controller controller = new Controller();
		controller.control();
	}
}
