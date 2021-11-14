/*
 * Clasa SmartphoneV2
 */

package isp_l3_cvo;


// Clasa publica Baterie
class Baterie {
	
	// Atributele / variabilele de instanta ale clasei Baterie
	int pb;			// Procentaj baterie telefon
	
	// Constructor - fara parametrii
	public Baterie() {
		this.pb = 100;
	}
	
	// Metoda utilizeaza() - parametrii: x (int)
	// Metoda pentru utilizarea telefonului
	public boolean utilizeaza(int x) {
		if(pb <= x) {
			System.out.println("Baterie descarcata!");
			return false;
		}
		pb = pb - x;
		return true;
	}
	
	// Metoda afiseaza() - fara parametrii
	// Metoda pentru afisarea procentajului bateriei
	public void afiseaza() {
		System.out.println("Baterie " + pb + "%");
	}
	
	// Metoda incarca() - fara parametrii
	// Metoda pentru incarcarea telefonului
	public void incarca() {
		if(pb < 100) {
			pb++;
		}
		afiseaza();
	}
	
}


// Clasa publica SmartphoneV2
public class SmartphoneV2 {
	
	// Atribute / variabile de instanta de tip SmartphoneV2
	static int contor;			// Contor telefon
	String model;				// Model telefon
	int pb;						// Procentaj baterie telefon
	int k;
	Baterie b = null;			// Bateria telefonului
	
	// Constructor - parametrii: model (String), k (int)
	public SmartphoneV2(String model, int k) {
		contor++;
		this.model = model;
		this.k = k;
		System.out.println("Telefon " + model + " construit.");
		afiseazaBaterie();
	}
	
	// Metoda afiseazaBaterie() - fara parametrii
	// Afiseaza procentajul bateriei telefonului
	public void afiseazaBaterie() {
		if(b != null) {
			b.afiseaza();
		}
		else {
			System.out.println("Telefonul nu are baterie!");
		}
	}
	
	// Metoda incarca() - fara parametrii
	// Incarca telefonul
	public void incarca() {
		if(b != null) {
			b.incarca();
		} else {
			System.out.println("Telefonul nu are baterie!");
		}
	}
	
	// Metoda seteazaBaterie() - parametrii: b (Baterie)
	// Seteaza bateria in interiorul telefonului
	public void seteazaBaterie(Baterie b) {
		if(b != null) {
			System.out.println("Se inlocuieste bateria!");
		} else {
			System.out.println("Se instaleaza bateria!");
		}
		this.b = b;
	}
	
	// Metoda apeleaza() - fara parametrii
	// Efectuarea de apeluri de pe telefon
	public void apeleaza() {
		System.out.println("Apelare...");
		if(b == null) {
			System.out.println("Telefonul nu are baterie!");
			return;
		}
		if(b.utilizeaza(k) == false) {
			System.out.println("Bateria telefonului este descarcata!");
		} else {
			System.out.println("Telefonul " + this.model + " este utilizat.");
		}
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui nou obiect de tip SmartphoneV2
		SmartphoneV2 t = new SmartphoneV2("iPhone XR",10);
		
		// Crearea unui nou obiect de tip Baterie
		Baterie b = new Baterie();
		
		// Afisarea bateriei telefonului
		// => Telefonul nu are baterie momentan
		t.afiseazaBaterie();
		
		// Setarea unei baterii in telefonul t
		t.seteazaBaterie(b);
		
		// Incarcarea telefonului t cu bateria b
		t.incarca();
		
		// Apelarea telefonului t
		t.apeleaza();
		
		// Telefonul construit
		System.out.println("Telefoane construite: " + SmartphoneV2.contor);
	}

}
