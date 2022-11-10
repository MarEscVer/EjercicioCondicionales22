package unico;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final double PPALMERA = 1.40;
		final double PDONUT = 1.00;
		final double PPACEITE = 1.20;
		final double PPTORTILLA = 1.60;
		final double PZUMO = 1.50;
		final double PCAFE = 1.20;
		final double PERROR = 0.00;
		
		double importeComida;
		double importeBebida = 0;
		double importeTotal;
		String comida;
		String bebida;
		
		System.out.print("¿Qué desea comer? (palmera/donut/pitufo)");
		comida = teclado.nextLine();
		
		if (comida.equalsIgnoreCase("pitufo")) {
			System.out.print("¿Con qué va el pitufo? (aceite/totilla)");
			comida = teclado.nextLine();
		}
		
		System.out.print("¿Qué desea beber? (zumo/café)");
		bebida = teclado.nextLine();
		
		switch(comida) {
			case "palmera" : importeComida = PPALMERA; break;
			case "donut" : importeComida = PDONUT; break;
			case "aceite" : importeComida = PPACEITE; break;
			case "tortilla" : importeComida = PPTORTILLA; break;
			default : importeComida = PERROR;
		}
		
		switch(bebida) {
		case "zumo" : importeComida = PZUMO; break;
		case "café" : importeComida = PCAFE; break;
		default : importeComida = PERROR;
	}	
		
		importeTotal = importeComida + importeBebida;
		
		System.out.println("Total desayuno: " + importeTotal);
	}
}
	
