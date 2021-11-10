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

// Clasa publica RotatedImage, care implementeaza interfata Image
public class RotatedImage implements Image {
	
	// Variabile de instanta
	private RealImage realImage;			// Imaginea reala
	private String fileName;				// Numele fisierului
	
	// Constructor pentru clasa RotatedImage
	public RotatedImage(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	
	// Metoda display() - implementata in clasa RotatedImage, oferita de interfata Image
	public void display() {
		if(realImage == null) {
			realImage = new RealImage(fileName);
		}
		System.out.println("Display rotated " + fileName);
	}

}
