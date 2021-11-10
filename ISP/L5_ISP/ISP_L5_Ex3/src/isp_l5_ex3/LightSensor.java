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

// Clasa publica LightSensor, care mosteneste clasa abstracta Sensor
public class LightSensor {
	
	// Variabila de instanta pentru clasa LightSensor
	Random lightSensor = new Random();
	
	// Metoda readValue(), abstracta
	public int readValue() {
		return lightSensor.nextInt(100);
	}
}
