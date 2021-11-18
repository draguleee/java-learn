/*
 * Utilizarea fluxurilor de intrare / iesire
 * 
 * Aplicatia urmatoare exemplifica modul in care fluxurile de intrare / iesire pot fi folosite
 * pentru scrierea si citirea de date din cadrul aplicatiilor Java
 */

package isp_l7_fluxuri;

import java.io.*;


// Clasa publica ReadStandardInput
public class ReadStandardInput {
	
	// Metoda main() - programul principal
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a line: ");
		System.out.println(br.readLine());
	}

}
