/*
 * Fluxurile de tip Pipe:
 * - Folosite pentru a trimite date intre doua componente ale aceluiasi program
 * Utilitatea lor va deveni evidenta in momentul in care se va discuta despre fire de executie si
 * aplicatii multifir
 * 
 * Pipe-uri orientate pe byte: PipedInputStream / PipedOutputStream
 * Pipe-uri orientate pe caracter: PipedReader / PipedWriter
 */

package isp_L7_pipeflux;

import java.io.*;


// Clasa publica PipeFlux
public class PipeFlux {
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		try {
			
			PipedReader in = new PipedReader();
			PipedWriter out = new PipedWriter();
			in.connect(out);
			
			// Scrierea datelor in Pipe
			out.write("Mesaj scris in Pipe.");
			
			// Citirea datelor din Pipe
			while(in.ready()) {
				int x = in.read();
				System.out.println("Citeste din Pipe: " + (char)x);
			}
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println();
			System.out.println("Finished.");
		}
	}

}
