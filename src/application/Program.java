package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int num1;
		double num2;
		char x;

		System.out.print("Digite um nome: ");
		nome = sc.next();
		System.out.print("Digite um numero: ");
		num1 = sc.nextInt();
		System.out.print("Digite um numero: ");
		num2 = sc.nextDouble();
		System.out.print("Digite uma letra: ");
		x = sc.next().charAt(0);
		
		System.out.println("Voce digitou: " + nome);
		System.out.println("Voce digitou: " + num1);
		System.out.println("Voce digitou: " + num2);
		System.out.println("Voce digitou: " + x);

		
 
		
		
		
		
		sc.close();
	}

}
