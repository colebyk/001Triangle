import javax.swing.JOptionPane;

public class Rectangle {
	
	//class variables
	private double height, length, perimeter, area, diagonal;
	
	//constructor
	public Rectangle() {
		
	}
	
	//methods
	
	public void setVarsToZero() {
		height = 0;
		length = 0;
		perimeter = 0;
		area = 0;
	}
	
	public void setSides() {
		height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the rectangle:"));
		length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the rectangle:"));

	}
	
	public void calcPerim() {
		perimeter = (height * 2) + (length * 2);
	}
	
	public void calcArea() {
		area = height * length;
	}
	
	public void calcDiagonal() {
		diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(height, 2));
	}
	public void showVars() {
		JOptionPane.showMessageDialog(null, "Perimeter: " + perimeter + "; Area: " + area + "; Diagonal: " + diagonal);
	}

}
