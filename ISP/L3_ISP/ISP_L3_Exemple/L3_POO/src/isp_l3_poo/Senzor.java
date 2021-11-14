/*
 * Clasa Senzor
 */

package isp_l3_poo;

// Clasa publica Senzor
// O clasa este definita prin intermediul cuvantului cheie class, urmat de numele concret al clasei.
public class Senzor {
	
	// Atributele / variabilele de instanta ale clasei Senzor
	int value;			// Valoarea pe care o afiseaza senzorul
	boolean active;		// Starea de activ / inactiv a senzorului
	
	// Metoda setActive() - seteaza starea senzorului
	public void setActive() {
		active = !active;
		System.out.println("Sensor active status = " + active);
	}
	
	// Metoda setValue() - seteaza valoarea senzorului
	public void setValue(int k) {
		if(k<0 || k>100) {
			System.out.println("Invalid value. Sensor value unchanged!");
		}
		else {
			value = k;
			System.out.println("Sensor value = " + value);
		}
	}
	
	// Metoda getValue() - returneaza valoarea senzorului
	public int getValue() {
		return this.value;
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) throws NullPointerException{
	
		// Crearea unor noi obiecte de tip Senzor
		Senzor s1 = new Senzor();
		Senzor s2 = new Senzor();
		Senzor s3 = null;
	
		/*
		try {
			// Afisarea valorilor pentru fiecare senzor
			System.out.println("Sensor s1 value: " + s1.value);
			System.out.println("Sensor s2 value: " + s2.value);
			System.out.println("Sensor s3 value: " + s3.value);
		}
		catch(Exception e) {
			System.err.println("Nu se poate citi pentru s3!");
		}
		*/
		
		/*
		// Setarea statusului si valorii pentru senzorul 1
		s1.setActive();
		s1.setValue(100);
		
		// Setarea statusului si valorii pentru senzorul 2
		s1.setActive();
		s2.setValue(200);
		
		// Setarea statusului si valorii pentru senzorul 3
		s3.setActive();
		s3.setValue(50);
		
		// Afisarea valorilor pentru fiecare senzor
		System.out.println("Sensor s1 value = " + s1.getValue());		// s1
		System.out.println("Sensor s2 value = " + s2.getValue());		// s2
		System.out.println("Sensor s3 value = " + s3.getValue());		// s3
		*/
		
		// Setarea statusului si valorii pentru senzorul 1
		s1.setActive();
		s1.setValue(190);
		s1.setValue(67);
		
		//
		System.out.println("Sensor s1 value = " + s1.getValue());
		System.out.println("Snesor s2 value = " + s2.getValue());
		s2 = s1;
		s3 = s1;
		System.out.println();
		System.out.println("Sensor s2 value = " + s2.getValue());
		System.out.println("Sensor s3 value = " + s3.getValue());
	
	}

}
