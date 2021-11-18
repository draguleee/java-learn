 /*
 * Exercitiul 1
 * 
 * Sa se modifice exemplul CoffeeTest in asa fel incat CoffeeMaker va arunca o exceptie daca
 * un numar predefinit de obiecte de tip Coffee este creat.
 */

package isp_l7_ex1;

// Clasa publica ConcentrationException, care extinde / mosteneste clasa Exception
class ConcentrationException extends Exception {
	
	// Atributele / variabilele de instanta pentru clasa ConcentrationException
	int concentration;
	
	// Constructor - fara parametrii
	public ConcentrationException() {
		System.out.println("Constructor default ConcentrationException.");
	}
	
	// Constructor - parametrii: concentration (int), message (String)
	public ConcentrationException(int concentration, String message) {
		super(message);
		this.concentration = concentration;
		System.out.println("Constructor cu argumente ConcentrationException.");
	}
	
	// Getter pentru concentratia cafelei
	public int getConcentration() {
		return this.concentration;
	}
}
