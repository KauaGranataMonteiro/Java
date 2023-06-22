package prova;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Vendaspc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat fMoeda = new DecimalFormat("R$ #,##0.00");
		Scanner e = new Scanner(System.in);
		int tipo = 3, contPc = -1, parcela = 0;
		String nome, modelo;
		char CP = 0;
		double precoTotal = 0, precoi3 = 0, precoi5 = 0, precoi7 = 0;

		System.out.println("Infome seu nome: ");
		nome = e.next();

		while (tipo != 0) {
			contPc++;
			System.out.println("Digite o tipo do computador:");
			tipo = e.nextInt();

			// desktop
			if (tipo == 1) {
				System.out.println("digite modelo: ");
				modelo = e.next().toUpperCase();
				// valida��o~
				// while(!modelo.equals("i3") && !modelo.equals("i5") && !modelo.equals("i7")){
				while (!modelo.equalsIgnoreCase("i3") && !modelo.equalsIgnoreCase("i5")
						&& !modelo.equalsIgnoreCase("i7")) {
					System.out.println("Digite corretamente: ");
					modelo = e.next().toUpperCase();
				}

				switch (modelo) {
				case "I3":
					precoi3 = 1801;

					precoTotal += precoi3;
					break;
				case "I5":
					precoi5 = 2479;

					precoTotal += precoi5;
					break;
				case "I7":
					precoi7 = 3150;

					precoTotal += precoi7;
					break;
				}

				// Notebook
			} else if (tipo == 2) {
				System.out.println("digite modelo ");
				modelo = e.next().toUpperCase();
				// valida��o
				while (!modelo.equalsIgnoreCase("I3") && !modelo.equals("I5") && !modelo.equals("I7")) {
					System.out.println("Digite corretamente: ");
					modelo = e.next().toUpperCase();
				}

				switch (modelo) {
				case "I3":
					precoi3 = 1899;
					precoTotal += precoi3;
					break;
				case "I5":
					precoi5 = 2799;
					precoTotal += precoi5;
					break;
				case "I7":
					precoi7 = 3199;
					precoTotal += precoi7;
					break;
				}

			}

		}

		System.out.println("Quantidade total: " + contPc);
		System.out.println(precoTotal);

		System.out.println("Forma de pagamento: ");
		CP = e.next().toUpperCase().charAt(0);
		// valida��o
		while (CP != ('P') && CP != ('V')) {
			System.out.println("Digite corretamente P/V");
			CP = e.next().toUpperCase().charAt(0);
		}

		if (CP == ('V') && contPc >= 2) {
			precoTotal = precoTotal * 0.8;

		} else if (CP == ('V') && contPc == 1) {
			precoTotal = precoTotal * 0.9;
		}

		// Saida
		if (CP == ('P')) {
			System.out.println("Digite a quantidade de parcelas: ");
			parcela = e.nextInt();

			precoTotal = (precoTotal * 0.10) + precoTotal;
			System.out.println("Forma de pegamento escolhida à prazo. Número de parcelas: " + parcela
					+ " vezes. Valor final: " + fMoeda.format(precoTotal));

		} else {
			System.out.println("Forma de pegamento escolhida à vista. Valor final: " + fMoeda.format(precoTotal));
		}

	}
}
