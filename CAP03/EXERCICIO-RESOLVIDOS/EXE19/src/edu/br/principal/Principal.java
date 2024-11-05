package edu.br.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*DECLARE a_degrau, a_usuario, qtd_degraus NUMÉRICO
LEIA a_degrau
LEIA a_usuario
qtd_degraus ← a_usuario / a_degrau
ESCREVA qtd_degraus*/
		
		Scanner sc = new Scanner(System.in);
	     double a_degrau, a_usuario, qtd_degraus;
	     System.out.print("Digite a altura do degrau:  ");
	     a_degrau = sc.nextDouble();
	     System.out.print("Digite a altura que voce deseja alcançar: ");
	     a_usuario = sc.nextDouble();
	     qtd_degraus = (int) (a_usuario / a_degrau);
	     if (a_usuario % a_degrau != 0);
	     qtd_degraus++;
	     System.out.println("O resultado é: " + qtd_degraus);
	}

}
