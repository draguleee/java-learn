/*
 * Pentur implementarea mecanismului de serializare / deserializare, se poate folosi si interfata 
 * Exteernalizable, ce permite controlul mai fin al procesului de salvare si incarcare al obiectelor.
 * 
 * Interfata Externalizable extinde interfata Serializable si defineste metodele:
 * - writeExternal()
 * - readExternal()
 * 
 * Clasa ce implementeaza interfata Externalizable trebuie obligatoriu sa aiba definit constructorul
 * implicit, avand specificatorul de acces public
 * 
 * Daca se doreste ca un anumit atribut al unui obiect serializat sa nu fie salvat, atunci se poate
 * folosi cuvantul cheie 'transient' in fata declaratiei atributului respectiv.
 */

package isp_l7_serializare;

import java.util.*;
import java.io.*;


// Clasa Vagon, care implementeaza interfata Externalizable
class Vagon implements Externalizable {
	
	// Atributele / variabilele de instanta pentru clasa Vagon
	public int nr;
	public int nrPasageri;
	
	// Constructor - fara parametrii
	public Vagon() {
		System.out.println("Constructor default Vagon.");
	}
	
	// Constructor - parametrii: nr (int), nrPasageri (int)
	public Vagon(int nr, int nrPasageri) {
		System.out.println("Constructor cu argumente Vagon.");
		this.nr = nr;
		this.nrPasageri = nrPasageri;
	}
	
	// Metoda readExternal() - parametrii: in (ObjectInput)
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.nr = in.readInt();
		this.nrPasageri = in.readInt();
	}
	
	// Metoda writeExternal() - parametrii: out (ObjectOutput)
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(this.nr);
		out.writeInt(this.nrPasageri);
	}
	
	// Metoda toString()
	public String toString() {
		return "Numar vagon: " + this.nr + ", numar pasageri: " + this.nrPasageri;
	}
}


// Clasa Engine, care implementeaza interfata Serializable
class Engine implements Serializable {
	
	// Atributele / variabilele de instanta pentru clasa Engine
	public String tip;
	
	// Constructor - fara parametrii
	public Engine() {
		System.out.println("Constructor default Engine.");
		this.tip = "Default";
	}
	
	// Constructor - parametrii: tip (String)
	public Engine(String tip) {
		System.out.println("Constructor cu argumente Engine.");
		this.tip = tip;
	}
	
	// Metoda toString()
	public String toString() {
		return "-" + this.tip + "-";
	}
}


// Clasa Locomotiva, care implementeaza interfata Serializable
class Locomotiva implements Serializable {
	
	// Atributele / variabilele de instanta pentru clasa Locomotiva
	public String marca;
	public Engine e;
	
	// Constructor - fara parametrii
	public Locomotiva() {
		System.out.println("Constructor default Locomotiva.");
		this.marca = "Default";
		this.e = new Engine();
	}
	
	// Constructor - parametrii: marca (String), e (Engine)
	public Locomotiva(String marca, Engine e) {
		System.out.println("Constructor cu argumente Locomotiva.");
		this.marca = marca;
		this.e = e;
	}
	
	// Metoda toString()
	public String toString() {
		return "Locomotiva: " + this.marca + ", " + this.e;
	}
}


// Clasa Tren, care implementeaza interfata Serializable
class Tren implements Serializable {
	
	// Atributele / variabilele de instanta pentru clasa Tren
	public LinkedList tren = new LinkedList();
	public transient int id;
	
	// Constructor - fara parametrii
	public Tren() {
		System.out.println("Constructor default Tren.");
		this.id = (int)(Math.random()*1000);
	}
	
	// Metoda addVagon() - parametrii: v (Vagon)
	// Adauga un vagon in tren
	public void addVagon(Vagon v) {
		tren.addLast(v);
	}
	
	// Metoda addLocomotiva() - parametrii: l (Locomotiva)
	// Adauga o locomotiva in tren
	public void addLocomotiva(Locomotiva l) {
		tren.addFirst(l);
	}
	
	// Metoda save() - parametrii: fileName (String)
	public void save(String fileName) {
		try {
			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(fileName));
			o.writeObject(this);
			System.out.println("Tren salvat in fisier.");
		}
		catch(IOException e) {
			e.printStackTrace();
			System.err.println("Trenul nu poate fi scris in fisier!");
		}
	}
	
	// Metoda load() - parametrii: fileName (String)
	// Incarca fisierul
	public static Tren load(String fileName) throws IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
		Tren tren = (Tren)in.readObject();
		return tren;
	}
	
	// Metoda toString()
	public String toString() {
		String x = "Tren ID = " + id + " ";
		for(Iterator i = tren.iterator() ; i.hasNext();) {
			Object o = (Object)i.next();
			x += o;
		}
		return x;
	}
}


// Clasa publica Serializare2
public class Serializare2 {
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui obiect de tip Tren
		Tren tren = new Tren();
		System.out.println();
		
		// Crearea unui obiect de tip Locomotiva
		Locomotiva locomotiva = new Locomotiva("XYZ", new Engine("Diesel"));
		System.out.println();
		
		// Crearea unor obiecte de tip VAgon
		Vagon v1 = new Vagon(1,20);
		System.out.println();
		Vagon v2 = new Vagon(2,89);
		System.out.println();
		Vagon v3 = new Vagon(3,53);
		System.out.println();
		
		// Adaugarea vagoanelor la tren
		tren.addVagon(v1);
		tren.addVagon(v2);
		tren.addVagon(v3);
		
		// Adaugarea locomotivei la tren
		tren.addLocomotiva(locomotiva);
		
		// Afisarea obieectului de tip Tren
		System.out.println(tren);
		
		// Serializare obiect
		tren.save("trenX");
		
		// Deserializare obiect
		try {
			Tren t = Tren.load("trenX");
			System.out.println(t);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		
	}

}
