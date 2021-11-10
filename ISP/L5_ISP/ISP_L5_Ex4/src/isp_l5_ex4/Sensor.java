/* 
 * Exercitiul 4
 * 
 * Sa se actualizeze clasa Controller din exercitiul anterior astfel incat sa fie implementat
 * ca fiind un Singleton.
 */

package isp_l5_ex4;

//Clasa abstracta si publica, Sensor
public abstract class Sensor {
	
	// Variabilele de instanta ale clasei
	private String location;
	
	// Metoda abstracta readValue(), care citeste valoarea de pe senzor
	public abstract int readValue();
	
	// Metoda getLocation, care afiseaza locatia senzorului
	public String getLocation() {
		return this.location;
	}
	
}