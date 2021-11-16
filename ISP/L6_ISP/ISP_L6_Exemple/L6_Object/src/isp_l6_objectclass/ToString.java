/*
 * Clasa ToString
 */

package isp_l6_objectclass;


// Clasa publica ToString, care modeleaza utilizarea metodei toString()
public class ToString {

	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unor obiecte de tip Point
		Points p1 = new Points();
		Points p2 = new Points(5,2);
		Points p3 = new Points(1,1);
		Points p4 = null;
		System.out.println();
		
		// Testare metoda toString
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}
}


//Clasa Point
class Points {
	
	// Atributele / variabilele de instanta pentru clasa GetClass
	private int x;
	private int y;
	
	// Constructor - fara parametrii
	public Points() {
		System.out.println("Constructor default Point.");
		this.x = 1;
		this.y = 1;
	}
	
	// Constructor - parametrii: x (int), y (int)
	public Points(int x, int y) {
		System.out.println("Constructor cu argumente Point.");
		this.x = x;
		this.y = y;
	}
	
	// Getter pentru variabila x
	public int getX() {
		return this.x;
	}
	
	// Getter pentru variabila y
	public int getY() {
		return this.y;
	}
	
	// Setter pentru variabila x
	public void setX(int x) {
		this.x = x;
	}
	
	// Setter pentru variabila y
	public void setY(int y) {
		this.y = y;
	}
	
	// Metoda toString()
	public String toString() {
		return "Point: [" + this.x + "," + this.y + "]";
	}
	
	// Metoda equals()
	// Compara referintele a doua obiecte
	@Override
	public boolean equals(Object o) {
		if(o instanceof Points) {
			Points p = (Points)o;
			return x == p.x && y == p.y;
		}
		return false;
	}
	
	// Metoda hashCode() - fara parametrii
	// Returneaza un numar pozitiv care sa fie consistent cu valoarea de adevar returnata de metoda equals()
	public int hashCode() {
		return x + y;
	}
}
