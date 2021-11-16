/*
 * Clasa Student
 * 
 * Exemplu agregare
 */

package isp_l5_schoolstudent_agregare;

// Clasa publica Student
public class Student {
	
	// Atributele / variabilele de instanta pentru clasa Student
	private String name;
	
	// Constructor - fara parametrii
	public Student() {
		System.out.println("Constructor default student.");
		this.name = "Default";
	}
	
	// Constructor - parametrii: name (String)
	public Student(String name) {
		this.name = name;
	}

}
