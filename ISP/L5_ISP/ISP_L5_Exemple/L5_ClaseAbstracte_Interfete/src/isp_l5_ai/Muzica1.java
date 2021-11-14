/*
 * Interfata Instrument1
 */

package isp_l5_ai;


// Interfata Instrument
interface Instrument1 {
	
	// Metoda play() - fara parametrii
	// Canta instrumentul
	void play();
	
}


// Clasa Pian, care implementeaza interfata Instrument
class Pian1 implements Instrument1 {
	
	// Metoda play() - fara parametrii
	// Obligatoriu implementata
	public void play() {
		System.out.println("Pian.play()");
	}
	
}


// Clasa Vioara, care implementeaza interfata Instrument
class Vioara1 implements Instrument1 {
	
	// Metoda play() - fara parametrii
	// Obligatoriu implementata
	public void play() {
		System.out.println("Vioara.play()");
	}
	
}


// Clasa publica Muzica, clasa principala
public class Muzica1 {
	
	// Metoda play() - parametrii: i (Instrument)
	// Metoda statica care porneste un instrument generic ce implementeaza interfata Instrument
	public static void play(Instrument1 i) {
		i.play();
	}
	
	// Metoda playAll() - parametrii: e (Instrument[])
	// Metoda statica care porneste mai multe instrumente generice ce implementeaza interfata Instrument
	public static void playAll(Instrument1[] e) {
		for(int i=0 ; i<e.length ; i++) {
			play(e[i]);
		}
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui instrument (obiect de tip Instrument)
		Instrument1[] orchestra = new Instrument1[2];
		
		// Crearea unui pian si a unei vioare
		int i=0;
		orchestra[i++] = new Pian1();
		orchestra[i++] = new Vioara1();
		
		// Canta instrumentele
		playAll(orchestra);
	}

}
