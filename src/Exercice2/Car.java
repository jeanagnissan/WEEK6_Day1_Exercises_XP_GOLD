package Exercice2;
import Exercice1.Circle;

public class Car {

	private String make = "";
	private String model = "";
	private int year = 0;
	private String color = "";
	private double price = 0;

	public Car() {
		super();
	}

	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.setColor(color);
		this.setPrice(price);
	}

	public Car(String make, String model, int year, String color, double price) {
		super();
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		this.color = color;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void displayCarInfo() {
		System.out.println("Make: " + this.make + " , " + " Model: " + this.model + " , " + "Year: " + this.year + " , "
				+ "Color: " + this.color + " , " + "Price: " + this.price);
	}

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("yamaha car", "Yamaha cgr23", 7);
		Car car3 = new Car("Tata car", "tata ci99", 4, "bleu", 2333.55);

		car1.displayCarInfo();
		car2.displayCarInfo();

		car3.displayCarInfo();

		
	}

}
