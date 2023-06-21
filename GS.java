package prova;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GS {
	/* 	Kauã Granata Monteiro				RM:99472
	 * 	Matheus Roberto Santos de Souza		RM:99657
	 * 	Rafael Jun Miura					RM:98845
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);
		DecimalFormat fMoeda = new DecimalFormat("#,##0.00 R$");
		DecimalFormat porcentagem = new DecimalFormat("#,##0.00");
		
		int numFamilias = 0, nomeFat = 0, nomeLucro = 0;
		double fatMax = 0, lucroMin = 0, investTotal = 0, lucroTotal = 0, fatTotal = 0;
		
		System.out.println("Digite o número de familias que quer adicionar: ");
		numFamilias = e.nextInt();

		String[] nomeFamilias = new String[numFamilias];
		double[] investMes = new double[numFamilias];
		double[] fatMes = new double[numFamilias];
		double[] lucroMes = new double[numFamilias];

		for (int i = 0; i < numFamilias; i++) {
			System.out.println("Digite o nome da família " + (i + 1) + ":");
			nomeFamilias[i] = e.next();
			System.out.println("Informe o investimento mensal recebido em reais:");
			investMes[i] = e.nextDouble();

			System.out.println("Informe o faturamento mensal:");
			fatMes[i] = e.nextDouble();

			lucroMes[i] = fatMes[i] - investMes[i];

			investTotal += investMes[i];
			lucroTotal += lucroMes[i];
			fatTotal += fatMes[i];
		}

		
		for (int i = 0; i < numFamilias; i++) {
			if (fatMes[i] > fatMax) {
				fatMax = fatMes[i];
				nomeFat = i;
			}

			if (lucroMin == 0) {
				lucroMin = lucroMes[i];
			} else {
				if (lucroMes[i] < lucroMin) {
					lucroMin = lucroMes[i];
					nomeLucro = i;
				}
			}

		}
		
		
		
		// a) lista das familias
		for (int i = 0; i < numFamilias; i++) {
			System.out.println("Família " + nomeFamilias[i]);
			System.out.println("Investimento mensal: " +  fMoeda.format(investMes[i]));
			System.out.println("Faturamento mensal: " +  fMoeda.format(fatMes[i]));
			System.out.println("Lucro mensal: " +  fMoeda.format(lucroMes[i]));
			System.out.println("");

		}

		// b) familia com o maior faturamento mensal
		System.out.println("Família " + nomeFamilias[nomeFat] + " tem o maior faturamento mensal, com: " + fMoeda.format(fatMax));
		// c) familia com o menor lucro sobre vendas
		System.out.println("Família " + nomeFamilias[nomeLucro] + " tem o menor lucro sobre vendas, com: " + fMoeda.format(lucroMin));
		// d) 
		System.out.println("Soma dos investimentos de todas as famílias " + fMoeda.format(investTotal));
		// e)
		System.out.println("Percentual de lucro sobre as vendas de todas as famílias: " + porcentagem.format((lucroTotal / fatTotal) * 100) + "%");
		
		

	}

}
