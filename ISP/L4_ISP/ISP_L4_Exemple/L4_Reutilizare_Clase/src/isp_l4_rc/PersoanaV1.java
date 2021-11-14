/*
 * Clasa Persoana
 */

package isp_l4_rc;

// Clasa persoana, care modeleaza conceptul de mostenire
// Mostenirea este procesul de construire a unei clase, plecand de la o clasa existenta si adaugand
// noi caracteristici sau modificand caracteristici existente.
// - Superclasa: clasa de la care se mostenesc caracteristicile
//- Subclasa: clasa care mosteneste caracteristicile
public class PersoanaV1 {
	
	// Atributele / variabilele de instanta ale clasei PersoanaV1
	public String nume;
	public AdresaV1 adresa;
	
	// Metoda setAdresa() - parametrii: adresa (AdresaV1)
	// Seteaza adresa la care locuieste persoana
	public void setAdresa(AdresaV1 adresa) {
		this.adresa = adresa;
	}
	
	// Metoda afiseaza() - fara parametrii
	// Afiseaza numele si adresa persoanei
	public void afiseaza() {
		System.out.println("Nume: " + this.nume);
		System.out.println("Adresa: " + this.adresa);
	}

}


// Clasa AngajatV1, extinde / mosteneste clasa PersoanaV1
class AngajatV1 extends PersoanaV1 {
	
	// Atributele / variabilele de instanta ale clasei AngajatV1
	public int venit;
	
	// Metoda afiseaza() - fara parametrii
	// Afiseaza numele, adresa si venitul angajatului
	public void afiseaza() {
		super.afiseaza();
		System.out.println("Venit: " + this.venit);
	}
	
	// Metoda calculeazaImpozit() - fara parametrii
	// Calculeaza impozitul angajatului
	public int calculeazaImpozit() {
		return this.venit/2;
	}
	
}


// Clasa AdresaV1
class AdresaV1 {
	
	// Atributele / variabilele de instanta ale clasei AdresaV1
	String adresa;
	int numar;
}