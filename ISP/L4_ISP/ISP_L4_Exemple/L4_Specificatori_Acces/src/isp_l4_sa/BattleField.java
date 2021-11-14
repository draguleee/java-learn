/*
 * Clasa BattleField
 */

package isp_l4_sa;

// Clasa publica Engine
class Engine {
	
	// Metoda checkDirection() - parametrii: x (int)
	// Verifica directia robotului
	public void checkDirection(int x) {
		if(x < 0) {
			System.out.println("Moving to the left.");
		}
		else if(x > 0) {
			System.out.println("Moving to the right.");
		}
	}
	
	// Metoda execute() - parametrii: s (int)
	// Executa un numar de pasi pentru robot
	public void execute(int s) {
		System.out.println("Moving " + Math.abs(s) + " steps.");
	}
	
	// Metoda start() - fara parametrii
	// Porneste motorul robotului
	public void start() {
		System.out.println("Start engine.");
	}
	
	// Metoda stop() - fara parametrii
	// Opreste motorul robotului
	public void stop() {
		System.out.println("Stop engine.");
	}
	
	// Metoda step() - fara parametrii
	public void step(int x) {
		start();
		checkDirection(x);
		execute(x);
		stop();
	}
	
}


// Clasa publica Robot
class Robot {
	
	// Atributele / variabilele de instanta ale clasei Robot
	Engine robotEngine;
	
	// Constructor - fara parametrii
	public Robot() {
		robotEngine = new Engine();
	}
	
	// Metoda moveRobot() - parametrii: x (int)
	// Efectueaza miscarea robotului
	public void moveRobot(int x) {
		robotEngine.step(x);
	}
	
}


// Clasa publica BattleField, care modeleaza utilizarea specificatorilor de acces
public class BattleField {
	
	// Atributele / variabilele de instanta ale clasei BattleField
	Robot r1;
	Robot r2;
	
	// Constructor - fara parametrii
	public BattleField() {
		r1 = new Robot();
		r2 = new Robot();
	}
	
	// Metoda play() - fara parametrii
	// Metoda care modeleaza miscarea robotilor
	public void play() {
		r1.moveRobot(20);		// Deplasare la dreapta
		r2.moveRobot(-50);		// Deplasare la stanga
	}
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		BattleField game = new BattleField();
		game.play();
	}

}
