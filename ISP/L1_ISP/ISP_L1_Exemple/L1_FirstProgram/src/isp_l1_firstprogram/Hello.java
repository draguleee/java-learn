/*
 * Cel mai simplu program Java care afiseaza un text si data curenta
 */

package isp_l1_firstprogram;

import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

// Clasa publica Hello
public class Hello {
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		System.out.print("Hello, the current date and time are: ");
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
	}

}
