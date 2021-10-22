/*
 * Exercitiul 5
 * 
 * In acest exercitiu, o subclasa numita Cylinder este derivata din superclasa Circle precum in diagrama
 * claselor de mai jos.
 * 
 * Remarci:
 * - Se refoloseste clasa Circle din exercitiul anterior
 * - Se foloseste cuvantul cheie "suoper" pentru a apela constructorii din clasa de baza (clasa parinte)
 * - Se observa ca metoda getArea() din clasa derivata returneaza o valoare gresita, deoarece foloseste
 * formula cercului => se va suprascrie metoda getArea() pentru a afisa rezultatul corect in urma
 * calculului ariei pentru clasa derivata.
 */

package isp_l4_ex5;

// Clasa publica TestCircleCylinder
public class TestCircleCylinder {
	
	// Metoda main()
	public static void main(String[] args) {
		
		// Crearea obiectelor din clasa Circle
		Circle ci1 = new Circle();
		Circle ci2 = new Circle(5.5);
		Circle ci3 = new Circle("black");
		Circle ci4 = new Circle(2.0,"white");
		
		// Crearea obiectelor din clasa Cylinder
		Cylinder cy1 = new Cylinder();
		Cylinder cy2 = new Cylinder(8.5);
		Cylinder cy3 = new Cylinder("yellow");
		Cylinder cy4 = new Cylinder(3.5,"red");
		Cylinder cy5 = new Cylinder(4.5,11.0);
		Cylinder cy6 = new Cylinder("blue",15.5);
		Cylinder cy7 = new Cylinder(9.5,"violet",8.5);
		
		
		/* CERCURI */
		
		// Cercul ci1
		System.out.println("----------------------------------------------------------");
		System.out.println("TESTARE METODE PE PRIMUL OBIECT DE TIP CIRCLE");
		double r1 = ci1.getRadius();
		System.out.println("Raza cercului ci1: " + r1);
		String col1 = ci1.getColor();
		System.out.println("Culoarea cercului ci1: " + col1);
		double p1 = ci1.getPerimeter();
		System.out.println("Perimetrul cercului ci1: " + p1);
		double a1 = ci1.getArea();
		System.out.println("Aria cercului ci1: " + a1);
				
		// Cercul ci2
		System.out.println(" ");
		System.out.println("----------------------------------------------------------");
		System.out.println("TESTARE METODE PE AL DOILEA OBIECT DE TIP CIRCLE");
		double r2 = ci2.getRadius();
		System.out.println("Raza cercului ci2: " + r2);
		double p2 = ci1.getPerimeter();
		System.out.println("Perimetrul cercului ci2: " + p2);
		double a2 = ci1.getArea();
		System.out.println("Aria cercului ci2: " + a2);
				
		// Cerciul ci3
		System.out.println(" ");
		System.out.println("----------------------------------------------------------");
		System.out.println("TESTARE METODE PE AL TREILEA OBIECT DE TIP CIRCLE");
		String col3 = ci3.getColor();
		System.out.println("Culoarea cercului ci3: " + col3);
			
		// Cercul ci4
		System.out.println(" ");
		System.out.println("----------------------------------------------------------");
		System.out.println("TESTARE METODE PE AL PATRULEA OBIECT DE TIP CIRCLE");
		double r4 = ci4.getRadius();
		System.out.println("Raza cercului ci4: " + r4);
		String col4 = ci4.getColor();
		System.out.println("Culoarea cercului ci4: " + col4);
		double p4 = ci4.getPerimeter();
		System.out.println("Perimetrul cercului ci4: " + p4);
		double a4 = ci4.getArea();
		System.out.println("Aria cercului ci4: " + a4);
		
		
		/* CILINDRI */
		
		// Cilindrul cy1
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("TESTARE METODE PE PRIMUL OBIECT DE TIP CYLINDER");
		double r5 = cy1.getRadius();
		System.out.println("Raza cilindrului cy1: " + r5);
		String col5 = cy1.getColor();
		System.out.println("Culoarea cilindrului cy1: " + col5);
		double h1 = cy1.getHeight();
		System.out.println("Inaltimea cilindrului cy1: " + h1);
		double a5 = cy1.getArea();
		System.out.println("Aria cilindrului cy1: " + a5);
		double v1 = cy1.getVolume();
		System.out.println("Volumul cilindrului cy1: " + v1);
				
		// Cilindrul cy2
		System.out.println(" ");
		System.out.println("----------------------------------------------------------");
		System.out.println("TESTARE METODE PE AL DOILEA OBIECT DE TIP CYLINDER");
		double r6 = cy2.getRadius();
		System.out.println("Raza cilindrului cy2: " + r6);
		double a6 = cy2.getArea();
				
		// Cilindrul cy3
		System.out.println(" ");
		System.out.println("----------------------------------------------------------");
		System.out.println("TESTARE METODE PE AL TREILEA OBIECT DE TIP CYLINDER");
		String col7 = cy3.getColor();
		System.out.println("Culoarea cilindrului cy3: " + col7);
			
		// Cilindrul cy4
		System.out.println(" ");
		System.out.println("----------------------------------------------------------");
		System.out.println("TESTARE METODE PE AL PATRULEA OBIECT DE TIP CYLINDER");
		double r8 = cy4.getRadius();
		System.out.println("Raza cilindrului cy4: " + r8);
		String col8 = cy4.getColor();
		System.out.println("Culoarea cilindrului cy4: " + col8);
		double a8 = cy4.getArea();
		
		// Cilindrul cy5
		System.out.println(" ");
		System.out.println("----------------------------------------------------------");
		System.out.println("TESTARE METODE PE AL CINCILEA OBIECT DE TIP CYLINDER");
		double r9 = cy5.getRadius();
		System.out.println("Raza cilindrului cy5: " + r9);
		double h9 = cy5.getHeight();
		System.out.println("Inaltimea cilindrului cy5: " + h9);
		double a9 = cy5.getArea();
		System.out.println("Aria cilindrului cy5: " + a9);
		double v9 = cy5.getVolume();
		System.out.println("Volumul cilindrului cy5: " + v9);
		
		// Cilindrul cy6
		System.out.println(" ");
		System.out.println("----------------------------------------------------------");
		System.out.println("TESTARE METODE PE AL SASELEA OBIECT DE TIP CYLINDER");
		String col10 = cy6.getColor();
		System.out.println("Culoarea cilindrului cy6: " + col10);
		double h10 = cy6.getHeight();
		System.out.println("Inaltimea cilindrului cy6: " + h10);
		
		// Cilindrul cy7
		System.out.println(" ");
		System.out.println("----------------------------------------------------------");
		System.out.println("TESTARE METODE PE AL SAPTELEA OBIECT DE TIP CYLINDER");
		double r11 = cy7.getRadius();
		System.out.println("Raza cilindrului cy7: " + r11);
		String col11 = cy7.getColor();
		System.out.println("Culoarea cilindrului cy7: " + col11);
		double h11 = cy7.getHeight();
		System.out.println("Inaltimea cilindrului cy7: " + h11);
		double a11 = cy7.getArea();
		System.out.println("Aria cilindrului cy7: " + a11);
		double v11 = cy7.getVolume();
		System.out.println("Volumul cilindrului cy7: " + v11);
	}
	
}
