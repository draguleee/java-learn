/*
 * Exercitiul 1
 * 
 * Sa se modifice exemplul CoffeeTest in asa fel incat CoffeeMaker va arunca o exceptie daca
 * un numar predefinit de obiecte de tip Coffee este creat.
 */

package isp_l7_ex1;

// Clasa publica CoffeeObjectsExceededException, care extinde clasa Exception
public class CoffeeObjectsExceededException extends Exception {

	// Atributele / variabilele de instanta pentru clasa ConcentrationException
	int number;
	
	// Constructor - fara parametrii
	public CoffeeObjectsExceededException() {
		System.out.println("Constructor default CoffeeObjectsExceededException.");
	}
	
	// Constructor - parametrii: number (int), message (String)
	public CoffeeObjectsExceededException(int number, String message) {
		super(message);
		this.number = number;
		System.out.println("Constructor cu argumente CoffeeObjectsExceededException.");
	}
	
	// Getter pentru concentratia cafelei
	public int getNumber() {
		return this.number;
	}
}
