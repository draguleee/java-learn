/* 
 * Exercitiul 3
 * 
 * Sa se implementeze o aplicatie bazata pe diagrama UML din laborator. Sa se creeze o clasa de test
 * pentru testarea programului.
 * 
 * Sa se urmareasca instructiunile si sa se implementeze programul in acord cu specificatiile.
 */

package isp_l5_ex3;

import java.util.*;
import java.util.concurrent.TimeUnit;

// Clasa publica Controller
public class Controller {
	
	// Variabilele de instanta (relatia HAS-A)
	// Avem un obiect tempSensor, de clasa TemperatureSensor
	// Avem un obiect lightSensor, de clasa LightSensor
	public TemperatureSensor tempSensor = new TemperatureSensor();
	public LightSensor lightSensor = new LightSensor();
	
	// Metoda control, care afiseaza valoriile senzorilor timp de 20s, cu o perioada de 1s
	public void control() throws InterruptedException {
		for(int i=0 ; i<=20 ; i++) {													// Perioada de timp
			System.out.println("Temperatura: " + tempSensor.readValue());				// Afisarea valorii temperaturii
			System.out.println("Intensitatea luminii: " + lightSensor.readValue());		// Afisarea valorii intensitatii luminoase
			System.out.println();
			TimeUnit.SECONDS.sleep(1);													// Perioada de o secunda intre masuratori
		}
	}
}
