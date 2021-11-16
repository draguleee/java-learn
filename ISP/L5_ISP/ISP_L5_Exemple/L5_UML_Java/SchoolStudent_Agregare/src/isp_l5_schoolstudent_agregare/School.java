/*
 * Clasa School
 * 
 * Exemplu agregare
 */

package isp_l5_schoolstudent_agregare;

import java.util.ArrayList;

// Clasa publica School
public class School {

	/* PRIMA METODA
	
	// Atributele / variabilele de instanta pentru clasa School
	public Student[] students;
	
	// Constructor - fara parametrii
	public School() {
		students = new Student[5];
		students[0] = new Student("A");
		students[1] = new Student("B");
		students[2] = new Student("C");
		students[3] = new Student("D");
		students[4] = new Student("E");
	}
	
	*/
	
	
	// A doua metoda
	
	// Atributele / variabilele de instanta pentru clasa School
	private ArrayList<Student> students = new ArrayList<Student>();
	
	// Metoda pentru adaugarea studentilor in lista
	public void addStudent(Student student) {
		students.add(student);
	}

}
