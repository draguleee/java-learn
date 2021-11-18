/*
 * Utilizarea fluxurilor de intrare / iesire
 * 
 * Aplicatia urmatoare exemplifica modul in care fluxurile de intrare / iesire pot fi folosite
 * pentru scrierea si citirea de date din cadrul aplicatiilor Java
 */

package isp_l7_fluxuri;

import java.io.*;


// Clasa publica FileOutput
public class FileOutput {
	
	// Metoda main() - programul principal
	public static void main(String[] args) throws IOException {
		String s = new String();
		try {
			BufferedReader br = new BufferedReader(new StringReader(s));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("IODemo.out")));
			int lineCount = 1;
			while((s = br.readLine()) != null) {
				pw.println(lineCount++ + ": " + s);
			}
			pw.close();
		}
		catch(EOFException e) {
			System.err.println("End of Stream.");
		}
	}

}
