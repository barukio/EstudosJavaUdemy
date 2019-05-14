package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student alu = new Student();
		
		alu.name = sc.nextLine();
		alu.nota1 = sc.nextDouble();
		alu.nota2 = sc.nextDouble();
		alu.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", alu.notaFinal());
		
		if (alu.notaFinal() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", alu.pontosFaltando());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
