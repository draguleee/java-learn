/*
 * Crearea propriilor exceptii
 * 
 * Programatorul are posibilitatea de a defini propriile sale exceptii prin extinderea clasei
 * Exception
 */

package isp_l7_tratare_erori;


// Clasa publica TestMyException, care modeleaza crearea propriilor exceptii
public class TestMyException {
	
	// Metoda f() - fara parametrii
	// Arunca o exceptie
	public static void f() throws MyException {
		System.out.println("Exceptie in metoda f()");
		throw new MyException();
	}
	
	// Metoda g() - fara parametrii
	// Arunca o exceptie
	public static void g() throws MyException {
		System.out.println("Exceptie in metoda g()");
		throw new MyException(" aruncata din g()");
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
	
		// Try-Catch pentru prinderea exceptiilor din f()
		try {
			f();
		}
		catch(MyException e) {
			// e.printStackTrace()
			System.err.println("Exceptie din f() prinsa.");
		}
		
		System.out.println();
		
		// Try-Catch pentru prinderea exceptiilor din g()
		try {
			g();
		}
		catch(MyException e) {
			// e.printStackTrace();
			System.err.println("Exceptiem din g() prinsa.");
		}
	}
}


// Clasa MyException
class MyException extends Exception {
	
	// Constructor - fara parametrii
	public MyException() {
		System.out.println("Constructor default MyException.");
	}
	
	// Constructor - parametrii: message (String)
	public MyException(String message) {
		super(message);
		System.out.println("Constructor cu parametrii MyException.");
	}
}
