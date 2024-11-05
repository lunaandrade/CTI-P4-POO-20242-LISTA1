package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*DECLARE sal, salreceber, imp NUMÉRICO  
LEIA sal 
imp ← sal * 10/100  
salreceber ← sal + 50 − imp  
ESCREVA salreceber 
*/
		
		Scanner sc = new Scanner(System.in);
	     double sal, salreceber, imp;
	     System.out.print("Digite o seu salario: ");
	     sal = sc.nextDouble();
	     imp = sal * 10/100;
	     salreceber = sal + 50 - imp;
	     System.out.println("O salario final é: " + salreceber);
	}

}
