/*
 * Fluxurile standard pot fi redirectate folosind metodele:
 * - setOut() - clasa System
 * - setIn() - clasa System
 * - setErr() - clasa System
 */

package isp_l7_stdio;

import java.io.*;


// Clasa publica RedirectIO
public class RedirectIO {
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		try {
			
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(".project"));
			PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("test.out")));
			System.setIn(in);
			System.setOut(out);
			System.setErr(out);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			out.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
