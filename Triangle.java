//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Triangle {

	// class variables go here
	private double sideA, sideB, sideC;
	private double perimeter;
	private double theArea;
	
	//Scanner keyboard = new Scanner(System.in);

	// constructor goes here
	public Triangle() {

	}

	// methods go here
	public void setVarsToZero() {
		sideA = 0.0;
		sideB = 0.0;
		sideC = 0.0;
		perimeter = 0.0;
		theArea = 0.0;

	} // end of setVarsToZero
	
	public void showVars() {
		//System.out.println("Side A: " + sideA + "; Side B: " + sideB + "; Side C: " + sideC + "; Perimeter: " + perimeter + "; Area: " + theArea);
		
		String msg = 
				"Side A, B, C = " + sideA + ", " + sideB + ", " + sideC
				+ "; perimeter: " + perimeter 
				+ "; area: " + theArea;
		JOptionPane.showMessageDialog(null, msg);
		
	} // end of showVars
	
	public void setSides() {
		//System.out.println("Enter the length of side A:");
		//sideA = keyboard.nextDouble();
		boolean b = true;
				while (b) {
					try {
						sideA = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of side A: "));
						b = false;
					}catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Please enter a valid response");
					}

				}
		
		//System.out.println("Enter the length of side B:");
		//sideB = keyboard.nextDouble();
		sideB = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of side B: "));
		
		//System.out.println("Enter the length of side C:");
		//sideC = keyboard.nextDouble();
		sideC = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of side C: "));

		
	} // end of setsSides

	public void calcPerimeter() {
		perimeter = sideA + sideB + sideC;
		
	} // end of calcPerimeter

	public void calcArea() {
		double p = 0.0;
		p = (sideA + sideB + sideC) / 2.0;
		
		theArea = Math.sqrt(p * (p-sideA) * (p-sideB) * (p-sideC));
	} // end of calcArea

	public void calcAngles() {
		double cosA = 0.0, cosB = 0.0, cosC = 0.0, Adeg = 0.0, Bdeg = 0.0, Cdeg = 0.0;
		cosA = (Math.pow(sideB, 2.0) + Math.pow(sideC, 2.0) - Math.pow(sideA, 2.0))/(2.0 * sideB * sideC);
		cosB = (Math.pow(sideC, 2.0) + Math.pow(sideA, 2.0) - Math.pow(sideB, 2.0))/(2.0 * sideC * sideA); 
		cosC = (Math.pow(sideA, 2.0) + Math.pow(sideB, 2.0) - Math.pow(sideC, 2.0))/(2.0 * sideA * sideB);
	
		Adeg = Math.toDegrees(Math.acos(cosA));
		Bdeg = Math.toDegrees(Math.acos(cosB));
		Cdeg = Math.toDegrees(Math.acos(cosC));
		
		//System.out.println("Angle of Angle A in degrees: " + Adeg);
		//System.out.println("Angle of Angle B in degrees: " + Bdeg);
		//System.out.println("Angle of Angle C in degrees: " + Cdeg);
		JOptionPane.showMessageDialog(null, "Angle A: " +Adeg + "; Angle B: " + Bdeg + "; Angle C: " + Cdeg);
		

	} //  end of calcAngles
} // end of class
