import javax.swing.JOptionPane;

public class Cuboid {
	
	//class variables
	private double length, width, height, volume, surfaceArea;
	
	//constructor
	public Cuboid() {
		
	}
	
	//methods
	
	public void setVarsToZero() {
		length = 0;
		width = 0;
		height = 0;
		volume = 0;
		surfaceArea = 0;
		
	}
	public void setSides() {
		length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the cuboid: "));
		width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the cuboid: "));
		height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the cuboid: "));
		
	}
	public void calcVolume() {
		volume = length * width * height;
		
	}
	public void calcSurfaceArea() {
		surfaceArea = 2 * width * length + 2 * length * height + 2 * height * width;
	}
	public void showVars() {
		JOptionPane.showMessageDialog(null, "Volume: " + volume + "; Surface Area: " + surfaceArea);
		
	}

}
