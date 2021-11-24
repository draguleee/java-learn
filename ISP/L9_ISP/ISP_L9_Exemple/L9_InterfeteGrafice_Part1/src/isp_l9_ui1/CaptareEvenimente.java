/*
 * Exemplul 3
 */

/*
 * ActionListener:
 * - Metode: actionPerformed()
 * - Componentele generatoare de evenimente: AbstractButon, Button, ButtonModel, ComboBoxEditor, JComboBox, JFileChooser, JTextField, List, Menultem, TextField, Timer
 */

/*
 * AdjustmentListener:
 * - Metode: adjustmentValueChanged()
 * - Componentele generatoare de evenimente: Adjustable, JScrollBar, Scrollbar
 */

/*
 * ComponentListener:
 * - Metode: componentHidden(), componentMoved(), componentResized(), componentShown()
 * - Componentele generatoare de evenimente: Component
 */

/*
 * ContainerListener:
 * - Metode: componentAdded(), componentRemoved()
 * - Componentele generatoare de evenimente: Container
 */

/*
 * FocusListener:
 * - Metode: focusGained(), focusLost()
 * - Componentele generatoare de evenimente: Component
 */

/*
 * ItemListener:
 * - Metode: itemStateChanged()
 * - Componentele generatoare de evenimente: AbstractButton, ButtonModel, Checkbox, CheckboxMenultem, Choirce, ItemSelectrable, JComboBox, List
 */

/*
 * KeyListener:
 * - Metode: keyPressed(), keyReleased(), keyTyped()
 * - Componentele generatoare de evenimente: Component
 */

/*
 * MouseListener:
 * - Metode: mouseClicked(), mouseEntered(), mouseExited(), mousePressed(), mouseReleased()
 * - Componentele generatoare de evenimente: Component
 */

/*
 * MouseMotionListener:
 * - Metode: mouseDragged(), mouseMoved()
 * - Componentele generatoare de evenimente: Component
 */

/*
 * TextListener:
 * - Metode: textValueChanged()
 * - Componentele generatoare de evenimente: TextListener
 */

/*
 * WindowListener:
 * - Metode: windowActivated(), windowClosed(), windowClosing(), windowDeactivated(), windowDeiconified(), windowIconified(), windowOpened()
 * - Componentele generatoare de evenimente: Window
 */

package isp_l9_ui1;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.*;


//Clasa publica CaptareEvenimente, care extinde clasa JFrame
public class CaptareEvenimente extends JFrame {
	
	// Atributele / variabilele de instanta pentru clasa CaptareEvenimente
	HashMap accounts = new HashMap();
	
	// Componentele pentru GUI (Graphic User Interface)
	JLabel user;
	JLabel password;
	JTextField textUser;
	JTextField textPassword;
	JTextArea textArea;
	JButton buttonLogin;
	
	// Constructor - fara parametrii
	public CaptareEvenimente() {
		
		// Punerea obiectelor cheie-valoare in HashMap
		accounts.put("User1", "Password1");
		accounts.put("User2", "Password2");
		accounts.put("User3", "Password3");
		
		// Design-ul ferestrei
		setTitle("Test Login");								// Seteaza titlul ferestrei
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// Seteaza operatiunea de inchidere a ferestrei (apasarea butonului de Exit)
		init();												// Seteaza design-ul ferestrei
		setSize(200,300);									// Seteaza dimensiunea ferestrei
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
		buttonLogin.addActionListener(new TratareButonLogin());
		
		// Setare JTextArea textArea
		textArea = new JTextArea();
		textArea.setBounds(10,180,150,80);
		
		// Adaugarea elementelor create in fereastra
		add(user);
		add(password);
		add(textUser);
		add(textPassword);
		add(buttonLogin);
		add(textArea);
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unei ferestre de Login
		CaptareEvenimente eventCapt = new CaptareEvenimente();
	}
	
	
	// Clasa TratareButonLogin, care implementeaza interfata ActionListener
	class TratareButonLogin implements ActionListener {
		
		
		// Metoda actionPerformed() - parametrii: e (ActionEvent)
		public void actionPerformed(ActionEvent e) {
			
			// Preluarea textului din casuta de text user si password din CaptareEvenimente
			String user = CaptareEvenimente.this.textUser.getText();
			String password = CaptareEvenimente.this.textPassword.getText();
			
			// Verificare operatie Login
			if(CaptareEvenimente.this.accounts.containsKey(user)) {								// Daca HashMap-ul accounts din cadrul clasei CaptareEvenimente contine cheia "user", se executa:
				String correctPassword = (String)CaptareEvenimente.this.accounts.get(user);		// Se creeaza o variabila correctPassword de tip String, careia i se atribuie valoarea variabilei user
				if(correctPassword.equals(password)) {											// Daca parola corecta este egala cu parola introdusa, atunci se afiseaza mesajul de succes
					CaptareEvenimente.this.textArea.append("Login successful!\n");
				}
				else {																			// Daca parola corecta nu este egala cu parola introdusa, atunci se afiseaza mesajul de eroare
					CaptareEvenimente.this.textArea.append("Invalid password!\n");
				}
			}
			else {																				// Daca HashMap-ul accounts din cadrul clasei CaptareEvenimente nu contine cheia "user", se afiseaza mesajul "User not found!"
				CaptareEvenimente.this.textArea.append("User not found!\n");
			}
			
		}
		
	}

}






