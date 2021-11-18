/*
 * Exercitiul 3
 * 
 * Scrieti un program care sa cripteze si sa decripteze fisiere text folosind un algoritm simplu
 * (fiecare cod ASCII al caracterelor este shiftat la stanga cu 1). Fisierele criptate vor avea
 * extensia '.enc'. Aplicatia va primi operatia (criptare / decriptare) si fisierul pe care se va
 * aplica operatia ca argumente din linia de comanda. Fisierele decriptate vor fi stocate, avand
 * acelasi nume ca si fisierele criptate, dar cu extensia '.dec'.
 */

package isp_l7_ex3;

import java.util.*;
import java.io.*;
import java.security.*;


// Clasa EncDec
public class EncDec {
	
	// Constanta ALPHABET
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
 
    
    // Metoda encrypt() - parametrii: plainText (String), shiftKey (int)
    // Cripteaza textul din fisier
    public static String encrypt(String plainText, int shiftKey) {
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++) {
            int charPosition = ALPHABET.indexOf(plainText.charAt(i));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = ALPHABET.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }
    
    
    // Metoda decrypt() - parametrii: cipherText (String), shiftKey (int)
    // Decripteaza textul din fisier
    public static String decrypt(String cipherText, int shiftKey) {
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++) {
            int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - shiftKey) % 26;
            if (keyVal < 0) {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            plainText += replaceVal;
        }
        return plainText;
    }
 
    
    // Metoda main() - programul principal
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Textul pentru criptare: ");
        String message = new String();
        message = in.next();
        System.out.print("Indicele de shiftare la stanga: ");
        int shiftKey = in.nextInt();
        System.out.println(encrypt(message, shiftKey));
        System.out.println(decrypt(encrypt(message, shiftKey), shiftKey));
        in.close();
    }
    
}
