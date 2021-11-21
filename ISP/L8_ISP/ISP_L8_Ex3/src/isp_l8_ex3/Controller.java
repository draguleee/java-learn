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

import java.util.*;

// Clasa publica Controller
public class Controller {
	
	// Atributele / variabilele de instanta pentru clasa Controller
	public String stationName;
	public ArrayList<Controller> neighbourControllers = new ArrayList<Controller>();
	public ArrayList<Segment> segments = new ArrayList<Segment>();
	
	// Constructor - parametrii: stationName (String)
	public Controller(String stationName) {
		this.stationName = stationName;
	}
	
	// Metoda setNeighbourController() - parametrii: c (Controller)
	// Seteaza controller-ul vecin
	public void setNeighbourController(Controller neighbourController) {
		for(int i=0 ; i<neighbourControllers.size() ; i++) {
			neighbourControllers.set(i, neighbourController);
		}
	}
	
	// Metoda addControlledSegment() - parametrii: s (Segment)
	public void addControlledSegment(Segment s) {
		segments.add(s);
	}
	
	// Metoda getFreeSegmentId() - fara parametrii
	// Verifica segmentele controlate si returneaza id-ul primului segment liber sau -1 daca nu e niciunul liber
	public int getFreeSegmentId() {
		for(Segment s : segments) {
			if(s.hasTrain() == false) {
				return s.id;
			}
		}
		return -1;
	}
	
	// Metoda controlStep() - fara parametrii
	// Verifica care tren trebuie trimis
	public void controlStep() {
		System.out.println("Control step executed!");
	}
	
	// Metoda arriveTrain() - parametrii: t (Train), idSegment (int)
	// Verifica daca trenul a ajuns cu bine in gara
	public void arriveTrain(Train t, int idSegment) {
		for(Segment s : segments) {
			if(s.id == idSegment) {
				if(s.hasTrain() == true) {
					System.out.println("CRASH! Train " + t.name + " collided with " + s.getTrain().name + " on segment " + s.id + " in station " + stationName);
					return;
				}
				else {
					System.out.println("Train " + t.name + " arrived on segment " + s.id + " in station " + stationName);
					s.arriveTrain(t);
					return;
				}
			}
		}
		System.out.println("Train " + t.name + " cannot be received " + stationName + ". Check controller logic algorithm!");
	}
	
	// Metoda displayStationState() - fara parametrii
	// Afiseaza starea statiei de tren
	public void displayStationState() {
		System.out.println("=== STATION "+stationName+" ===");
		for(Segment s: segments){
			if(s.hasTrain())
				System.out.println("|----------ID="+s.id+"__Train="+s.getTrain().name+" to "+s.getTrain().destination+"__----------|");
			else
				System.out.println("|----------ID="+s.id+"__Train=______ catre ________----------|");
		}
	}

}
