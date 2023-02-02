package Exercice1;

public class Circle {

	private double rayon;
	private double aire;
	private double radius;
	
	public Circle() {
		super();
		this.rayon = -1;
	}
	
	public Circle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	private double CalculeAire(double rayon) {
		return  3.14 * Math.pow(rayon, 2);
	}
	
	public double getArea() {
		return this.CalculeAire(this.rayon);
	}
	
	public static void main(String[] args) {		
		Circle circle1 = new Circle(2.0);
		Circle circle2 = new Circle(12);
		Circle circle3 = new Circle(24);
		
		System.out.println("le rayon du cirle n°1 est " + circle1.rayon + " et son aire est " + circle1.CalculeAire(circle1.rayon)  + "\n le rayon du cirle n°2 est " + circle2.rayon +  " et son aire est " + circle2.CalculeAire(circle2.rayon) + "\n le rayon du cirle n°3 est " + circle3.rayon + " et son aire est " + circle2.CalculeAire(circle2.rayon) );

	}

}
