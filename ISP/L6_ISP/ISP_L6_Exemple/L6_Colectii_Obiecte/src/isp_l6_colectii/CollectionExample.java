/*
 * Clasa CollectionExample
 */

package isp_l6_colectii;

import java.util.*;


// Clasa publica CollectionExample
public class CollectionExample {

	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		
		
		/* ARRAY LIST 
		 * - Modeleaza o colectie ordonata de elemente
		 * - Spre deosebire de Set, List permite existenta elementelor duplicat
		 * - Utilizatorul are control asupra pozitiei elementelor in cadrul listei
		 */
		System.out.println("---------------------------------------------------------------------");
		System.out.println("ARRAY LIST");
		System.out.println("---------------------------------------------------------------------");
		System.out.println();
		
		// Crearea unor liste de tip ArrayList
		List al = new ArrayList();			// Flexibilitate mai mare
		ArrayList al0 = new ArrayList();
		
		// Adaugarea elementelor in ArrayList
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		// al.addAll(al0);
		System.out.println("ArrayList:" + al);
		System.out.println();
		
		// Schimbarea elementelor din ArrayList
		al.set(0, "X");
		al.set(1, "Y");
		al.set(2, "Z");
		al.set(3, "A");
		al.set(4, "B");
		al.set(5, "C");
		System.out.println("Modified ArrayList: " + al);
		System.out.println();
		
