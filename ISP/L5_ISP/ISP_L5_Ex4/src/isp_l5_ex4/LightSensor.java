/* 
 * Exercitiul 4
 * 
 * Sa se actualizeze clasa Controller din exercitiul anterior astfel incat sa fie implementat
 * ca fiind un Singleton.
 */

package isp_l5_ex4;

import java.util.Random;

//Clasa publica LightSensor, care mosteneste clasa abstracta Sensor
public class LightSensor {
	
	// Variabila de instanta pentru clasa LightSensor
	Random lightSensor = new Random();
	
	// Metoda readValue(), abstracta
	public int readValue() {
		return lightSensor.nextInt(100);
	}
}