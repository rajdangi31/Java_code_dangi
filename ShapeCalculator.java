package D;

import java.util.Scanner;

public class ShapeCalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Choose a shape: ");
		System.out.println("1. Circle");
		System.out.println("2. Pyramid");
		System.out.print("Enter your choice (1 or 2): ");
		
		int choice = scnr.nextInt();
		if (choice == 1)
		{
			System.out.print("Enter the radius of the circle: ");
			double radius = scnr.nextDouble();
			calculateCircle(radius);
		}
		else if (choice == 2)
		{
			System.out.print("Enter the length of the pyramid base: ");
			double length = scnr.nextDouble();
			System.out.print("Enter the width of the pyramid base: ");
			double width = scnr.nextDouble();
			System.out.print("Enter the height of the pyramid: ");
			double height = scnr.nextDouble();
			calculatePyramid(length, width, height);
		}
		else
		{
			System.out.println("Invalid choice. Please choose 1 or 2");
		}
			
		}
	public static void calculateCircle(double radius)
	{
		double area = Math.PI * Math.pow(radius, 2);
		double circumference = 2 * Math.PI * radius;
		System.out.println("Circle Area: " + area);
		System.out.println("Circle Circumference: " + circumference);
	}
	public static void calculatePyramid(double length, double width, double height)
	{
		double baseArea = length * width;
		double volume = (length * width * height) / 3;
		System.out.println("Pyramid Base Area: " + baseArea);
		System.out.println("Pyramid Volume: " + volume);
	}

	

}
