/*
 * Clasa Downcasting
 */

package isp_l4_rc;

//Clasa EmployeeV1
class EmployeeV2 {
	
	// Metoda doWork() - fara parametrii
	// Executa un task aspura angajatului
	public void doWork() {
		System.out.println("Employee does their job.");
	}
	
}


//Clasa ManagerV1, care extinde clasa Employee
class ManagerV2 extends EmployeeV2 {
	
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

// Clasa publica Downcasting, care modeleaza conversia de tip downcast
// Downcasting este conversia inversa celei de upcasting si este o conversie explicita de tip mergand
// in jos, de la o clasa de baza la o clasa derivata
// CLASA DE BAZA -> CLASA DERIVATA
public class Downcasting {
	
	// Metoda main() - programul principal
	public static void main(String[] args) throws ClassCastException {
		
		// Crearea unui manager (obiect de tip ManagerV2)
		EmployeeV2 m = new ManagerV2();
		
		// Asignarea assignment-urilor pentru manager
		m.doWork();
		((ManagerV2)m).report();
		
		// Crearea unuiangajat (obiect de tip EmployeeV2)
		EmployeeV2 e = new EmployeeV2();
		
		// Asignarea assignment-urilor pentru angajat -> manager
		try {
			((ManagerV2)e).report();
		}
		catch(Exception ex) {
			System.err.println("Variabila e refera catre un obiect de tip Employee!");
		}
	
	}

}
