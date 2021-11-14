/*
 * Clasa Upcasting
 */

package isp_l4_rc;

// Clasa EmployeeV1
class EmployeeV1 {
	
	// Metoda doWork() - fara parametrii
	// Executa un task aspura angajatului
	public void doWork() {
		System.out.println("Employee does their job.");
	}
	
}


// Clasa ManagerV1, care extinde clasa Employee
class ManagerV1 extends EmployeeV1 {
	
	// Metoda report() - fara parametrii
	// Raporteaza starea proiectului
	public void report() {
		System.out.println("Manager is reporting project status.");
	}
	
	// Metoda doWork() - fara parametrii
	// Executa un task aspura manager-ului
	public void doWork() {
		System.out.println("Manager coordinates the job.");
	}
	
}


// Clasa publica Upcasting, care modeleaza conversia de tip upcasting
// Upcasting este procesul de conversie a unei referinte la o clasa derivata catre o clasa de baza a acestei clase.
// Operatia de upcasting este automata si nu trebuie declarata in mod explicit.
// CLASA DERIVATA -> CLASA DE BAZA
public class Upcasting {
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui angajat nou (obiect de tip Employee)
		EmployeeV1 e = new EmployeeV1();
		EmployeeV1 m = new ManagerV1();
		
		// Asignarea assignment-urilor pentru angajat si manager
		e.doWork();
		m.doWork();
	}

}
