/*
 * Exemplul 4
 * 
 * Programul exemplifica modul in care meniurile pot fi integrate in cadrul unei aplicatii.
 */

package isp_l9_ui1;

import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import javax.swing.*;


// Clasa publica Menu, care extinde / mosteneste clasa JFrame
public class Menu extends JFrame{
	
	// Componentele pentru GUI (Graphic User Interface)
	JMenuBar menuBar;
	JMenu file;
	JMenuItem save;
	JMenuItem open;
	JMenuItem exit;
	JTextArea textArea;
	
	// Constructor - fara parametrii
	public Menu() {
		
		// Initializarea componentelor meniului
		menuBar = new JMenuBar();
		file = new JMenu("File");
		save = new JMenuItem("Save");
		open = new JMenuItem("Open");
		exit = new JMenuItem("Exit");
		textArea = new JTextArea();
		
		// Adaugarea de ActionListener-e pentru componentele meniului
		save.addActionListener(new AL());
		open.addActionListener(new AL());
		exit.addActionListener(new AL());
		
		// Adaugarea fisierului in bara de meniu
		menuBar.add(file);
		
		// Adaugarea optiunilor in fisier
		file.add(save);
		file.add(open);
		file.add(exit);
		
		// Adaugarea casutei de text
		add(textArea);
		
		// Setarea barei de meniu
		setJMenuBar(menuBar);
		
		// Setare fereastra
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,400);		// Seteaza dimensiunea ferestrei
		setVisible(true);		// Seteaza vizibilitatea ferestrei
		
	}
	
	
	// Metoda save() - parametrii: file (String)
	// Salveaza textul intr-un fisier
	public void save(String file) {
		
		// Crearea unui PrintWriter (out) pentru preluarea textului din textArea si scrierea acestuia in fisier
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(new File(file)));	// Crearea unui PrintWriter pentru citirea textului din fisier
			pw.println(textArea.getText());										// Afisarea textului in TextArea
			pw.close();															// Inchiderea fluxului de iesire
		}
		
		// Prinderea exceptiei generate si afisarea mesajului
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Error: " + e.getMessage());
		}
	}
	
	
	// Metoda open() - parametrii: file (String)
	// Deschide fisierul
	public void open(String file) {
		
		// Citirea textului din fisier
		try {
			textArea.setText("");														// Setarea TextArea ca fiind gol (fara text)
			BufferedReader br = new BufferedReader(new FileReader(new File(file)));		// Crearea unui BufferedReader pentru scrierea textului in fisier
			String line = br.readLine(); 												// Variabila creata pentru scrierea textului in fisier
			while(line != null) {														// Daca variabila line e diferita de 0, atunci se preia textul si se scrie in textArea
				textArea.append(line +"\n");
				line = br.readLine();
			}
		}
		
		// Prinderea exceptiei generate si afisarea mesajului
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Error: " + e.getMessage());
		}
	}
	
	
	// Clasa AL, care implementeaza ActionListener
	class AL implements ActionListener {
		
		// Metoda actionPerformed() - parametrii: ae (ActionEvent)
		// Trebuie obligatoriu implementata!
		public void actionPerformed(ActionEvent ae) {
			String text = ((JMenuItem)ae.getSource()).getLabel();
			if(text.equals("Save")) {																// Daca se alege optiunea Save, se va deschide o fereastra de dialog pentru salvarea textului
				FileDialog fd = new FileDialog(Menu.this, "Incarca fisier: ", FileDialog.SAVE);
				fd.setVisible(true);
				save(fd.getDirectory()+fd.getFile());
			}
			if(text.equals("Open")) {																// Daca se alege optiunea Save, se va deschide o fereastra de dialog pentru deschiderea textului salvat
				FileDialog fd = new FileDialog(Menu.this, "Incarca fisier: ", FileDialog.LOAD);
				fd.setVisible(true);
				open(fd.getDirectory()+fd.getFile());
			}
			if(text.equals("Exit")) {																// Daca se alege optiunea Exit, se va iesi din aplicatie
			}
		}
	}
	
	
	// Metoda main()
	public static void main(String[] args) {
		
		// Crearea unei ferestre Menu
		Menu menu = new Menu();
	}

}
