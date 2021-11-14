/*
 * Clasa InitializareAtribute
 */

package isp_l3_cvo;

// Clasa publica InitializareAtribute, care modeleaza initializarea atributelor
public class InitializareAtribute {
	
	// Atributele / variabilele de instanta ale clasei InitializareAtribute
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	
	// Metoda print()
	public void print(String s) {
		System.out.println(s);
	}
	
	// Metoda test() - testarea metodei print()
	public void test() {
		print("Data Type---------------Initial Value");
		print("boolean                     " + t);
		print("char                        [" + c + "]");
		print("byte                        " + b);
		print("short                       " + s);
		print("int                         " + i);
		print("long                        " + l);
		print("float                       " + f);
		print("double                      " + d);
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea obiectului de tip InitializareAtribute
		InitializareAtribute ia = new InitializareAtribute();
		ia.test();
	}

}
