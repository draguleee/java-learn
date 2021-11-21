/*
 * Exercitiul 3
 * 
 * Simulatorul de trafic feroviar este prezentata mai jos. Sa se implementeze si sa se ruleze
 * programul si apoi sa se rezolve urmatoarele specificatii:
 * - Sa se creeze diagrama UML a acestei aplicatii
 * - Sa se modifice aplicatia astfel incat controller-ul sa comunice cu un numar nelimitat de 
 * controllere vecine
 * - Sa se modifice metoda main() in asa fel incat sa se demonstreze comportamentul aplicatiei
 * modificate si sa se creeze 3 statii interconectate intre ele.
 */

package isp_l8_ex3;


// Clasa publica Train
public class Train {
	
	// Atributele / variabilele de instanta pentru clasa Train
	String destination;
	String name;
	
	// Constructor - parametrii: destination (String), name (String)
	public Train(String destination, String name) {
		super();
		this.destination = destination;
		this.name = name;
		System.out.println("Constructor cu argumente Train.");
	}
	
	// Metoda getDestination() - fara parametrii
	// Returneaza destinatia la care trebuie sa ajunga trenul
	public String getDestination() {
		return this.destination;
	}
	
	// Metoda getName() - fara parametrii
	// Returneaza numele trenului
	public String getName() {
		return this.name;
	}

}
