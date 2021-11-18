/*
 * Utilizarea fluxurilor de intrare / iesire
 * 
 * Aplicatia urmatoare exemplifica modul in care fluxurile de intrare / iesire pot fi folosite
 * pentru scrierea si citirea de date din cadrul aplicatiilor Java
 */

package isp_l7_fluxuri;

import java.io.*;


// Clasa FormattedMemoryInput
public class FormattedMemoryInput {

	// Metoda main() - programul principal
	public static void main(String[] args) throws IOException {
		String s = new String();
		try {
			DataInputStream dis = new DataInputStream(new ByteArrayInputStream(s.getBytes()));
			while(true) {
				System.out.print((char)dis.readByte());
			}
		}
		catch(EOFException e) {
			System.err.println("End of Stream.");
		}
	}
}
