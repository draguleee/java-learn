/*
 * Utilizarea fluxurilor de intrare / iesire
 * 
 * Aplicatia urmatoare exemplifica modul in care fluxurile de intrare / iesire pot fi folosite
 * pentru scrierea si citirea de date din cadrul aplicatiilor Java
 */

package isp_l7_fluxuri;

import java.io.*;


// Clasa publica InputMemory
public class InputMemory {
	
	// Metoda main() - programul principal
	public static void main(String[] args) throws IOException {
		String s = new String();
		StringReader sr = new StringReader(s);
		int c;
		while((c = sr.read()) != -1) {
			System.out.print((char)c);
		}
	}

}
