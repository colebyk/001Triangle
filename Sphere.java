import javax.swing.JOptionPane;

public class Sphere {
	
	//class variables
	private double radius, volume, surfaceArea;
	
	//constructor
	public Sphere() {
		
	}
	
	//methods
	
	public void SetVarsToZero() {
		radius = 0;
		volume = 0;
		surfaceArea = 0;
		
	}
	
	public void setRadius() {
		radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius of the sphere: "));

	}
	
	public void calcVolume() {
		volume = 4 * Math.PI * Math.pow(radius, 3) / 3;
	}
	
	public void calcSurfaceArea() {
		surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
	}
	public void showVars() {
		JOptionPane.showMessageDialog(null, "Volume: " + volume + "; Surface Area: " + surfaceArea);

	}

}
