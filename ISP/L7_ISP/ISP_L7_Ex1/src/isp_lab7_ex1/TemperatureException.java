/*
 * Exercitiul 1
 * 
 * Sa se modifice exemplul Coffee Maker astfel incat clasa CoffeeMaker sa arunce o exceptie daca un
 * numar de obiecte de tip Coffee sunt create
 */

package isp_lab7_ex1;

// Clasa publica TemperatureException
public class TemperatureException extends Exception{
    int t;
    
    // Constructor pentru clasa TemperatureException - parametrii, t(int), msg(String)
    public TemperatureException(int t,String msg) {
    	super(msg);
        this.t = t;
    }

    // Metoda getTemp() - returneaza valoarea temperaturii cafelei
    public int getTemp(){
        return t;
    }
    
}
