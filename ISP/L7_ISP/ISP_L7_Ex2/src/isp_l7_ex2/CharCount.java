/*
 * Exercitiul 2
 * 
 * Sa se scrie un program care numara aparitia unui caracter anume, precum e, dintr-un fisier.
 * Caracterul poate fi specificat in linia de comanda. Se foloseste data.txt ca si fisier input.
 */

package isp_l7_ex2;

import java.io.*;
import java.util.*;

public class CharCount {

    public void count(String fileName,char c) throws FileNotFoundException {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(fileName));
            int occurence = 0;
            String line = br.readLine();
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == c) {
                        occurence++;
                    }
                }
                line = br.readLine();
            }
            br.close();
            System.out.println("Occurence of " + c + ": " + occurence);
        } 
        catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
        }
    }


    public static void main(String[] args) throws Exception {
    	try {
    		CharCount fileSearch = new CharCount();
    		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    		System.out.print("Character to be count: ");
    		String line = in.readLine();
    		char c = line.charAt(0);
    		fileSearch.count("data.txt",c);
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		System.out.println("Error: " + e.getMessage());
    	}
    }

}