		// Parcurgerea elementelor din ArrayList
		System.out.println("Parcurgerea elementelor din ArrayList: ");
		for(int i=0 ; i<al.size() ; i++) {
			String string = (String)al.get(i);
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println();
		
		// Parcurgerea mai eleganta a elementelor din ArrayList
		System.out.println("Parcurgerea mai eleganta a elementelor din ArrayList: ");
		for(Object o : al) {
			System.out.print((String)o + " ");
		}
		System.out.println();
		System.out.println();
		
		// Parcurgerea unei liste cu un iterator - varianta 1
		Iterator iterator = al.iterator();
		System.out.println("Parcurgere cu iterator - varianta 1: ");
		while(iterator.hasNext()) {
			String string = (String)iterator.next();
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println();
		
		// Parcurgerea unei liste cu un iterator - varianta 2
		System.out.println("Parcurgere cu iterator - varianta 2: ");
		for(Iterator ix = al.iterator(); ix.hasNext();) {
			String string = (String)ix.next();
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println();		
		
		// Selectarea unui anumit element din ArrayList
		System.out.println("Extragerea pe rand a elementelor din ArrayList: ");
		System.out.println("- Primul element: " + al.get(0));
		System.out.println("- Al doilea element: " + al.get(1));
		System.out.println("- Al treilea element: " + al.get(2));
		System.out.println("- Al patrulea element " + al.get(3));
		System.out.println("- Al cincilea element: " + al.get(4));
		System.out.println("- Al saselea element: " + al.get(5));
		System.out.println();
		
		// Stergerea elementelor din ArrayList
		/*
		al.remove(0);
		al.remove(1);
		al.remove(2);
		al.remove(3);
		al.remove(4);
		al.remove(5);
		*/
		al.removeAll(al);
		System.out.println("ArrayList gol: " + al);
		System.out.println();
		System.out.println();
		
		
		
		/* LINKED LIST 
		 * - Lista inlantuita
		 * - Permite adaugarea, citirea si stergerea de elemente de la inceputul si sfarsitul listei
		 * - Adaugare element la inceput de lista: addFirst()
		 * - Stergere element la sfarsit de lista: removeLast()
		 */
		System.out.println("---------------------------------------------------------------------");
		System.out.println("LINKED LIST");
		System.out.println("---------------------------------------------------------------------");
		System.out.println();
		
		// Crearea unor liste de tip LinkedList
		List ll = new LinkedList();		// Flexibilitate mai mare
		LinkedList ll0 = new LinkedList();
		
		// Adaugarea elementelor in LinkedList
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		ll.add("F");
		// ll.addAll(ll0);
		System.out.println("LinkedList: " + ll);
		System.out.println();
		
		// Schimbarea elementelor din LinkedList
		ll.set(0, "X");
		ll.set(1, "Y");
		ll.set(2, "Z");
		ll.set(3, "A");
		ll.set(4, "B");
		ll.set(5, "C");
		System.out.println("Modified LinkedList: " + ll);
		System.out.println();
		
		// Parcurgerea elementelor din LinkedList
		System.out.println("Parcurgerea elementelor din LinkedList: ");
		for(int i=0 ; i<ll.size() ; i++) {
			String string = (String)ll.get(i);
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println();
		
		// Parcurgerea mai eleganta a elementelor din LinkedList
		System.out.println("Parcurgerea mai eleganta a elementelor din LinkedList: ");
		for(Object o : ll) {
			System.out.print((String)o + " ");
		}
		System.out.println();
		System.out.println();
		
		// Parcurgerea unei liste cu un iterator - varianta 1
		Iterator it = ll.iterator();
		System.out.println("Parcurgere cu iterator - varianta 1: ");
		while(it.hasNext()) {
			String string = (String)it.next();
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println();
		
		// Parcurgerea unei liste cu un iterator - varianta 2
		Iterator iy = ll.iterator();
		System.out.println("Parcurgere cu iterator - varianta 2: ");
		for(iy = ll.iterator(); iy.hasNext();) {
			String string = (String)iy.next();
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println();
		
		// Selectarea unui anumit element din ArrayList
		System.out.println("Extragerea pe rand a elementelor din LinkedList: ");
		System.out.println("- Primul element: " + ll.get(0));
		System.out.println("- Al doilea element: " + ll.get(1));
		System.out.println("- Al treilea element: " + ll.get(2));
		System.out.println("- Al patrulea element " + ll.get(3));
		System.out.println("- Al cincilea element: " + ll.get(4));
		System.out.println("- Al saselea element: " + ll.get(5));
		System.out.println();
		
		// Stergerea elementelor din LinkedList
		/*
		ll.remove(0);
		ll.remove(1);
		ll.remove(2);
		ll.remove(3);
		ll.remove(4);
		ll.remove(5);
		*/
		ll.removeAll(al);
		System.out.println("LinkedList gol: " + ll);
		System.out.println();
		System.out.println();
		
		
		
		/* TREE SET
		 * - Colectie de obiecte unice
		 * - Trei colectii de tip Set: TreeSet, HashSet, LinkedHashSet
		 */
		System.out.println("---------------------------------------------------------------------");
		System.out.println("TREE SET");
		System.out.println("---------------------------------------------------------------------");
		System.out.println();
		
		// Crearea unor liste de tip LinkedList
		Set ts = new TreeSet();			// Flexibilitate mai mare
		TreeSet ts0 = new TreeSet();
		
		// Adaugarea elementelor in LinkedList
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("D");
		ts.add("E");
		ts.add("F");
		// ts.addAll(ts0);
		System.out.println("TreeSet: " + ts);
		System.out.println();
		
		// Parcurgerea mai eleganta a elementelor din TreeSet
		System.out.println("Parcurgerea mai eleganta a elementelor din TreeSet: ");
		for(Object o : ts) {
			System.out.print((String)o + " ");
		}
		System.out.println();
		System.out.println();
		
		// Parcurgerea unei liste cu un iterator - varianta 1
		Iterator i1 = ts.iterator();
		System.out.println("Parcurgere cu iterator - varianta 1: ");
		while(i1.hasNext()) {
			String string = (String)i1.next();
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println();
		
		// Parcurgerea unei liste cu un iterator - varianta 2
		System.out.println("Parcurgere cu iterator - varianta 2: ");
		for(Iterator i2 = ts.iterator(); i2.hasNext();) {
			String string = (String)i2.next();
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println();
		
		// Stergerea elementelor din TreeSet
		/*
		ts.remove(0);
		ts.remove(1);
		ts.remove(2);
		ts.remove(3);
		ts.remove(4);
		ts.remove(5);
		*/
		ts.removeAll(ts);
		System.out.println("TreeSet gol: " + ts);
		System.out.println();
		System.out.println();
		
		
		
		/* HASH SET
		 * - Colectie de obiecte unice
		 * - Trei colectii de tip Set: TreeSet, HashSet, LinkedHashSet
		 */
		System.out.println("---------------------------------------------------------------------");
		System.out.println("HASH SET");
		System.out.println("---------------------------------------------------------------------");
		System.out.println();
		
		// Crearea unor liste de tip HashSet
		Set hs = new HashSet();		// Flexibilitate mai mare
		HashSet hs0 = new HashSet();
		
		// Adaugarea elementelor in LinkedList
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		// hs.addAll(hs0);
		System.out.println("HashSet: " + hs);
		System.out.println();
		
		// Parcurgerea mai eleganta a elementelor din HashSet
		System.out.println("Parcurgerea mai eleganta a elementelor din HashSet: ");
		for(Object o : hs) {
			System.out.print((String)o + " ");
		}
		System.out.println();
		System.out.println();
		
		// Parcurgerea unei liste cu un iterator - varianta 1
		Iterator ih1 = hs.iterator();
		System.out.println("Parcurgere cu iterator - varianta 1: ");
		while(ih1.hasNext()) {
			String string = (String)ih1.next();
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println();
		
		// Parcurgerea unei liste cu un iterator - varianta 2
		Iterator ih2 = hs.iterator();
		System.out.println("Parcurgere cu iterator - varianta 2: ");
		for(ih2 = hs.iterator(); ih2.hasNext();) {
			String string = (String)ih2.next();
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println();
		
		// Stergerea elementelor din HashSet
		/*
		hs.remove(0);
		hs.remove(1);
		hs.remove(2);
		hs.remove(3);
		hs.remove(4);
		hs.remove(5);
		*/
		hs.removeAll(hs);
		System.out.println("HashSet gol: " + hs);
		System.out.println();
		System.out.println();
		
		
		
		/* LINKED HASH SET
		 * - Colectie de obiecte unice
		 * - Trei colectii de tip Set: TreeSet, HashSet, LinkedHashSet
		 */
		System.out.println("---------------------------------------------------------------------");
		System.out.println("LINKED HASH SET");
		System.out.println("---------------------------------------------------------------------");
		System.out.println();
		
		// Crearea unor liste de tip LinkedHashSet
		Set lhs = new LinkedHashSet();		// Flexibilitate mai mare
		LinkedHashSet lhs0 = new LinkedHashSet();
		
		// Adaugarea elementelor in LinkedList
		lhs.add("A");
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");
		lhs.add("E");
		lhs.add("F");
		// lhs.addAll(lhs0);
		System.out.println("LinkedHashSet: " + lhs);
		System.out.println();
		
		// Parcurgerea mai eleganta a elementelor din LinkedHashSet
		System.out.println("Parcurgerea mai eleganta a elementelor din LinkedHashSet: ");
		for(Object o : lhs) {
			System.out.print((String)o + " ");
		}
		System.out.println();
		System.out.println();
		
		// Parcurgerea unei liste cu un iterator - varianta 1
		Iterator ilh1 = lhs.iterator();
		System.out.println("Parcurgere cu iterator - varianta 1: ");
		while(ilh1.hasNext()) {
			String string = (String)ilh1.next();
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println();
		
		// Parcurgerea unei liste cu un iterator - varianta 2
		Iterator ilh2 = lhs.iterator();
		System.out.println("Parcurgere cu iterator - varianta 2: ");
		for(ilh2 = lhs.iterator(); ilh2.hasNext();) {
			String string = (String)ilh2.next();
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println();
		
		// Stergerea elementelor din LinkedHashSet
		/*
		lhs.remove(0);
		lhs.remove(1);
		lhs.remove(2);
		lhs.remove(3);
		lhs.remove(4);
		lhs.remove(5);
		*/
		lhs.removeAll(lhs);
		System.out.println("LinkedHashSet gol: " + lhs);
		System.out.println();
		System.out.println();
		
		
		
		/* QUEUE
		 * - Mosteneste toate caracteristicile interfetei Collection
		 * - Adauga facilitati suplimentare pentru adaugarea, extragerea si parcurgerea elementelor
		 */
		System.out.println("---------------------------------------------------------------------");
		System.out.println("QUEUE");
		System.out.println("---------------------------------------------------------------------");
		System.out.println();
		
		// Crearea unor queue-uri de tip PriorityQueue
		Queue q = new PriorityQueue();		// Flexibilitate mai mare
		PriorityQueue q0 = new PriorityQueue();
		
		// Adaugarea elementelor in LinkedList
		/*
		q.add("A",1);
		q.add("B",5);
		q.add("C",3);
		q.add("D",4);
		q.add("E",6);
		q.add("F",2);
		*/
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		q.add("E");
		q.add("F");
		// q.addAll(q0);
		System.out.println("PriorityQueue: " + q);
		System.out.println();
		
		// Setare prioritati in PriorityQueue
		q.offer(0);
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		
		// Parcurgerea mai eleganta a elementelor din PriorityQueue
		System.out.println("Parcurgerea mai eleganta a elementelor din PriorityQueue: ");
		for(Object o : q) {
			System.out.print((String)o + " ");
		}
		System.out.println();
		System.out.println();
		
		// Parcurgerea unei liste cu un iterator - varianta 1
		Iterator iq1 = q.iterator();
		System.out.println("Parcurgere cu iterator - varianta 1: ");
		while(iq1.hasNext()) {
			String string = (String)iq1.next();
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println();
		
		// Parcurgerea unei liste cu un iterator - varianta 2
		Iterator iq2 = q.iterator();
		System.out.println("Parcurgere cu iterator - varianta 2: ");
		for(iq2 = q.iterator(); iq2.hasNext();) {
			String string = (String)iq2.next();
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println();
		
		// Stergerea elementelor din LinkedList
		/*
		q.remove(0);
		q.remove(1);
		q.remove(2);
		q.remove(3);
		q.remove(4);
		q.remove(5);
		*/
		q.removeAll(q);
		System.out.println("Queue gol: " + q);
		System.out.println();
		System.out.println();
		
	
	}
}