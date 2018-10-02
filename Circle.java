import javax.swing.JOptionPane;

public class Circle {
	
	// class variables
	private double radius, circumference, area;
	
	// constructor
	public Circle() {
		
	}
	
	// methods
	
	public void setVarsToZero() {
		radius = 0.0;
		circumference = 0.0;
		area = 0.0;
	}
	
	public void setRadius() {
		radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius of the circle: "));
	}
	public void calcCircumference() {
		circumference = (radius * 2) * Math.PI;

	}
	public void calcArea() {
		area = Math.pow(radius,2) * Math.PI;
	}
	public void showVars() {
		JOptionPane.showMessageDialog(null, "Circumference: " + circumference + "; Area: " + area);
	}

	

}//end of class
