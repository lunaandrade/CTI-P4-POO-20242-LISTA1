package edu.br.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*DECLARE peso_saco, racao_gato1, racao_gato2, total_final NUMÉRICO
LEIA peso_saco
LEIA racao_gato1
LEIA racao_gato2
racao_gato1 ← racao_gato1 / 1000
racao_gato2 ← racao_gato2 / 1000
total_final ← peso_saco − 5 * (racao_gato1 + racao_gato2)
ESCREVA total_final
FIM_ALGORITMO.*/
		
		Scanner sc = new Scanner(System.in);
	     double peso_saco, racao_gato1, racao_gato2, cpmf1, total;
	     System.out.print("Digite a quantidade do saco de raçao ");
	     peso_saco = sc.nextDouble();
	     System.out.print("Digite o valor de ração para o seu primeiro gato: ");
	     racao_gato1 = sc.nextDouble();
	     System.out.print("Digite o valor de ração para o seu segundo gato:  ");
	     racao_gato2 = sc.nextDouble();
	     racao_gato1 = racao_gato1 / 1000;
	     racao_gato2 = racao_gato2 / 1000;
	     total = peso_saco - 5 * (racao_gato1 + racao_gato2);
	     System.out.println("A quantidade que resta de racão é: " + total);


	}

}
