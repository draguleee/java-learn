/*
 * Clasa Body
 * 
 * Exemplu compozitie
 */

package isp_l5_body_compozitie;

// Clasa publica Body
public class Body {
	
	// Atributele / variabilele de instanta pentru clasa Body
	Arm[] arms = new Arm[2];
	Leg[] legs = new Leg[2];
	Head head = new Head();
	
	// Constructor - fara parametrii
	public Body() {
		arms[0] = new Arm();
		arms[1] = new Arm();
		legs[0] = new Leg();
		legs[1] = new Leg();
	}
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		Body b = new Body();
	}

}
