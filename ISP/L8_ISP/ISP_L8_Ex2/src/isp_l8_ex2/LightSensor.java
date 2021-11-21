/*
 * Exercitiul 2
 * 
 * Sa se creeze diagrama UML pentru clasa Sensor
 */

package isp_l8_ex2;

import java.util.Random;


// Clasa publica LightSensor, care extinde / mosteneste clasa Sensor
public class LightSensor extends Sensor{
	
	// Variabila de instanta pentru clasa LightSensor
	Random lightSensor = new Random();
	
	// Metoda readValue(), abstracta
	public int readValue() {
		return lightSensor.nextInt(100);
	}
	
	// Metoda getLocation()
	public String getLocation() {
		return super.getLocation();
	}

}
