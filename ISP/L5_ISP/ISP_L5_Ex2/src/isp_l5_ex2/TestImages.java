/*
 * Exercitiul 2
 * 
 * Sa se urmareasca instructiunile si sa se implementeze un program conform specificatiilor. Sa se creeze
 * o clasa potrivita pentru testarea programului.
 * 
 * Pentru aplicatia Image din cod:
 * - Sa se creeze diagrama de clase UML
 * Sa se adauge o noua implementare a interfetei Image numita 'RotatedImage' care va afisa mesajul
 * "Display rotated" + fileName
 * - Sa se adauge schimbarile necesare in clasa ProxyImage astfel incat, depinzand de un argument al
 * constructorului dat in aceasta clasa, proxy va apela ori functionalitatea imaginii reale, ori 
 * functionalitatea imaginii rotite.
 */

package isp_l5_ex2;

// Clasa publica TestImages
public class TestImages {
	
	// Metoda main
	public static void main(String[] args) {
		
		
		/* Operare cu clasa RealImage */
		
		System.out.println("----------------");
		System.out.println("CLASA REALIMAGE");
		System.out.println("----------------");
		
		System.out.println();
		System.out.println("Primul obiect de tip RealImage");
		RealImage re1 = new RealImage("abc");
		re1.display();
		
		System.out.println();
		System.out.println("Al doilea obiect de tip RealImage");
		RealImage re2 = new RealImage("def");
		re2.display();
		
		System.out.println();
		System.out.println("Al treilea obiect de tip RealImage");
		RealImage re3 = new RealImage("ghi");
		re3.display();
		
		
		/* Operare cu clasa ProxyImage */
		
		System.out.println();
		System.out.println("----------------");
		System.out.println("CLASA PROXYIMAGE");
		System.out.println("----------------");
		
		System.out.println();
		System.out.println("Primul obiect de tip ProxyImage");
		ProxyImage pr1 = new ProxyImage("xyz");
		pr1.callImage("xyz");
		pr1.display();
		
		System.out.println();
		System.out.println("Al doilea obiect de tip ProxyImage");
		ProxyImage pr2 = new ProxyImage("mno");
		pr2.callImage("mno");
		pr2.display();
		
		System.out.println();
		System.out.println("Al treilea obiect de tip ProxyImage");
		ProxyImage pr3 = new ProxyImage("fgh");
		pr3.callImage("fgh");
		pr3.display();
		
		
		/* Operare cu clasa RotatedImage */
		
		System.out.println("----------------");
		System.out.println("CLASA ROTATEDIMAGE");
		System.out.println("----------------");
		
		System.out.println();
		System.out.println("Primul obiect de tip RotatedImage");
		RotatedImage ro1 = new RotatedImage("cba");
		ro1.display();
		
		System.out.println();
		System.out.println("Al doilea obiect de tip RotatedImage");
		RotatedImage ro2 = new RotatedImage("fed");
		ro2.display();
		
		System.out.println();
		System.out.println("Al treilea obiect de tip RotatedImage");
		RotatedImage ro3 = new RotatedImage("ihg");
		ro3.display();
	}

}
