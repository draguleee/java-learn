/*
 * Exercitiul 4
 * 
 * Se considera o clasa Car cu atributele 'model' si 'price'.
 * Sa se scrie un program care permite utilizatorului sa:
 * - Creeze obiecte de tip Car
 * - Salveze obiecte de tip Car in fisier
 * - Vizualizeze obiecte de tip Car din fisier
 * - Citeasca obiecte de tip Car din fisier
 * - Afiseze detaliile obiectelor de tip Car din fisier
 * 
 * Sa se foloseasca mecanismul de serializare pentru stocarea si preluarea obiectelor.
 */

package isp_l7_ex4;

import java.util.*;
import java.io.*;


// Clasa publica Car
public class Car implements Externalizable {
	
	// Atributele / variabilele de instanta pentru clasa Car
	public Car[] cars;
	public String model;
	public transient int price;
	
	// Constructor - fara parametrii
	public Car() {
		System.out.println("Constructor default Car.");
		this.model = "Default";
		this.price = 10000;
	}
	
	// Constructor - parametrii: model (String)
	public Car(String model) {
		System.out.println("Constructor cu argumente Car.");
		this.model = model;
		this.price = (int)(Math.random()*1000);
	}
	
	// Metoda save() - parametrii: fileName (String)
	// Salveaza obiectele de tip Car in fisier
	public void save(String fileName) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
			out.writeObject(this);
			System.out.println("Car saved in file.");
		}
		catch(IOException e) {
			e.printStackTrace();
			System.err.println("Car could not be saved in file!");
		}
	}
	
	// Metoda load() - parametrii: fileName (String)
	// Incarca obiectele de tip Car din fisier
	public static Car load(String fileName) throws IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
		Car car = (Car)in.readObject();
		return car;
	}
	
	// Metoda readExternal() - parametrii: in (ObjectInput)
	// Citeste obiectele de tip Car din fisier
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.model = in.readLine();
		this.price = in.readInt();
	}
	
	// Metoda writeExternal() - parametrii: out (ObjectOutput)
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeBytes(model);
		out.writeInt(price);
	}
	
	// Metoda toString()
	public String toString() {
		return "Model masina: " + this.model + ", pret: " + this.price;
	}
}
