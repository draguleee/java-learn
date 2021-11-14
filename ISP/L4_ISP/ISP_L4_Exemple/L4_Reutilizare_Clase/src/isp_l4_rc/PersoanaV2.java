/*
 * Clasa PersoanaV2
 */

package isp_l4_rc;

// Clasa publica PersoanaV2, care modeleaza adaugarea de constructori pentru initializarea atributelor
// Initializarea atributelor claselor de baza si claselor derivate trebuie realizata prin intermediul constructorilor.
public class PersoanaV2 {

	// Atributele / variabilele de instanta ale clasei PersoanaV2
	private String nume;
	private AdresaV2 adresa;
	
	// Constructor - parametrii: nume (String), adresa (AdresaV2)
	public PersoanaV2(String nume, AdresaV2 adresa) {
		this.nume = nume;
		this.adresa = adresa;
	}
	
	// Metoda afiseaza() - fara parametrii
	// Afiseaza numele si adresa persoanei
	public void afiseaza() {
		System.out.println("Nume: " + this.nume);
		System.out.println("Adresa: " + this.adresa);
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unei adrese (obiect de tip AdresaV2)
		AdresaV2 a = new AdresaV2("Strada Lotrioarei",10);
		
		// Crearea unei persoane (obiect de tip PersoanaV2)
		PersoanaV2 p = new PersoanaV2("Andre",a);
		
		// Crearea unui angajat (obiect de tip AngajatV2)
		AngajatV2 e = new AngajatV2("Oana",a,4000);
		
		// Afisare date pentru persoana si angajat
		p.afiseaza();
		e.afiseaza();
		
		// Impozit angajat
		System.out.println("Impozit persoana " + e + ": " + e.calculeazaImpozit());
	}
}


// Clasa Angajat
class AngajatV2 extends PersoanaV2 {
	
	// Atributele / variabilele de instanta ale clasei AngajatV2
	private int venit;
	
	// Constructor - parametrii: nume (String), adresa (AdresaV2), venit (int)
	public AngajatV2(String nume, AdresaV2 adresa, int venit) {
		super(nume,adresa);
		this.venit = venit;
	}
	
	// Metoda afiseaza() - fara parametrii
	// Afiseaza numele, adresa si venitul persoanei
	public void afiseaza() {
		super.afiseaza();
		System.out.println("Venit: " + this.venit);
	}
	
	// Metoda claculeazaImpozit() - fara parametrii
	// Calculeaza impozitul persoanei
	public int calculeazaImpozit() {
		return this.venit/2;
	}
	
}


// Clasa Adresa
class AdresaV2 {
	
	// Atributele / variabilele de instanta ale clasei Adresa
	String strada;
	int numar;
	
	// Constructor - parametrii: strada (String), numar (int)
	public AdresaV2(String strada, int numar) {
		this.strada = strada;
		this.numar = numar;
	}
	
}
