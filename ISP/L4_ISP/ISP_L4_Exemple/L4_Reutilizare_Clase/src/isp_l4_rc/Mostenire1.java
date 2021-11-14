/*
 * Clasa Mostenire1
 */

package isp_l4_rc;


// Clasa publica Mostenire1, care modeleaza procesul / conceptul de mostenire
public class Mostenire1 {
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Creare persoane (obiecte de tip Persoana1)
		Persoana1 p1 = new Persoana1();
		Persoana1 p2 = new Persoana1("A",22);
		
		// Afisare date persoane
		p1.afiseaza();
		System.out.println();
		p2.afiseaza();
		System.out.println();
		
		// Creare studenti (obiecte de tip Student1)
		Student1 s1 = new Student1("UTCN","B",23);
		Student1 s2 = new Student1("HVA","C",20);
		
		// Afisare date studenti
		s1.afiseaza();
		s1.afiseazaSituatie();
		System.out.println();
		s2.afiseaza();
		s2.afiseazaSituatie();
		System.out.println();
		
		// Conversii de tip
		Persoana1 x = new Student1("UBB","D",19);		// Implicita
		Student1 y = (Student1) x;						// Explicita
		
		// Afisare date studenti
		x.afiseaza();
		System.out.println();
		y.afiseaza();
		y.afiseazaSituatie();
		System.out.println();
		
		// Creare persoana (obiect de tip Persoana1)
		Persoana1 p = new Persoana1();
		if(p instanceof Student1) {
			Student1 z = (Student1) p;
			z.afiseaza();
			z.afiseazaSituatie();
		}
		
	}
	
}


// Clasa Persoana1
class Persoana1 {
	
	// Atributele / variabilele de instanta ale clasei Persoana
	String nume;
	int varsta;
	
	// Constructor - fara parametrii
	public Persoana1() {
		this.nume = "Fara nume";
		this.varsta = -1;
	}
	
	// Constructor - parametrii: nume (String), varsta (int)
	public Persoana1(String nume, int varsta) {
		this.nume = nume;
		this.varsta = varsta;
	}
	
	// Metoda afisare() - fara parametrii
	// Afiseaza datele persoanei
	public void afiseaza() {
		System.out.println("Persoana " + this.nume + " cu varsta " + this.varsta);
	}
	
}


// Clasa Student1, care extinde clasa Persoana1
class Student1 extends Persoana1 {
	
	// Atributele / variabilele de instanta ale clasei Student1
	String uni;
	
	// Constructor - parametrii: uni (String), nume (String), varsta (int)
	public Student1(String uni, String nume, int varsta) {
		super(nume,varsta);
		this.uni = uni;
	}
	
	// Metoda afiseaza() - fara parametrii
	// Afiseaza datele studentului
	public void afiseaza() {
		super.afiseaza();
		System.out.println("Universitatea: " + this.uni);
	}
	
	// Metoda afiseazaSituatie() - fara parametrii
	// Afiseaza situatia scolara a studentului
	public void afiseazaSituatie() {
		System.out.println("Afiseaza situatie student...");
	}
	
}
