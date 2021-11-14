/*
 * Clasa Vehicul
 */

package isp_l4_rc;

// Clasa publica Vehicul care modeleaza procesul / conceptul de mostenire
public class Vehicul {
	
	// Atributele / variabilele de instanta pentru clasa Vehicul
	String nume;
	
	// Constructor - parametrii: nume (String)
	public Vehicul(String nume) {
		this.nume = nume;
	}
	
	// Metoda afiseaza() - fara parametrii
	// Afiseaza numele vehiculului
	public void afiseaza() {
		System.out.println("Numele vehiculului: " + this.nume);
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui vehicul (obiect de tip Vehicul)
		Vehicul v = new Vehicul("A");
		
		// Crearea unor masini (obiecte de tip Masina)
		Masina m1 = new Masina("B",1000);
		Vehicul m2 = new Masina("C",2000);
		
		// Afisare date despre vehicul, respectiv masini
		v.afiseaza();
		System.out.println();
		m1.afiseaza();
		System.out.println();
		m2.afiseaza();
	}

}


// Clasa Masina
class Masina extends Vehicul {
	
	// Atributele / variabilele de instanta pentru clasa Masina
	int cc;
	
	// Constructor - parametrii: nume (String), cc (int)
	public Masina(String nume, int cc) {
		super(nume);
		this.cc = cc;
	}
	
	// Metoda afiseaza() - fara parametrii
	// Afiseaza numele si cc-ul masinii
	public void afiseaza() {
		super.afiseaza();
		System.out.println("CC Masina: " + this.cc);
	}
}
