/*
 * Clasa Smartphone
 */

package isp_l3_cvo;

// Clasa publica Smartphone, care modeleaza un telefon inteligent cu cateva caracteristici si comportament/
// Telefonul poate fi:
// - Incarcat (metoda incarca())
// - Utilizat (metoda apeleaza())
public class SmartphoneV1 {
	
	// Atributele / variabilele de instanta ale clasei Smartphone
	static int contor;			// Contor telefon
	String model;				// Model telefon
	int pb;						// Procentaj baterie telefon
	int k;
	
	// Constructor 1 - fara parametrii
	public SmartphoneV1() {
		contor++;
		this.k = 1;
		this.model = "iPhone XR";
		System.out.println("Telefon " + this.model + " construit.");
		this.pb = 100;
		afiseazaBaterie();
	}
	
	// Constructor 2 - parametrii: model (String)
	public SmartphoneV1(String model) {
		contor++;
		this.k = 1;
		this.model = model;
		System.out.println("Telefon " + this.model + " construit.");
		this.pb = 100;
		afiseazaBaterie();
	}
	
	// Constructor 3 - parametrii: model (String), k (int)
	public SmartphoneV1(String model, int k) {
		contor++;
		this.k = k;
		this.model = model;
		System.out.println("Telefon " + this.model + " construit.");
		this.pb = 100;
		afiseazaBaterie();
	}
	
	// Metoda afiseazaBaterie() - afiseaza procentajul bateriei telefonului
	public void afiseazaBaterie() {
		System.out.println("Baterie = " + this.pb + "% pentru modelul " + this.model);
	}
	
	// Metoda incarca() - incarca bateria telefonului
	public void incarca() {
		if(pb<100) 
			pb++;
		afiseazaBaterie();
		System.out.println("Incarcat: " + this.pb + "%");
	}
	
	// Metoda apeleaza() - efectuarea unui apel de pe telefon
	public void apeleaza() {
		if(pb<=k) {
			System.out.println("Telefon " + this.model + " descarcat!");
		}
		else {
			System.out.println("Telefonul " + this.model + " este utilizat.");
			pb = pb - k;
			afiseazaBaterie();
		}
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unor obiecte noi de tip SmartphoneV1
		SmartphoneV1 t1 = new SmartphoneV1();
		SmartphoneV1 t2 = new SmartphoneV1();
		SmartphoneV1 t3 = new SmartphoneV1("iPhone 13 Pro Max");
		SmartphoneV1 t4 = new SmartphoneV1("iPhone 13 Pro Max",5);
		
		// Apelare telefoane
		t1.apeleaza();
		t2.apeleaza();
		t3.apeleaza();
		t4.apeleaza();
		
		// Incarcare telefoane
		for(int i=0 ; i<5 ; i++) {
			t1.incarca();
		}
		for(int i=0 ; i<5 ; i++) {
			t2.incarca();
		}
		for(int i=0 ; i<5 ; i++) {
			t3.incarca();
		}
		for(int i=0 ; i<5 ; i++) {
			t4.incarca();
		}
		
		// Numarul de telefoane construite
		System.out.println("Telefoane construite: " + SmartphoneV1.contor);
	}

}
