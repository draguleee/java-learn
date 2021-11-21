/*
 * Exercitiul 4
 * 
 * Sa se implementeze un simulator de home automation.
 */

package isp_l8_ex4;

import java.util.*;


// Clasa publica abstracta Home
public abstract class Home {

	// Atributele / variabilele de instanta pentru clasa Home
	private Random r = new Random();
	private final int SIMULATION_STEPS = 20;
	
	// Metoda setValueInEnvironment() - parametrii: event (Event) - metoda abstracta
	// Seteaza o valoare de mediu
	protected abstract void setValueInEnvironment(Event event);

	// Metoda controlStep() - fara parametrii - metoda abstracta
	protected abstract void controlStep();
	
	// Metoda getHomeEvent() - fara parametrii
	private Event getHomeEvent() {
		int i = r.nextInt(100);
		if(i < 30) {
			return new NoEvent();
		}
		else if(i < 60) {
			return new FireEvent(r.nextBoolean());
		}
		else {
			return new TemperatureEvent(r.nextInt(50));
		}
	}
	
	// Metoda simulate() - fara parametrii
	public void simulate() {
		int i = 0;
		while(i < SIMULATION_STEPS) {
			Event event = this.getHomeEvent();
			setValueInEnvironment(event);
			controlStep();
			try {
				Thread.sleep(300);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}
}
