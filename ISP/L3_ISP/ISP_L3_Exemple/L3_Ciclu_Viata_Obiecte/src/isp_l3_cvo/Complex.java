/*
 * Clasa Complex
 */

package isp_l3_cvo;

// Clasa publica Complex, care modeleaza utilizarea cuvantului cheie "this"
public class Complex {
	
	// Atributele / variabilele de instanta ale clasei Complex
	int real;		
	int imaginar;
	
	// Constructor 1 - default
	public Complex() {
		this.real = 1;
		this.imaginar = 1;
	}
	
	// Constructor 2 - parametrii: real (int), imaginar (int)
	public Complex(int real, int imaginar) {
		this.real = real;
		this.imaginar = imaginar;
	}
	
	// Metoda add() - parametrii: i (int), j (int)
	// Metoda care trebuie sa returneze obiectul curent
	public Complex add(int i, int j) {
		real = real+i;
		imaginar = imaginar+i;
		return this;
	}
	
	// Metoda add() - parametrii: o (Complex)
	public Complex add(Complex o) {
		Complex temp = new Complex(0,0);
		temp.real = this.real+o.real;
		temp.imaginar = this.imaginar+o.imaginar;
		return temp;
	}
	
	// Metoda subtract() - parametrii: o (Complex)
		public Complex subtract(Complex o) {
			Complex temp = new Complex(0,0);
			temp.real = this.real-o.real;
			temp.imaginar = this.imaginar-o.imaginar;
			return temp;
		}
	
	// Metoda toString()
	public String toString() {
		return this.real + " + " + this.imaginar + "i";
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea obiectelor de tip Complex
		Complex c1 = new Complex(2,3);
		Complex c2 = new Complex(4,1);
		
		// Afisarea numerelor complexe
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		// Adunarea numerelor complexe
		System.out.println("Suma: "+ c1.add(c2));
		System.out.println("Diferenta: " + c1.subtract(c2));
		
	}

}
