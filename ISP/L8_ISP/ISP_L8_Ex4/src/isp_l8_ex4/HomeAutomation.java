/*
 * Exercitiul 4
 * 
 * Sa se implementeze un simulator de home automation.
 */

package isp_l8_ex4;


// Clasa publica HomeAutomation
public class HomeAutomation {
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
        Home h = new Home() {
            protected void setValueInEnvironment(Event event){
               System.out.println("New event in environment "+event); 
            }
            protected void controlStep() {
                System.out.println("Control step executed");
            }
        };
        
        h.simulate();
	}

}
