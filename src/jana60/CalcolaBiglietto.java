package jana60;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		double km;
		int eta;
		double prezzoPerKm = 0.21;
		double percentualeScontoMinorenni = 0.20;
		double percentualeScontoOverSessantacinque = 0.40;
		Scanner scan = new Scanner(System.in);
		System.out.print("Inserisci Km da percorrere");
		km = scan.nextDouble();
		System.out.print("Inserisci eta");
		eta = scan.nextInt();
		double prezzoTotale = km * prezzoPerKm;
		// Prezzo per i minorenni
		

		// Prezzo età maggiore di 65
		
		double prezzoFinale;
		if (eta < 18) {
			double scontoMinorenni = prezzoTotale * percentualeScontoMinorenni;
			prezzoFinale = prezzoTotale - scontoMinorenni;

		} else if (eta >= 18 || eta <= 65) {
			prezzoFinale = prezzoTotale;

		} else {
			double scontoOverSessantacinque = prezzoTotale * percentualeScontoOverSessantacinque;
			prezzoFinale = prezzoTotale - scontoOverSessantacinque;

		}
		
		System.out.print(prezzoFinale);
		scan.close();
	}

}
