/*
 * Clasa Mostenire2
 */
package isp_l4_rc;


// Clasa publica Mostenire2, care modeleaza procesul / conceptul de mostenire
public class Mostenire2 {
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Creare persoana (obiect de tip Persoana2)
		Persoana2 p1 = new Persoana2();
		p1.afiseazaDetalii();
		System.out.println();
		
		// Creare persoana (obiect de tip Persoana2)
		Persoana2 p2 = new Persoana2("A",22);
		p2.afiseazaDetalii();
		
		// Creare student (obiect de tip Student2)		Persoana2 -> Student2
		Persoana2 s1 = new Student2("B",23,"UTCN");
		s1.afiseazaDetalii();
		System.out.println();
		
		// Creare student (obiect de tip Student2)		Student2 -> Student2
		Student2 s2 = new Student2("C",20,"UBB");
		s2.afiseazaDetalii();
		System.out.println();
		
		// Creare student (obiect de tip Student2)		Persoana2 -> ErasmusStudent2
		Persoana2 s3 = new ErasmusStudent2("D",21,"HVA","UTCN");
		s3.afiseazaDetalii();
		System.out.println();
		
		// Creare student (obiect de tip Student2)		Student2 -> ErasmusStudent2
		Student2 s4 = new ErasmusStudent2("E",19,"HVA","UBB");
		s4.afiseazaDetalii();
		System.out.println();
	}

}


// Clasa Persoana2
class Persoana2 {
	
	// Atributele / variabilele de instanta pentru clasa Persoana2
	String nume;
	int varsta;
	
	// Constructor - fara parametrii
	public Persoana2() {
		System.out.println("Constructor default persoana.");
	}
	
	// Constructor - parametrii: nume (String), varsta (int)
	public Persoana2(String nume, int varsta) {
		System.out.println("Constructor cu argumente persoana.");
		this.nume = nume;
		this.varsta = varsta;
	}
	
	// Metoda afiseazaDetalii() - fara parametrii
	// Afiseaza detaliile persoanei
	public void afiseazaDetalii() {
		System.out.println(this.nume + ", " + this.varsta);
	}
	
}


// Clasa Student2, care extinde / mosteneste clasa Persoana2
class Student2 extends Persoana2 {
	
	// Atributele / variabilele de instanta pentru clasa Student2
	String uni;
	
	// Constructor - parametrii: nume (String), varsta (int), uni (String)
	public Student2(String nume, int varsta, String uni) {
		super(nume,varsta);
		this.uni = uni;
		System.out.println("Constructor student.");
	}
	
	// Metoda afiseazaDetalii() - fara parametrii
	// Afiseaza detaliile studentului
	public void afiseazaDetalii() {
		super.afiseazaDetalii();
		System.out.println(this.uni);
	}
	
}


// Clasa ErasmusStudent2, care extinde / mosteneste clasa Student2
class ErasmusStudent2 extends Student2 {
	
	// Atributele / variabilele de instanta ale clasei ErasmusStudent2
	String uni;
	String remoteUni;
	
	// Constructor - parametrii: nume (String), varsta (int), uni (String), remoteUni (String)
	public ErasmusStudent2(String nume, int varsta, String uni, String remoteUni) {
		super(nume,varsta,uni);
		this.remoteUni = remoteUni;
		System.out.println("Constructor student Erasmus.");
	}
	
	// Metoda afiseazaDetalii() - fara parametrii
	// Afiseaza detaliile studentului Erasmus
	public void afiseazaDetalii() {
		super.afiseazaDetalii();
		System.out.println(this.remoteUni);
	}
	
}