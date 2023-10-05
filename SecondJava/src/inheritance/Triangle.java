package inheritance;

public abstract class Triangle extends Shape {
	private double Baseside;
	private double Sideb;
	private double Sidec;
	private double Height;
	public double getBaseside() {
		return Baseside;
	}
	public void setBaseside(double baseside) {
		this.Baseside = baseside;
	}
	public double getSideb() {
		return Sideb;
	}
	public void setSideb(double sideb) {
		this.Sideb = sideb;
	}
	public double getSidec() {
		return Sidec;
	}
	public void setSidec(double sidec) {
		this.Sidec = sidec;
	}
	public double getHeight() {
		return Height;
	}
	public void setHeight(double height) {
		this.Height = height;
	}


}
