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

// Interfata publica Image
public interface Image {
	
	// Metoda display() de tip void - fara implementare
	public void display();

}
