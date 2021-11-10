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

// Clasa publica ProxyImage, care implementeaza interfata Image
public class ProxyImage implements Image {
	
	// Variabile de instanta
	private RealImage realImage;			// Imaginea reala
	private String fileName;				// Numele fisierului
	Image[] images = new Image[3];			// Imagini
	
	// Constructor default
	public ProxyImage() {
		images[0] = callImage("abc");
		images[1] = callImage("def");
		images[2] = callImage("ghi");
	}
	
	// Constructor pentru clasa ProxyImage
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	// Metoda callImage()
	public Image callImage(String filename) {
		int i = (int)(Math.random()*10);
		if(i<5) {
			return new RealImage(fileName);
		}
		else {
			return new RotatedImage(fileName);
		}
	}
	
	@Override
	
	// Metoda display() - implementata in clasa ProxyImage, oferita de interfata Image
	public void display() {
		if(realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
