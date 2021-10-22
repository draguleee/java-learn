/*
 * Exercitiul 4
 * 
 * Sa se scrie clasa MyPoint, care modeleaza un punct in 2D cu coordonatele x si y, care 
 * contine:
 * - Doua variabile de instanta x (int) si y (int)
 * - Un constructor fara argumente care creaza un punct cu coordonatele (0,0)
 * - Un constructor care creaza un punct cu valorile x si y create
 * - Gettere si settere pentru variabilele de instanta x si y
 * - O metoda setXY() care seteaza x si y
 * - O metod toString() care returneaza o descriere de tip String a instantei in formatul
 * "(x,y)"
 * - O metoda distance(int x, int y) care returneaza distanta de la acest punct la altul cu
 * coordonatele date (x,y)
 * - O metoda supraincarcata distance(MyPoint another) care returneaza distanta de la acest
 * punct la punctul another, instanta a clasei MyPoint
 * 
 * Scrieti codul pentru clasa MyPoint. De asemenea, sa se scrie clasa TestMyPoint pentru a
 * testa toate metodele definite in clasa MyPoint.
 */

package isp_l3_ex4;

import java.util.*;

// Clasa publica TestMyPoint
public class TestMyPoint {
	
	// Metoda main
	public static void main(String[] args) {
		
		// Crearea unui Scanner pentru introducerea de la tastatura a datelor
		Scanner in = new Scanner(System.in);
		
		
		// Testare obiect creat cu constructorul default
		MyPoint p1 = new MyPoint();													
		System.out.println("----------------------------------------------------------");
		System.out.println("AFISAREA PUNCTULUI INITIAL");
		System.out.println(p1.toString());												
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("SCHIMBAREA COORDONATEI X");
		System.out.println("Coordonata X inainte de schimbare: " + p1.getX());		
		System.out.print("Modifica X: ");
		p1.setX(in.nextInt()); 														
		System.out.println("Coordonata X dupa schimbare: " + p1.getX());			
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("SCHIMBAREA COORDONATEI Y");
		System.out.println("Coordonata Y inainte de schimbare: " + p1.getY());		
		System.out.print("Modifica Y: ");
		p1.setY(in.nextInt()); 														
		System.out.println("Coordonata Y dupa schimbare: " + p1.getY());			
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("AFISAREA PUNCTULUI CU COORDONATELE SCHIMBATE");
		System.out.println(p1.toString());											
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("SCHIMBAREA COORDONATELOR X SI Y SIMULTAN");
		System.out.print("Introduceti X: ");
		int x1 = in.nextInt();
		System.out.print("Introduceti Y: ");
		int y1 = in.nextInt();
		p1.setXY(x1, y1);
		System.out.println("Punctul final: ");
		System.out.println(p1.toString());
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("DISTANTA CU PRIMA METODA");
		System.out.print("Introduceti a: ");
		int a1 = in.nextInt();
		System.out.print("Introduceti b: ");
		int b1 = in.nextInt();
		double dist1 = p1.distance(a1,b1);
		System.out.println("Distanta cu prima metoda: " + dist1);
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("DISTANTA CU A DOUA METODA");
		System.out.println("Introduceti xp: ");
		int xp1 = in.nextInt();
		System.out.println("Introduceti yp: ");
		int yp1 = in.nextInt();
		MyPoint pd1 = new MyPoint(xp1,yp1);
		double dist2 = p1.distance(pd1);
		System.out.println("Distanta cu a doua metoda: " + dist2);
		
		
		// Testare obiect creat cu constructorul suprascris
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("INTRODUCEREA COORDONATELOR X SI Y");
		System.out.println("X = ");
		int x = in.nextInt();
		System.out.println("Y = ");
		int y = in.nextInt();
		MyPoint p2= new MyPoint(x,y);													
		System.out.println("----------------------------------------------------------");
		System.out.println("AFISAREA PUNCTULUI INITIAL");
		System.out.println(p2.toString());												
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("SCHIMBAREA COORDONATEI X");
		System.out.println("Coordonata X inainte de schimbare: " + p2.getX());		
		System.out.print("Modifica X: ");
		p2.setX(in.nextInt()); 														
		System.out.println("Coordonata X dupa schimbare: " + p2.getX());			
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("SCHIMBAREA COORDONATEI Y");
		System.out.println("Coordonata Y inainte de schimbare: " + p2.getY());		
		System.out.print("Modifica Y: ");
		p2.setY(in.nextInt()); 														
		System.out.println("Coordonata Y dupa schimbare: " + p2.getY());			
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("AFISAREA PUNCTULUI CU COORDONATELE SCHIMBATE");
		System.out.println(p2.toString());											
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("SCHIMBAREA COORDONATELOR X SI Y SIMULTAN");
		System.out.print("Introduceti X: ");
		int x2 = in.nextInt();
		System.out.print("Introduceti Y: ");
		int y2 = in.nextInt();
		p2.setXY(x2, y2);
		System.out.println("Punctul final: ");
		System.out.println(p2.toString());
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("DISTANTA CU PRIMA METODA");
		System.out.print("Introduceti a: ");
		int a2 = in.nextInt();
		System.out.print("Introduceti b: ");
		int b2 = in.nextInt();
		double dist3 = p2.distance(a2,b2);
		System.out.println("Distanta cu prima metoda: " + dist3);
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("DISTANTA CU A DOUA METODA");
		System.out.println("Introduceti xp: ");
		int xp2 = in.nextInt();
		System.out.println("Introduceti yp: ");
		int yp2 = in.nextInt();
		MyPoint pd2 = new MyPoint(xp2,yp2);
		double dist4 = p2.distance(pd2);
		System.out.println("Distanta cu a doua metoda: " + dist4);
	}

}
