/*
 * Clasa Var1_Singleton
 */

package l5_isp_singleton;


// Clasa publica Var1_Singleton, care modeleaza utilitatea sablonului de proiectare Singleton
public class Var1_Singleton {
	
	// Atributele / variabilele de instanta pentru clasa Var1_Singleton
	// Deoarece se proiecteaza un Singleton, atributele trebuie sa fie statice
	private static Var1_Singleton vs;
	
	// Constructor - fara parametrii
	// Deoarece se proiecteaza un Singleton, constructorii trebuie sa fie privati
	// Constructor privat - blocheaza mecanismul standard de construire a obiectelor folosind
	// operatorul new, deoarece constructorii nu mai sunt accesibili din exteriorul clasei.
	private Var1_Singleton() {
		System.out.println("Constructor default Var1_Singleton.");
	}
	
	// Metoda getFileLogger() - fara parametrii
	// Metoda de acces la variabila statica, metoda care va controla procesul de creare a instantei
	public static Var1_Singleton getVS() {
		if(vs == null) {
			vs = new Var1_Singleton();
		}
		return vs;
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui obiect de clasa Var1_Singleton
		Var1_Singleton vs = new Var1_Singleton();
		getVS();
	}

}


