package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Exe2Ent;

public class Exe2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Exe2Ent> list = new ArrayList<>(); 
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Exe2Ent(id, name, salary));
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Exe2Ent mostra = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (mostra == null) {
			System.out.println("This id not exist!");
		}
		else {
			System.out.print("Enter percentage: ");
			double percentage = sc.nextDouble();
			mostra.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Exe2Ent lis: list) {
			System.out.println(lis);
		}
		
		
		sc.close();
	}

}
