/*
 * Exemplificarea modului in care poate fi comprimat / decomprimat un fisier.
 */

package isp_l7_zip;

import java.io.*;
import java.util.zip.*;


// Clasa publica ZipUtil
public class ZipUtil {
	
	
	// Metoda compressFile() - parametrii: source (String), destination (String)
	// Comprima fisierul
	public void compressFile(String source, String destination) {
		
		try {
			
			// Crearea OutputStream-ului GZIP
			String outFileName = destination;
			GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream(outFileName));
			
			// Deschiderea fisierului de input
			String inFileName = source;
			FileInputStream in = new FileInputStream(inFileName);
			
			// Transferarea bitilor din fisierul input in OutputStream-ul GZIP
			byte[] buffer = new byte[1024];
			int length;
			while((length = in.read(buffer)) > 0) {
				out.write(buffer,0,length);
			}
			in.close();
			
			// Completarea fisierului GZIP
			out.finish();
			out.close();
			
		}
		catch(Exception e) {
			System.out.println("Error compressing file: " + e.getMessage());
		}
		
	}
	
	
	// Metoda decompressFile() - parametrii: source (String), destination (String)
	// Decomprima fisierul
	public void decompressFile(String source, String destination) {
		
		try {
			
			// Deschiderea fisierului comprimat
			String inFileName = source;
			GZIPInputStream in = new GZIPInputStream(new FileInputStream(inFileName));
			
			// Deschiderea fisierului de output
			String outFileName = destination;
			OutputStream out = new FileOutputStream(outFileName);
			
			// Transferarea bitilor din fisierul comprimat in fisierul output
			byte[] buffer = new byte[1024];
			int length;
			while((length = in.read(buffer)) > 0) {
				out.write(buffer,0,length);
			}
			
			// Inchiderea fisierului si a stream-ului
			in.close();
			out.close();
			
		}
		catch(IOException e) {
			System.out.println("Error decompressing file: " + e.getMessage());
		}
		
	}
	
	
	// Metoda generateFile() - parametrii: name (String), size (long)
	// Genereaza fisierul care trebuie comprimat / decomprimat
	public void generateFile(String name, long size) {
		
		try {
		
			FileOutputStream fos = new FileOutputStream(new File(name));
			for(int i=0 ; i<size ; i++) {
				int c = (int)(40+Math.random()*50);
				fos.write(c);
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui obiect de tip ZipUtil
		ZipUtil zu = new ZipUtil();
		
		// Generarea fisierului pentru comprimare / decomprimare
		zu.generateFile("test.txt", 1024);
		zu.compressFile("test.txt", "test.gzip");
		zu.decompressFile("test.gzip", "decompressed.txt");
	}	

}
