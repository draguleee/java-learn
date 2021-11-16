/*
 * Clasa GetClass
 */

package isp_l6_objectclass;

import java.lang.reflect.Method;


// Clasa publica GetClass, care modeleaza utilizarea metodei getClass()
public class GetClass {
	

	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unor obiecte de tip Point
		Point p1 = new Point();
		Point p2 = new Point(1,1);
		Point p3 = new Point(3,5);
		System.out.println();
		
		
		// Testarea metodei getClass
		
		Class co1 = p1.getClass();		// Obiectul p1
		System.out.println("Numele clasei pentru obiectul " + p1 + " este " + co1.getSimpleName());
		System.out.println();
		
		Class co2 = p2.getClass();		// Obiectul p2
		System.out.println("Numele clasei pentru obiectul " + p2 + " este " + co2.getSimpleName());
		System.out.println();
		
		Class co3 = p3.getClass();	// Obiectul p3
		System.out.println("Numele clasei pentru obiectul " + p3 + " este " + co3.getSimpleName());
		System.out.println();
		
		
		// Lista metodelor pentru clasa Point
		System.out.println("Lista metodelor pentru clasa " + co1.getSimpleName());
		Method[] ms = co1.getDeclaredMethods();
		for(Method m : ms) {
			System.out.println(m.getName());
		}
		System.out.println();
		
		// Testare obiect p1 de tip Point
		System.out.println("x1 = " + p1.getX());
		System.out.println("y1 = " + p1.getY());
		System.out.println(p1.toString());
		System.out.println();
		
		// Testare obiect p2 de tip Point
		System.out.println("x2 = " + p2.getX());
		System.out.println("y2 = " + p2.getY());
		System.out.println(p2.toString());
		System.out.println();
		
		// Testare obiect p3 de tip Point
		System.out.println("x3 = " + p3.getX());
		System.out.println("y3 = " + p3.getY());
		System.out.println(p3.toString());
		System.out.println();
		
		// Testare metoda equals - p1 si p2
		if(p1.equals(p2)) {
			System.out.println("Obiectele sunt identice.");
		}
		else {
			System.out.println("Obiectele nu sunt identice.");
		}
		System.out.println();
		
		// Testare metoda equals - p1 si p3
		if(p1.equals(p3)) {
			System.out.println("Obiectele sunt identice.");
		}
		else {
			System.out.println("Obiectele nu sunt identice.");
		}
		System.out.println();
		
	}
}


// Clasa Point
class Point {
	
	// Atributele / variabilele de instanta pentru clasa GetClass
	private int x;
	private int y;
	
	// Constructor - fara parametrii
	public Point() {
		System.out.println("Constructor default Point.");
		this.x = 1;
		this.y = 1;
	}
	
	// Constructor - parametrii: x (int), y (int)
	public Point(int x, int y) {
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
		if(o instanceof Point) {
			Point p = (Point)o;
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
