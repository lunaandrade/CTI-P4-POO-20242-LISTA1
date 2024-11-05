package edu.br.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*DECLARE salario, cheque1, cheque2, cpmf1, cpmf2, saldo NUMÉRICO
LEIA salario
LEIA cheque1
LEIA cheque2
cpmf1 ← cheque1 * 0.38 / 100
cpmf2 ← cheque2 * 0.38 / 100
saldo ← salario − cheque1 − cheque2 − cpmf1 − cpmf2
ESCREVA saldo*/
		
		Scanner sc = new Scanner(System.in);
	     double sal, cheque1, cheque2, cpmf1, cpmf2, saldo;
	     System.out.print("Digite o valor do seu salario ");
	     sal = sc.nextDouble();
	     System.out.print("Digite o valor do seu primeiro cheque");
	     cheque1= sc.nextDouble();
	     System.out.print("Digite o valor do seu segundo cheque: ");
	     cheque2 = sc.nextDouble();
	     cpmf1 = cheque1 * 0.38/100;
	     cpmf2 = cheque2 * 0.38/100;
	     saldo = sal - cheque1 - cheque2 - cpmf1 - cpmf1;
	     System.out.println("o valor liquido do seu salario será: " + saldo);
	}

}
