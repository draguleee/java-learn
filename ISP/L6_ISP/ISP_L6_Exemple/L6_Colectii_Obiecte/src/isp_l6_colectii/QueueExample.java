/*
 * Clasa QueueExample
 * 
 * - offer(Object o): adauga un element in coda, poate esua in adaugarea unui element daca coada este plina
 * - remove(): returneaza elementul din capul listei, arunca o exceptie
 * - poll(): returneaza elementul din capul listei, returneaza valoarea null
 * - element(), peak(): returneaza elementul din capul lister fara a-l sterge
 */

package isp_l6_colectii;

import java.util.*;


// Clasa QueueExample
public class QueueExample {
	
	
	// Metoda displayAll1() - parametrii: q (Queue)
	public static void displayAll1(Queue q) {
		System.out.println("Display Queue with ENHANCED FOR: ");
		for(Object o : q) {
			System.out.println(o + " ");
		}
	}
	
	// Metoda displayAll2() - parametrii: q (Queue)
	public static void displayAll2(Queue q) {
		System.out.println("Display Queue with iterator V1: ");
		Iterator iq1 = q.iterator();
		while(iq1.hasNext()) {
			System.out.println(iq1.next() + " ");
		}
	}
	
	// Metoda displayAll3() - parametrii: q (Queue)
	public static void displayAll3(Queue q) {
		System.out.println("Display Queue with iterator V2: ");
		for(Iterator iq2 = q.iterator() ; iq2.hasNext();) {
			System.out.println(iq2.next() + " ");
		}
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui PriorityQueue
		PriorityQueue pq = new PriorityQueue();
		
		// Crearea unor obiecte de tip Job
		Job j1 = new Job("A",1);
		Job j2 = new Job("B",4);
		Job j3 = new Job("A",1);
		Job j4 = new Job("C",3);
		System.out.println();
		
		// Testare metoda compareTo()
		System.out.println(j1.compareTo(j2));
		System.out.println(j1.compareTo(j3));
		System.out.println(j1.compareTo(j4));
		System.out.println(j2.compareTo(j3));
		System.out.println(j2.compareTo(j4));
		System.out.println(j3.compareTo(j4));
		System.out.println();
		
		// Testare metoda equals()
		System.out.println(j1.equals(j2));
		System.out.println(j1.equals(j3));
		System.out.println(j1.equals(j4));
		System.out.println(j2.equals(j3));
		System.out.println(j2.equals(j4));
		System.out.println(j3.equals(j4));
		System.out.println();
		
		// Testare hashCode()
		System.out.println(j1.hashCode());
		System.out.println(j2.hashCode());
		System.out.println(j3.hashCode());
		System.out.println(j4.hashCode());
		System.out.println();
		
		// Adaugarea obiectelor de tip Job in PriorityQueue
		pq.offer(j1);
		pq.offer(j2);
		pq.offer(j3);
		pq.offer(j4);
		
		// Afisare Queue
		displayAll1(pq);
		System.out.println();
		System.out.println();
		displayAll2(pq);
		System.out.println();
		System.out.println();
		displayAll3(pq);
		System.out.println();
		System.out.println();
		
		// Testare metoda execute() + asignare prioritate
		while(pq.size() != 0) {
			Job j = (Job)pq.poll();
			j.execute();
		}
	}

}


// Clasa Job, care implementeaza interfata Comparable {
class Job implements Comparable {
	
	// Atributele / variabilele de instanta pentru clasa Job
	int p;
	String name;
	
	// Constructor - parametrii: name (String), p (int)
	public Job(String name, int p) {
		System.out.println("Constructor cu argumente Job.");
		this.name = name;
		this.p = p;
	}
	
	// Metoda execute() - fara parametrii
	// Executa jobul
	public void execute() {
		System.out.println("Execute job: " + this.name + ", job p: " + this.p);
	}
	
	// Metoda compareTo() - parametriiL o (Object)
	// Compara doua obiecte intre ele
	public int compareTo(Object o) {
		Job j = (Job)o;
		if(p > j.p) {
			return 1;
		}
		else if (p == j.p) {
			return 0;
		}
		return -1;
	}
	
	// Metoda equals() - parametrii: o (Object)
	// Compara referintele a doua obiecte
	public boolean equals(Object o) {
		if(o instanceof Job) {
			Job j = (Job)o;
			return j.p == p && name.equals(name);
		}
		return false;
	}
	
	// Metoda hashCode()
	// Returneaza un intreg care este in concordanta cu valoarea de adevar a metodei equals()
	public int hashCode() {
		return p + name.hashCode();
	}
	
	// Metoda toString()
	public String toString() {
		return "Job: " + this.name + " with priority: " + this.p;
	}
}
