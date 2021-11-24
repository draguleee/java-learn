/*
 * Exemplul 2
 * 
 * Exemplu ce modeleaza folosirea casutelor de text si a butoanelor
 */

package isp_l9_ui1;

import java.util.*;
import java.awt.*;
import javax.swing.*;


// Clasa publica ButtonAndTextField, care extinde clasa JFrame
public class ButtonAndTextField extends JFrame {
	
	// Atributele / variabilele de instanta pentru clasa ButtonAndTextField
	HashMap accounts = new HashMap();
	
	// Componentele pentru GUI (Graphic User Interface)
	JLabel user;
	JLabel password;
	JTextField textUser;
	JTextField textPassword;
	JButton buttonLogin;
	
	
	// Constructor - fara parametrii
	public ButtonAndTextField() {
		
		// Punerea obiectelor cheie-valoare in HashMap
		accounts.put("User1", "Password1");	
		accounts.put("User2", "Password2");
		accounts.put("User3", "Password3");
		
		// Design-ul ferestrei
		setTitle("Test Login");								// Seteaza titlul ferestrei
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// Seteaza operatiunea de inchidere a ferestrei (apasarea butonului de Exit)
		init();												// Seteaza design-ul ferestrei (casute de text, label-uri, butoane)
		setSize(200,250);									// Seteaza dimensiunea ferestrei
		setVisible(true);									// Seteaza vizibilitatea ferestrei
	}
	
	
	// Metoda init() - fara parametrii
	public void init() {
		
		// Layout-ul ferestrei
		this.setLayout(null);
		int width = 80;
		int height = 20;
		
		// Setare JLabel user
		user = new JLabel("User ");
		user.setBounds(10,50,width,height);
		
		// Setare JLabel password
		password = new JLabel("Password ");
		password.setBounds(10,100,width,height);
		
		// Setare JTextField textUser
		textUser = new JTextField();
		textUser.setBounds(70,50,width,height);
		
		// Setare JTextField textPassword
		textPassword = new JTextField();
		textPassword.setBounds(70,100,width,height);
		
		// Setare JButton login
		buttonLogin = new JButton("Login");
		buttonLogin.setBounds(10,150,width,height);
		
		// Adaugarea elementelor create in fereastra
		add(user);
		add(password);
		add(textUser);
		add(textPassword);
		add(buttonLogin);
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unei ferestre de Login
		ButtonAndTextField batf = new ButtonAndTextField();
	}

}
