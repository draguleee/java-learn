/*
 * Clasa Vioara
 * 
 * Exemplu implementare interfata
 */

package isp_l5_instrument_interfata;

// Clasa publica Vioara
public class Vioara implements Instrument {

	// Metoda play() - fara parametrii, dar de data asta trebuie sa aiba o implementare
	// Deoarece clasa Pian implementeaza interfata Instrument
	public void play() {
		System.out.println("Violin is playing.");
	}
}
