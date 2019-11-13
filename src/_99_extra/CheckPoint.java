package _99_extra;
import org.jointheleague.graphical.robot.Robot;

import javax.swing.JOptionPane;

public class CheckPoint {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("What's your favorite color?");	
	JOptionPane.showMessageDialog(null, input+ " is my favorite color too!");
		
 Robot E =  new Robot("mini");
E.setSpeed(25);
	E.penDown();
	
for (int i = 0; i < 3; i++) {
	

		
	
	E.turn(120);
	E.move(120);
	
}
}
}
