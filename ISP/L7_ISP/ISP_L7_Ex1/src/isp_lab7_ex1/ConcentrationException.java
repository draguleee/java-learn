/*
 * Exercitiul 1
 * 
 * Sa se modifice exemplul Coffee Maker astfel incat clasa CoffeeMaker sa arunce o exceptie daca un
 * numar de obiecte de tip Coffee sunt create
 */

package isp_lab7_ex1;

// Clasa publica ConcentrationException
public class ConcentrationException extends Exception{
    int c;
    
    // Constructor pentru clasa ConcentrationException - parametrii: c(int), msg(String)
    public ConcentrationException(int c,String msg) {
    	super(msg);
        this.c = c;
    }

    // Metoda getConc() - returneaza concentratia cafelei
    public int getConc() {
        return c;
    }
    
}