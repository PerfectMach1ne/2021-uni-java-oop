package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String waluta;
		byte control;

		System.out.println("Program \"Przelicznik Walut\"");

		System.out.println("Podaj warto�� waluty:");
		double wartosc = sc.nextDouble();
		do {
			System.out.println("Podaj walut� (PLN/USD/EUR):");
			waluta = sc.next();
			if ( !(waluta.equals("USD") || waluta.equals("EUR") || waluta.equals("PLN")) ) System.out.println("Wprowadzono nieprawid�ow� walut�!");
		} while ( !(waluta.equals("USD") || waluta.equals("EUR") || waluta.equals("PLN")) );

		Waluty wa = new Waluty(wartosc);
		
		do {
			System.out.println("===========================================");
			System.out.println("Wybierz opcj�:");
			System.out.println("0\tWyj�cie z programu");
			if (waluta.equals("PLN")) {
				System.out.println("1\tPLN=>EUR");
				System.out.println("2\tPLN=>USD");
				control = 0;
			} else if (waluta.equals("EUR")) {
				System.out.println("1\tEUR=>PLN");
				System.out.println("2\tEUR=>USD");
				control = 1;
			} else {
				System.out.println("1\tUSD=>EUR");
				System.out.println("2\tUSD=>PLN");
				control = 2;
			}
		} while (wa.Przelicz(control));

		sc.close();
	}

}
