import javax.swing.JOptionPane;

public class Runner {
	
	/*
	 * 
	 * Circle: inpur r, calculate circ, area
	 * Rectangle: input side A, B, calc perim, area, diagonal
	 * Triangle: Input sides A, B, C, calc perim, area, all angles
	 * Cuboid: Input sides A, B, C, calc volume, total surface area
	 * Sphere: Input radius, calc volume, surface area
	 */

	public static void main(String[] args) {
		
		
		JOptionPane.showMessageDialog(null, "Hello, Welcome to Coleby's P.3A 9/14/18 Geometry Java Project!");
		
		
		// Instantiate each class
		
		Triangle myTriangle = new Triangle();
		Circle myCircle = new Circle();
		Rectangle myRectangle = new Rectangle();
		Cuboid myCuboid = new Cuboid();
		Sphere mySphere = new Sphere();
		
		int goAgain = 1;
		
		while (goAgain == 1) {
		String msg = "Please enter your selection: Triangle, Circle, Rectangle, Cuboid, Sphere";
		String answer = JOptionPane.showInputDialog(msg);
		// when comparing strings, == is unreliable - do not use ==
		// instead, use String class methods .equals
		if ((answer.equals("Triangle")) || (answer.equals("triangle"))) {
			JOptionPane.showMessageDialog(null, "We are in Triangle");
			myTriangle.setVarsToZero();
			myTriangle.setSides();
			myTriangle.calcPerimeter();
			myTriangle.calcArea();
			myTriangle.showVars();
			myTriangle.calcAngles();
		}
		else if ((answer.equals("Circle")) || (answer.equals("circle"))) {
			JOptionPane.showMessageDialog(null, "We are in Circle");
			myCircle.setVarsToZero();
			myCircle.setRadius();
			myCircle.calcCircumference();
			myCircle.calcArea();
			myCircle.showVars();
		}
		else if ((answer.equals("Rectangle")) || (answer.equals("rectangle"))) {
			JOptionPane.showMessageDialog(null, "We are in Rectangle");
			myRectangle.setVarsToZero();
			myRectangle.setSides();
			myRectangle.calcPerim();
			myRectangle.calcArea();
			myRectangle.calcDiagonal();
			myRectangle.showVars();
		}
		else if ((answer.equals("Cuboid")) || (answer.equals("cuboid"))) {
			JOptionPane.showMessageDialog(null, "We are in Cuboid");
			myCuboid.setVarsToZero();
			myCuboid.setSides();
			myCuboid.calcSurfaceArea();
			myCuboid.calcVolume();
			myCuboid.showVars();

		}
		else if ((answer.equals("Sphere")) || (answer.equals("sphere"))) {
			JOptionPane.showMessageDialog(null, "We are in Sphere");
			mySphere.SetVarsToZero();
			mySphere.setRadius();
			mySphere.calcSurfaceArea();
			mySphere.calcVolume();
			mySphere.showVars();
		}
		else {
			JOptionPane.showMessageDialog(null, "Yikes! I know not what you ask");
			msg = "Would you like to go again (Y/N)";
			answer = JOptionPane.showInputDialog(msg);

			if (answer.equals("Y") || answer.equals("y") || answer.equals("Yes") || answer.equals("yes")) {
				goAgain = 1;
			}
			else {
				goAgain = 0;
				JOptionPane.showMessageDialog(null, "Thank you! Come Again!");
			}
		

		}
		


		

		}// end of while loop
	} // end of runner

} // end of main
