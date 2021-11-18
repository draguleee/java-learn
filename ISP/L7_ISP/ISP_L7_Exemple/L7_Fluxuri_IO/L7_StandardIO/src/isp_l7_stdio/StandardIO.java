/*
 * Exemplu in care se prezinta modul in care poate fi folosit fluzul de intrare standard pentru
 * citirea datelor
 */

package isp_l7_stdio;

import java.io.*;
import java.util.*;


// Clasa publica StandardIO
public class StandardIO {
	
	// Metoda sortChars() - parametrii: string (String)
	public static String sortChars(String string) {
		char[] character = string.toCharArray();
		Arrays.sort(character);
		return new String(character);
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = "";
			do {
				System.out.println("Introduceti String-ul: ");
				line = br.readLine();
				System.out.println("Result: " + sortChars(line));
			}
			while(line.indexOf("end") == -1);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Eroare: " + e.getMessage());
		}
		
	}

}
