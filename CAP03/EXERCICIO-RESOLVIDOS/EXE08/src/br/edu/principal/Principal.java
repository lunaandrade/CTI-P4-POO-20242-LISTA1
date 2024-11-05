package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*DECLARE dep, taxa, rend, total NUMÉRICO
		LEIA dep, taxa
		rend ← dep * taxa/100
		total ← dep + rend
		ESCREVA rend
		ESCREVA total
		FIM_ALGORITMO.*/
		
		Scanner sc = new Scanner(System.in);
	     double dep, taxa, rend, total;
	     System.out.print("Digite o valor do seu deposito: ");
	     dep = sc.nextDouble();
	     System.out.print("Digite o valor da taxa: ");
	     taxa = sc.nextDouble();
	     rend = dep * taxa/100;
	     total = rend + dep;
	 	System.out.println("O total é: " + total);
	}

}
