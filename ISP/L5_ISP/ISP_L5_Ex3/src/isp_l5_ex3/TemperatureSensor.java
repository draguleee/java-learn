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

// Clasa publica TemperatureSensor, care mosteneste clasa abstracta Sensor
public class TemperatureSensor extends Sensor {
	
	// Variabila de instanta pentru clasa TemperatureSensor
	Random tempSensor = new Random();
	
	// Metoda readValue(), abstracta
	public int readValue() {
		return tempSensor.nextInt(100);
	}
	
	// Metoda getLocation()
	public String getLocation() {
		return super.getLocation();
	}

}
