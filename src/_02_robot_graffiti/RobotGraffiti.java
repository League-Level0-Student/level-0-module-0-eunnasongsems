package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	public static void main(String[] args) {
	
 Robot E = new Robot("mini");
	
 E.setSpeed(100);
 
 E.penDown();
 
E.turn(180);

E.move(240);

E.turn(90);

E.move(-160);

E.turn(180);

E.move(-160);
	
E.turn(90);

E.move(-100);

E.turn(-90);

E.move(160);

E.turn(180);

E.move(160);
	
E.turn(90);

E.move(140);

E.turn(90);

E.move(160);
	
	}
}
