/*
 * Clasa Clone
 */

package isp_l6_objectclass;

// Clasa publica Clone, care modeleaza utilizarea metodei clone()
public class Clone implements Cloneable {
	
	// Atributele / variabilele de instanta pentru clasa Clone
	String mesaj;
	
	// Constructor - fara parametrii
	public Clone(String mesaj) {
		this.mesaj = mesaj;
	}
	
	// Metoda clone() - fara parametrii
	// Cloneaza un obiect
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		try { 
		
			// Crearea obiectului c1 si clonarea acestuia in c2
			Clone c1 = new Clone("Obiect");
			Clone c2 = (Clone)c1.clone();
		
			// Afisare date c1, c2
			System.out.println(c1.mesaj);
			System.out.println(c2.mesaj);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
