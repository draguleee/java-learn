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


// Clasa publica Simulator
public class Simulator {
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui ArrayList de controllere
		ArrayList controllers = new ArrayList();
		
		 
		// Crearea unor controllere individuale
		Controller c1 = new Controller("Cluj-Napoca");
		Controller c2 = new Controller("Arad");
		Controller c3 = new Controller("Bucuresti");
		
		// Adaugarea controllerelor in ArrayList-ul de controllere
		controllers.add(c1);
		controllers.add(c2);
		controllers.add(c3);
 
		Segment s1 = new Segment(1);
		Segment s2 = new Segment(2);
		Segment s3 = new Segment(3);
 
		c1.addControlledSegment(s1);
		c1.addControlledSegment(s2);
		c1.addControlledSegment(s3);
 
 
		Segment s4 = new Segment(4);
		Segment s5 = new Segment(5);
		Segment s6 = new Segment(6);
 
		c2.addControlledSegment(s4);
		c2.addControlledSegment(s5);
		c2.addControlledSegment(s6);
 
		//connect the 2 controllers
 
		c1.setNeighbourController(c2);
		c2.setNeighbourController(c1);
 
		//testing
 
		Train t1 = new Train("Bucuresti", "IC-001");
		s1.arriveTrain(t1);
 
		Train t2 = new Train("Cluj-Napoca","R-002");
		s5.arriveTrain(t2);
 
 
		c1.displayStationState();
		c2.displayStationState();
 
		System.out.println("\nStart train control\n");
 
                //execute 3 times controller steps
		for(int i = 0;i<3;i++){
			System.out.println("### Step "+i+" ###");
			c1.controlStep();
			c2.controlStep();
 
			System.out.println();
 
			c1.displayStationState();
			c2.displayStationState();
		}		
	}

}
