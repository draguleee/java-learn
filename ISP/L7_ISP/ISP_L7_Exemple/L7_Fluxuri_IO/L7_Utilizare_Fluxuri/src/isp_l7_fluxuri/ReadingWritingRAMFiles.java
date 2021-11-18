/*
 * Utilizarea fluxurilor de intrare / iesire
 * 
 * Aplicatia urmatoare exemplifica modul in care fluxurile de intrare / iesire pot fi folosite
 * pentru scrierea si citirea de date din cadrul aplicatiilor Java
 */

package isp_l7_fluxuri;

import java.io.*;


// Clasa publica ReadingWritingRAMFiles
public class ReadingWritingRAMFiles {
	
	// Metoda main() - programul principal
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("rtest.dat","rw");
		for(int i=0 ; i<10 ; i++) {
			raf.writeDouble(i*1.414);
		}
		raf.close();
		
		raf = new RandomAccessFile("rtest.dat","rw");
		raf.seek(5*8);
		raf.writeDouble(47.0001);
		raf.close();
		
		raf = new RandomAccessFile("rtest.dat","r");
		for(int i=0 ; i<10 ; i++) {
			System.out.println("Value " + i + ": " + raf.readDouble());
		}
		raf.close();
	}

}
