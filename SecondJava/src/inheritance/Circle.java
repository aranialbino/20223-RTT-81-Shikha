package inheritance;

public class Circle extends Shape {
	private double diameter;

	public double getRadius() {
		return diameter / 2;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
		public double calculatedArea() {
			return 3.14159 * getDiameter()* getDiameter();
		}
	}

