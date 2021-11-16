/*
 * Clasa HashCode
 */

package isp_l6_objectclass;


// Clasa publica HashCode, care modeleaza utilizarea metodei hashCode()
public class HashCode implements Cloneable{
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Creare obiecte de tip Employee
		Employee e1 = new Employee("Andre",1,3000);
		Employee e2 = new Employee("Andre",1,3000);
		Employee e3 = new Employee("Oana",2,4000);
		
		// Testare metoda equals() - e1 si e2
		if(e1.equals(e2)) {
			System.out.println("Obiectele sunt identice.");
		}
		else {
			System.out.println("Obiectele sunt diferite.");
		}
		
		// Testare metoda equals() - e1 si e3
		if(e1.equals(e3)) {
			System.out.println("Obiectele sunt identice.");
		}
		else {
			System.out.println("Obiectele sunt diferite.");
		}	
		
		// Testare metoda hashCode()
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
	}

}


// Clasa Employee
class Employee {
	
	// Atributele / variabilele de instanta ale clasei Employee
	int id;
	int salary;
	String name;
	
	// Constructor - parametrii: name (String), id (int), salary (int)
	public Employee(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	// Metoda equals() - fara parametrii
	// Compara referintele a doua obiecte
	@Override
	public boolean equals(Object o) {
		if(o instanceof Employee) {
			Employee p = (Employee)o;
			return id == p.id && salary == p.salary && name.equals(name);
		}
		return false;
	}
	
	// Metoda hashCode() - fara parametrii
	// Returneaza un numar pozitiv care sa fie consistent cu valoarea de adevar returnata de metoda equals()
	@Override
	public int hashCode() {
		return id + name.hashCode() + salary;
	}

}