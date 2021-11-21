/*
 * Exercitiul 2
 * 
 * Sa se creeze diagrama UML pentru clasa Sensor
 */

package isp_l8_ex2;

import java.util.Random;


// Clasa TemperatureSensor extends Sensor
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
