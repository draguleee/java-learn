/*
 * Exercitiul 2
 * 
 * Sa se creeze diagrama UML pentru clasa Sensor
 */

package isp_l8_ex2;

import java.util.concurrent.TimeUnit;


// Clasa publica Controller
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
