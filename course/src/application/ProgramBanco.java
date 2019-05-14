package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class ProgramBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta cont;
		
		System.out.print("Enter account number: ");
		int nc = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there na initial deposit (y,n)? ");
		char resp = sc.next().charAt(0);
		if ( resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialValue = sc.nextDouble();
			cont = new Conta(nc, nome, initialValue);
		}
		else {
			cont = new Conta(nc, nome);
		}
		System.out.println();
		System.out.println("Account data");
		System.out.println(cont);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		cont.deposit(value);
		System.out.println("Updated account data: " + cont);
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		cont.withdraw(value);
		System.out.println("Update account data: " + cont);
		
		
		
		sc.close();
	}
}
