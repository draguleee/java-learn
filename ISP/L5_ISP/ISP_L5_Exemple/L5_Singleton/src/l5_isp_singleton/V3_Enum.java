/*
 * Clasa V3_Enum
 */

package l5_isp_singleton;


// Clasa publica V3_Enum, care modeleaza utilizarea sablonului de proiectare Singleton Enum
public class V3_Enum {
	
	// Atributele / variabilele de instanta pentru clasa V3_Enum
	// Deoarece se proiecteaza un Singleton, atributele trebuie sa fie statice
	private static V3_Enum INSTANCE = new V3_Enum();
	
	// Constructor - fara parametrii
	// Deoarece se proiecteaza un Singleton, constructorul va fi privat
	private V3_Enum() {
		System.out.println("Constructor default V3_Enum.");
	}
	
	// Metoda getE() - fara parametrii
	// Metoda de acces la variabila statica, metoda care va controla procesul de creare a instantei
	public static V3_Enum getE() {
		if(INSTANCE == null) {
			INSTANCE = new V3_Enum();
		}
		return INSTANCE;
	}
	
	// Metoda doStuff() - fara parametrii
	// Printeaza un mesaj
	public void message() {
		System.out.println("Singleton using Enum.");
	}
	
	
	// Metoda main() - fara parametrii
	public static void main(String[] args) {
		V3_Enum.INSTANCE.message();
	}

}
