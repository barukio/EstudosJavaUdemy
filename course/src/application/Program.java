package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle retan = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		retan.height = sc.nextDouble();
		retan.width = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", retan.area());
		System.out.printf("PERIMETER = %.2f%n", retan.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", retan.diagonal());
		
		sc.close();
	}

}
