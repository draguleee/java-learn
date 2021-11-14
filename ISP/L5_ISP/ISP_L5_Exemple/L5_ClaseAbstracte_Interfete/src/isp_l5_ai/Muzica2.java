/*
 * Clasa abstracta Instrument2
 */

package isp_l5_ai;

import java.util.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.*;


// Clasa SoundController
class SoundController {
	
	// Metoda playSound() - parametrii: note (String), final
	public static void playSound(final String note) {
		try {
			Clip clip = AudioSystem.getClip();
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(Muzica2.class.getResourceAsStream(note));
			System.out.println("PLAY SOUND " + inputStream.getFrameLength());
			clip.open(inputStream);
			clip.start();
			while(!clip.isRunning()) {
				Thread.sleep(10);
			}
			while(clip.isRunning()) {
				Thread.sleep(10);
			}
			clip.close();
			System.out.println("Note played.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.err.println(ex.getMessage());
		}
	}
}


// Clasa abstracta Instrument
// Ofera o metoda fara implementare, doar cu semnatura, pe care subclasele trebuie sa o mosteneasca
abstract class Instrument2 {
	
	// Metoda play() - fara parametrii si fara implementare
	// Canta instrumentul
	abstract void play();
	
}


// Clasa Pian, care extinde / mosteneste clasa Instrument
class Pian2 extends Instrument2 {
	
	// Metoda play() - fara parametrii, dar de data aceasta trebuie implementata
	public void play() {
		System.out.println("Pian.play()");
		SoundController.playSound("piano1.wav");
	}
}


// Clasa Vioara, care extinde / mosteneste clasa Instrument
class Vioara2 extends Instrument2 {
	
	// Metoda play() - fara parametrii, dar de data aceasta trebuie implementata
	public void play() {
		System.out.println("Vioara.play()");
		SoundController.playSound("string1.wav");
	}
}


// Clasa Muzica2, clasa principala
public class Muzica2 {
	
	// Metoda play() - parametrii: i (Instrument)
	// Metoda statica care porneste un instrument generic ce implementeaza interfata Instrument
	public static void play(Instrument2 i) {
		i.play();
	}
	
	// Metoda playAll() - parametrii: e (Instrument[])
	// Metoda statica care porneste mai multe instrumente generice ce implementeaza interfata Instrument
	public static void playAll(Instrument2[] e) {
		for(int i=0 ; i<e.length ; i++) {
			play(e[i]);
		}
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui instrument (obiect de tip Instrument)
		Instrument2[] orchestra = new Instrument2[2];
		
		// Crearea unui pian si a unei vioare
		int i=0;
		orchestra[i++] = new Pian2();
		orchestra[i++] = new Vioara2();
		
		// Canta instrumentele
		playAll(orchestra);
	}

}
