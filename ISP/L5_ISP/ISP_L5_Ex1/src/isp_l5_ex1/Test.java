/*
 * Exercitiul 1
 * 
 * Sa se urmareasca instructiunile si sa se implementeze programul conform specificatiilor. Sa se creeze
 * o clasa de testare adecvata pentru a testa programul. In scopul testarii, se va crea un vector de 
 * obiecte din clasa Shape si apoi se vor apela getArea() si getPerimeter() pentru fiecare obiect in 
 * vector.
 * 
 * In acest exercitiu, clasa Shape se va defini ca fiind o clasa abstracta, care contine:
 * - Doua variabila de instanta protected: color (String) si filled (boolean). Variabilele protected
 * pot fi accesate de subclasele si clasele din acelasi pachet. Sunt denotate cu semnul '#' in 
 * diagrama de clase.
 * - Getteri si setteri pentru toate variabilele de instanta
 * - O metoda toString() care sa afiseze detaliile formei
 * - Subclasele Circle si Rectangle vor suprascri metodele abstracte getArea() si getPerimeter() si vor
 * oferi o implementare adecvata. De asemenea, se va suprascrie si metoda toString().
 */

package isp_l5_ex1;

//Clasa publica Test
public class Test {
	
	// Metoda main
	public static void main(String[] args) {
		
		// Crearea obiectelor de clasa Circle
		Circle c1 = new Circle();
		Circle c2 = new Circle(5.5);
		Circle c3 = new Circle(3.5,"black",true);
		
		// Crearea obiectelor de clasa Rectangle
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(1.5,3.0);
		Rectangle r3 = new Rectangle(1.0,10.0,"white",false);
		
		// Crearea obiectelor de clasa Square
		Square q1 = new Square();
		Square q2 = new Square(4.5);
		Square q3 = new Square(2.0,"green",true);
		
		
		/* TESTAREA CLASEI CIRCLE */
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("CLASA CIRCLE");
		System.out.println("----------------------------------------------------------");
		
		System.out.println();
		System.out.println("CERCUL C1");
		System.out.println("Culoarea cercului c1 inainte de schimbare: " + c1.getColor());
		c1.setColor("orange");
		System.out.println("Culoarea cercului c1 dupa schimbare: " + c1.getColor());
		System.out.println("Status umplere c1: " + c1.isFilled());
		c1.setFilled(true);
		System.out.println("Status umplere c1 dupa modificare: " + c1.isFilled());
		System.out.println("Raza cercului c1 inainte de modificare: " + c1.getRadius());
		c1.setRadius(2.0);
		System.out.println("Raza cercului c1 dupa schimbare: " + c1.getRadius());
		System.out.println("Aria cercului c1: " + c1.getArea());
		System.out.println("Perimetrul cercului c1: " + c1.getPerimeter());
		System.out.println(c1.toString());
		
		System.out.println();
		System.out.println("CERCUL C2");
		System.out.println("Culoarea cercului c2 inainte de schimbare: " + c2.getColor());
		c2.setColor("aqua");
		System.out.println("Culoarea cercului c2 dupa schiimbare: " + c2.getColor());
		System.out.println("Status umplere c2: " + c2.isFilled());
		c2.setFilled(false);
		System.out.println("Status umplere c2 dupa modificare: " + c2.isFilled());
		System.out.println("Raza cercului c2 inainte de modificare: " + c2.getRadius());
		c2.setRadius(5.5);
		System.out.println("Raza cercului c2 dupa schimbare: " + c2.getRadius());
		System.out.println("Aria cercului c2: " + c2.getArea());
		System.out.println("Perimetrul cercului c2: " + c2.getPerimeter());
		System.out.println(c2.toString());
		
		System.out.println();
		System.out.println("CERCUL C3");
		System.out.println("Culoarea cercului c3 inainte de schimbare: " + c3.getColor());
		c3.setColor("pink");
		System.out.println("Culoarea cercului c3 dupa schiimbare: " + c3.getColor());
		System.out.println("Status umplere c3: " + c3.isFilled());
		c2.setFilled(false);
		System.out.println("Status umplere c3 dupa modificare: " + c3.isFilled());
		System.out.println("Raza cercului c3 inainte de modificare: " + c3.getRadius());
		c2.setRadius(1.0);
		System.out.println("Raza cercului c3 dupa schimbare: " + c3.getRadius());
		System.out.println("Aria cercului c3: " + c3.getArea());
		System.out.println("Perimetrul cercului c3: " + c3.getPerimeter());
		System.out.println(c3.toString());
		
		
		/* TESTAREA CLASEI RECTANGLE */
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("CLASA RECTANGLE");
		System.out.println("----------------------------------------------------------");
		
		System.out.println();
		System.out.println("DREPTUNGHIUL R1");
		System.out.println("Culoarea dreptunghiului r1 inainte de schimbare: " + r1.getColor());
		r1.setColor("lime");
		System.out.println("Culoarea deptunghiului r1 dupa schimbare: " + r1.getColor());
		System.out.println("Status umplere r1: " + r1.isFilled());
		r1.setFilled(false);
		System.out.println("Status umplere r1 dupa modificare: " + r1.isFilled());
		System.out.println("Latimea dreptunghiului r1 inainte de modificare: " + r1.getWidth());
		r1.setWidth(7.5);
		System.out.println("Latimea dreptunghiului r1 dupa modificare: " + r1.getWidth());
		System.out.println("Lungimea dreptunghiului r1 inainte de modificare: " + r1.getLength());
		r1.setLength(9.0);
		System.out.println("Latimea dreptunghiului r1 dupa modificare: " + r1.getLength());
		System.out.println("Aria dreptunghiului r1: " + r1.getArea());
		System.out.println("Perimetrul dreptunghiului r1: " + r1.getPerimeter());
		System.out.println(r1.toString());
		
		System.out.println();
		System.out.println("DREPTUNGHIUL R2");
		System.out.println("Culoarea dreptunghiului r2 inainte de schimbare: " + r2.getColor());
		r2.setColor("gray");
		System.out.println("Culoarea deptunghiului r2 dupa schimbare: " + r2.getColor());
		System.out.println("Status umplere r2: " + r2.isFilled());
		r2.setFilled(true);
		System.out.println("Status umplere r2 dupa modificare: " + r2.isFilled());
		System.out.println("Latimea dreptunghiului r2 inainte de modificare: " + r2.getWidth());
		r2.setWidth(15.5);
		System.out.println("Latimea dreptunghiului r2 dupa modificare: " + r2.getWidth());
		System.out.println("Lungimea dreptunghiului r2 inainte de modificare: " + r2.getLength());
		r2.setLength(10.0);
		System.out.println("Latimea dreptunghiului r2 dupa modificare: " + r2.getLength());
		System.out.println("Aria dreptunghiului r2: " + r2.getArea());
		System.out.println("Perimetrul dreptunghiului r2: " + r2.getPerimeter());
		System.out.println(r2.toString());
		
		System.out.println();
		System.out.println("DREPTUNGHIUL R3");
		System.out.println("Culoarea dreptunghiului r3 inainte de schimbare: " + r3.getColor());
		r3.setColor("lavender");
		System.out.println("Culoarea deptunghiului r3 dupa schimbare: " + r3.getColor());
		System.out.println("Status umplere r3: " + r3.isFilled());
		r3.setFilled(true);
		System.out.println("Status umplere r3 dupa modificare: " + r3.isFilled());
		System.out.println("Latimea dreptunghiului r3 inainte de modificare: " + r3.getWidth());
		r3.setWidth(8.0);
		System.out.println("Latimea dreptunghiului r3 dupa modificare: " + r3.getWidth());
		System.out.println("Lungimea dreptunghiului r3 inainte de modificare: " + r3.getLength());
		r3.setLength(10.0);
		System.out.println("Latimea dreptunghiului r3 dupa modificare: " + r3.getLength());
		System.out.println("Aria dreptunghiului r3: " + r3.getArea());
		System.out.println("Perimetrul dreptunghiului r2: " + r3.getPerimeter());
		System.out.println(r3.toString());
		
		
		/* TESTAREA CLASEI SQUARE */
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("CLASA SQUARE");
		System.out.println("----------------------------------------------------------");
		
		System.out.println();
		System.out.println("PATRATUL Q1");
		System.out.println("Culoarea patratului q1 inainte de schimbare: " + q1.getColor());
		q1.setColor("yellow");
		System.out.println("Culoarea patratului q1 dupa schimbare: " + q1.getColor());
		System.out.println("Status umplere q1: " + q1.isFilled());
		q1.setFilled(true);
		System.out.println("Status umplere q1 dupa modificare: " + q1.isFilled());
		System.out.println("Latura patratului q1 inainte de modificare: " + q1.getSide());
		q1.setSide(5.5);
		System.out.println("Latura patratului q1 dupa modificare: " + q1.getSide());
		System.out.println("Aria patratului q1: " + q1.getArea());
		System.out.println("Perimetrul patratului q1: " + q1.getPerimeter());
		System.out.println(q1.toString());
		
		System.out.println();
		System.out.println("PATRATUL Q2");
		System.out.println("Culoarea patratului q2 inainte de schimbare: " + q2.getColor());
		q2.setColor("magenta");
		System.out.println("Culoarea patratului q2 dupa schimbare: " + q2.getColor());
		System.out.println("Status umplere q2: " + q2.isFilled());
		q2.setFilled(true);
		System.out.println("Status umplere q2 dupa modificare: " + q2.isFilled());
		System.out.println("Latura patratului q2 inainte de modificare: " + q2.getSide());
		q2.setSide(2.0);
		System.out.println("Latura patratului q2 dupa modificare: " + q2.getSide());
		System.out.println("Aria patratului q2: " + q2.getArea());
		System.out.println("Perimetrul patratului q2: " + q2.getPerimeter());
		System.out.println(q2.toString());
		
		System.out.println();
		System.out.println("PATRATUL Q3");
		System.out.println("Culoarea patratului q3 inainte de schimbare: " + q3.getColor());
		q3.setColor("black");
		System.out.println("Culoarea patratului q3 dupa schimbare: " + q3.getColor());
		System.out.println("Status umplere q3: " + q3.isFilled());
		q3.setFilled(false);
		System.out.println("Status umplere q3 dupa modificare: " + q3.isFilled());
		System.out.println("Latura patratului q3 inainte de modificare: " + q3.getSide());
		q3.setSide(3.5);
		System.out.println("Latura patratului q3 dupa modificare: " + q3.getSide());
		System.out.println("Aria patratului q3: " + q3.getArea());
		System.out.println("Perimetrul patratului q3: " + q3.getPerimeter());
		System.out.println(q3.toString());
	}

}