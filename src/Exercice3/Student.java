package Exercice3;

import Exercice2.Car;

public class Student {

	private String name = "";
	private int age = 0;
	private String course = "";
	private char grade = '@';
	
	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.setName(name);
		this.setGrade(grade);
	}

	public Student(String name, int age, String course, char grade) {
		super();
		this.name = name;
		this.age = age;
		this.course = course;
		this.grade = grade;
	}
	
	private void displayStudentInfo() {
		System.out.println("Name: " + this.name + " , " + " Age: " + this.age + " , " + "Cours: " + this.course + " , "
				+ "Grade: " + this.grade );
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student("Paul", 33);
		Student student3 = new Student("Joseph", 23, "Sociologie", 'S');

		student1.displayStudentInfo();
		student2.displayStudentInfo();
		student3.displayStudentInfo();

	}

}
