/*
 * Clasa Var2_ThreadSafe
 */

package l5_isp_singleton;


// Clasa var2_ThreadSafe, care modeleaza utilitatea sablonului de proiectare Singleton Thread-Safe
public class Var2_ThreadSafe {
	
	// Atributele / variabilele de instanta pentru clasa Var2_ThreadSafe
	// Deoarece se proiecteaza un Singleton, atributele trebuie sa fie statice
	// Deoarece lucram intr-un mediu multi-threaded, atributele trebuie sa fie volatile
	private static volatile Var2_ThreadSafe vs = null;
	
	// Constructor - fara parametrii
	// Deoarece se proiecteaza un Singleton, constructorii trebuie sa fie privati
	// Constructor privat - blocheaza mecanismul standard de construire a obiectelor folosind
	// operatorul new, deoarece constructorii nu mai sunt accesibili din exteriorul clasei.
	private Var2_ThreadSafe() {
		System.out.println("Constructor default Var2_ThreadSafe.");
	}
	
	// Metoda getFileLogger() - fara parametrii
	// Metoda de acces la variabila statica, metoda care va controla procesul de creare a instantei
	public static Var2_ThreadSafe getVS() {
		synchronized(Var2_ThreadSafe.class) {
			if(vs == null) {
				vs = new Var2_ThreadSafe();
			}
		}
		return vs;
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui obiect de clasa Var1_Singleton
		Var2_ThreadSafe vs = new Var2_ThreadSafe();
		getVS();
	}
}
