/*
 * Serializarea: mecanismul prin care starea obiectelor poate fi citita din memorie si trimisa printr-un
 * flux catre o destinatie (aplicatie, fisier, retea etc).
 * 
 * Deserializarea: procesul invers al serializarii
 * 
 * Fluxuri: ObjectInputStream, ObjectOutputStream
 */

package isp_l7_serializare;

import java.util.*;
import java.io.*;


// Clasa Alien
class Alien implements Serializable {
	
	// Atributele / variabilele de instanta pentru clasa Alien
	public String name;
	public transient int id;
	
	// Constructor - fara parametrii
	public Alien() {
		System.out.println("Constructor default Alien.");
		this.name = "default";
		this.id = 1;
	}
	
	// Constructor - parametrii: name (String)
	public Alien(String name) {
		System.out.println("Constructor cu argumente Alien.");
		this.name = name;
		this.id = (int)(Math.random()*100);
	}
	
	// Metoda move() - fara parametrii
	// Efectueaza miscarea extraterestrului
	public void move() {
		System.out.println("Alien is moving. " + this);
	}
	
	// Metoda toString()
	// Afiseaza detaliile extraterestrului
	public String toString() {
		return "Alien: " + this.name + ", id: " + this.id;
	}
}


// Clasa AlienFactory
class AlienFactory {
	
	// Metoda createAlien() - parametrii: name (String)
	// Creeaza un obiect de tip Alien
	public Alien createAlien(String name) {
		Alien a = new Alien(name);
		System.out.println(a + " is alive.");
		return a;
	}
	
	// Metoda freezeAlien() - parametrii: a (Alien), storeRecipientName (String)
	// Metoda care serializeaza obiectul de tip Alien
	public void freezeAlien(Alien a, String storeRecipientName) throws IOException {
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(storeRecipientName));
		o.writeObject(a);
		System.out.println(a + ": I'll be back.");
	}
	
	// Metoda unfreezeAlien() - parametrii: storeRecipientName (String)
	// Metoda care deserializeaza obiectul de tip Alien
	public Alien unfreezeAlien(String storeRecipientName) throws IOException, ClassNotFoundException {
		ObjectInputStream i = new ObjectInputStream(new FileInputStream(storeRecipientName));
		Alien x = (Alien)i.readObject();
		System.out.println(x + ": I'm back.");
		return x;
	}
}


// Clasa publica Serializare1, care modeleaza procesul de serializare a obiectelor
public class Serializare1 {
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) throws Exception {
		
		// Crearea unui obiect de tip AlienFactory
		AlienFactory af = new AlienFactory();
		
		// Crearea unor obiecte de tip Alien
		Alien a1 = new Alien("Alien1");
		System.out.println();
		Alien a2 = new Alien("Alien2");
		System.out.println();
		
		// Serializare obiecte
		af.freezeAlien(a1, "alien1.dat");
		af.freezeAlien(a2, "alien2.dat");
		
		// Deserializare obiecte
		Alien x = af.unfreezeAlien("alien1.dat");
		Alien y = af.unfreezeAlien("alien2.dat");
		
		// Afisare obiecte deserializate
		System.out.println(x);
		System.out.println(y);
	}

}



