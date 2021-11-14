/*
 * Claa Engine
 */

package isp_l3_cvo;

// Clasa publica Engine, care modeleaza utilizarea cuvantului cheie "this"
public class Engine {
	
	// Atributele / variabilele de instanta a clasei Engine
	String fuelType;
	long capacity;
	boolean active;
	
	// Constructor 1 - parametrii: capacity (long), active (boolean)
	public Engine(long capacity, boolean active) {
		this.capacity = capacity;
		this.active = active;
	}
	
	// Constructor 2 - parametrii: capacity (long), active (boolean), fuelType (String)
	// Apelarea primului constructor in cadrul celui de-al doilea constructor
	public Engine(long capacity, boolean active, String fuelType) {
		this(capacity,active);
		this.fuelType = fuelType;
	}
	
	// Constructor 3 - default, fara parametrii
	public Engine() {
		this(2000,false,"Diesel");
	}
	
	// Metoda toString()
	public String toString() {
		return "Engine capacity: " + this.capacity + ", fuel type: " + this.fuelType + ", active: " + this.active;
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea obiectelor de tip Engine
		Engine i16 = new Engine(1600,false,"petrol");
		Engine d30 = new Engine(3000,true,"diesel");
		Engine tdi = new Engine();
		
		// Afisarea datelor pentru obiecte de tip Engine
		System.out.println(i16.toString());
		System.out.println(d30.toString());
		System.out.println(tdi.toString());
	}

}
