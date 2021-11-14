/*
 * Clasa Human
 */

package isp_l3_cvo;

// Clasa publica Human, care are definite ca si caracteristici (atribute) alte obiecte:
// - head: de tip Head
// - leg: de tip Leg
// - arm: de tip Arm
// - body: de tip Body
public class Human {
	
	// Atributele / variabilele de instanta ale clasei Human
	Head head;
	Leg legL, legR;
	Arm armL, armR;
	Body body;
	
	// Constructor fara parametrii
	public Human() {
		this.head = new Head();
		this.legL = new Leg();
		this.legR = new Leg();
		this.armL = new Arm();
		this.armR = new Arm();
		this.body = new Body();
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui obiect de tip Human
		Human h = new Human();
	}
	
}

class Head {}
class Leg {}
class Arm {}
class Body {}
