/*
 * Clasa LinkedListExample
 */

package isp_l6_colectii;

import java.util.*;


// Clasa LinkedListExample
public class LinkedListExample {
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unei liste de tip LinkedList
		LinkedList lk = new LinkedList();
		
		// Crearea unor obiecte de tip Command
		Command c1 = new Command("Comanda 1");
		Command c2 = new Command("Comanda 2");
		Command c3 = new Command("Comanda 3");
		Command c4 = new Command("Comanda 4");
		System.out.println();
		
		// Executare comenzi
		c1.execute();
		c2.execute();
		c3.execute();
		c4.execute();
		System.out.println();
		
		// Adaugare elemente in capul listei, in LinkedList
		lk.addFirst(c1);
		lk.addFirst(c2);
		lk.addFirst(c3);
		lk.addFirst(c4);
		
		// Stergere elemente din coada listei, in LinkedList
		lk.removeLast();
		lk.removeLast();
		lk.removeLast();
		lk.removeLast();

	}

}


// Clasa Command
class Command {
	
	// Atributele / variabilele de instanta pentru clasa Command
	String name;
	
	// Constructor - parametrii: name (String)
	public Command(String name) {
		System.out.println("Constructor cu argumente Command");
		this.name = name;
	}
	
	// Metoda execute() - fara parametrii
	// Executa comanda
	public void execute() {
		System.out.println("Execute command: " + this.name);
	}
}
