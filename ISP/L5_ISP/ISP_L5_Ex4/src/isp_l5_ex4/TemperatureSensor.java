/* 
 * Exercitiul 4
 * 
 * Sa se actualizeze clasa Controller din exercitiul anterior astfel incat sa fie implementat
 * ca fiind un Singleton.
 */

package isp_l5_ex4;

import java.util.Random;

//Clasa publica TemperatureSensor, care mosteneste clasa abstracta Sensor
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
