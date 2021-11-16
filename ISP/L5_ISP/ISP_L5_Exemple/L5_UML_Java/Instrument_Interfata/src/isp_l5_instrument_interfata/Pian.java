/*
 * Clasa Pian
 * 
 * Exemplu implementare interfata
 */

package isp_l5_instrument_interfata;

// Clasa Pian
public class Pian implements Instrument {

	// Metoda play() - fara parametrii, dar de data asta trebuie sa aiba o implementare
	// Deoarece clasa Pian implementeaza interfata Instrument
	public void play() {
		System.out.println("Piano is playing.");
	}
}
