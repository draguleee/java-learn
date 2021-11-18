/*
 * Utilizarea fluxurilor de intrare / iesire
 * 
 * Aplicatia urmatoare exemplifica modul in care fluxurile de intrare / iesire pot fi folosite
 * pentru scrierea si citirea de date din cadrul aplicatiilor Java
 */

package isp_l7_fluxuri;

import java.io.*;


// Clasa publica StoringAndRecoveringData
public class StoringAndRecoveringData {
	
	// Metoda main() - programul principal
	public static void main(String[] args) throws IOException {
		try {
			
			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Data.txt")));
			dos.writeDouble(3.14159);
			dos.writeUTF("That was pi.");
			dos.writeDouble(1.41413);
			dos.writeUTF("Square root of 2.");
			dos.close();
			
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("Data.txt")));
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
		}
		catch(EOFException e) {
			throw new RuntimeException(e);
		}
	}

}
