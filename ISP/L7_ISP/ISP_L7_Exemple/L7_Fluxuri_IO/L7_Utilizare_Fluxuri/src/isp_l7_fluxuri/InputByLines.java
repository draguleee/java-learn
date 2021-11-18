/*
 * Utilizarea fluxurilor de intrare / iesire
 * 
 * Aplicatia urmatoare exemplifica modul in care fluxurile de intrare / iesire pot fi folosite
 * pentru scrierea si citirea de date din cadrul aplicatiilor Java
 */

package isp_l7_fluxuri;

import java.io.*;


// Clasa publica InputByLines
public class InputByLines {
	
	// Metoda main() - programul principal
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(".project"));
		String s1, s2 = new String();
		while((s1 = br.readLine()) != null) {
			s2 += s1 + "\n";
		}
		br.close();
	}

}
