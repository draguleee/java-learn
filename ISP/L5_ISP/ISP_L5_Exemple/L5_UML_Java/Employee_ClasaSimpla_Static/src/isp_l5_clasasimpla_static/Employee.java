/*
 * Clasa Employee
 * 
 * Exemplu clasa simpla. Atribute si metode statice
 */

package isp_l5_clasasimpla_static;

// Clasa publica Employee
public class Employee {
	
	// Atributele / variabilele de instanta ale clasei Employee
	private static String department = "Manufacturing";
	private int empId;
	
	// Constructor - fara parametrii
	public Employee() {
		this.empId = empId;
	}

	// Metoda getDepartment() - fara parametrii
	// Returneaza departamentul pe care este repartizat angajatul
	public static String getDepartment() {
		return department;
	}

	// Metoda getEmployee() - parametrii: empId (int)
	public static String getEmployee(int empId) {
		if(empId == 1) {
			return "Sample employee.";
		}
		else {
			return "Employee not found.";
		}
	}
}
