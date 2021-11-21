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

// Clasa publica Segment
public class Segment {
	
	// Atributele / variabilele de instanta pentru clasa Segment
	public int id;
	public Train train;
	
	// Constructor - parametrii: id (int)
	public Segment(int id) {
		this.id = id;
	}
	
	// Metoda hasTrain() - fara parametrii
	// Returneaza o valoare de adevar in concordanta cu existenta / neexistenta unui tren in segment
	public boolean hasTrain() {
		return train != null;
	}
	
	// Metoda departTrain() - fara parametrii
	// Returneaza trenul care urmeaza sa plece 
	public Train departTrain() {
		Train temp = train;
		this.train = null;
		return temp;
	}
	
	// Metoda arriveTrain() - parametrii: train (Train)
	// Returneaza trenul care a ajuns
	public void arriveTrain(Train train) {
		this.train = train;
	}
	
	// Metoda getTrain() - fara parametrii
	// Getter pentru tren
	public Train getTrain() {
		return this.train;
	}

}
