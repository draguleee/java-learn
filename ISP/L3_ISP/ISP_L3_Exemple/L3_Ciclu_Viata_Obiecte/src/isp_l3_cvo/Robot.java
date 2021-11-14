/*
 * Clasa Robot
 */

package isp_l3_cvo;

// Clasa publica Robot, care modeleaza conceptul de supraincarcare (overloading) a metodelor si functiilor
public class Robot {

	// Atirbutele / variabilele de instanta a clasei Robot
	int arms;
	int legs;
	int position;
	
	// Constructor 1 - parametrii: arms (int)
	public Robot(int arms) {
		this.arms = arms;
		this.legs = arms;
		this.position = 0;
	}
	
	// Constructor 2 - parametrii: arms (int), legs (int)
	public Robot(int arms, int legs) {
		this.arms = arms;
		this.legs = legs;
		this.position = 0;
	}
	
	// Constructor 3 - parametrii: arms (int), legs (int), position (int)
	public Robot(int arms, int legs, int position) {
		this.arms = arms;
		this.legs = legs;
		this.position = position;
	}
	
	// Metoda move() - incrementeaza atributul position (misca robotul)
	public void move() {
		this.position++;
		System.err.println("The robot is moving. Position: " + this.position);
	}
	
	// Metoda move(int i) - incrementeaza atributul position (misca robotul)
	public void move(int i) {
		this.position = position+i;
		System.err.println("The robot is moving. Position: " + this.position);
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea obiectelor de tip Robot
		Robot r1 = new Robot(2);
		Robot r2 = new Robot(4,4);
		Robot r3 = new Robot(5,2,8);
		
		// Miscare robot 1
		r1.move();
		r1.move(4);
		
		// Miscare robot 2
		r2.move();
		r2.move(3);
		
		// Miscare robot 3
		r3.move();
		r3.move(10);
	}
}
