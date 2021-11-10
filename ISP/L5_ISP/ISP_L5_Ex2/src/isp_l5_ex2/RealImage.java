/*
 * Exercitiul 2
 * 
 * Sa se urmareasca instructiunile si sa se implementeze un program conform specificatiilor. Sa se creeze
 * o clasa potrivita pentru testarea programului.
 * 
 * Pentru aplicatia Image din cod:
 * - Sa se creeze diagrama de clase UML
 * Sa se adauge o noua implementare a interfetei Image numita 'RotatedImage' care va afisa mesajul
 * "Display rotated" + fileName
 * - Sa se adauge schimbarile necesare in clasa ProxyImage astfel incat, depinzand de un argument al
 * constructorului dat in aceasta clasa, proxy va apela ori functionalitatea imaginii reale, ori 
 * functionalitatea imaginii rotite.
 */

package isp_l5_ex2;

// Clasa publica RealImage, care implementeaza interfata Image
public class RealImage implements Image {

	// Variabilele de instanta
	private String fileName;
	
	// Constructor pentru clasa RealImage
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}
	
	@Override
	
	// Metoda display() - implementata in clasa RealImage, oferita de interfata Image
	public void display() {
		System.out.println("Displaying: " + fileName);
	}
	
	// Metoda loadFromDisk()
	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName + "...");
	}
}
