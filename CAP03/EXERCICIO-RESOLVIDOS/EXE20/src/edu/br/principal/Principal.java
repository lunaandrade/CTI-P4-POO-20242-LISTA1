package edu.br.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		/*DECLARE ang, alt, escada, radiano NUMÉRICO
		LEIA ang
		LEIA alt
		radiano ← ang * 3.14 / 180
		escada ← alt / seno(radiano)
		ESCREVA escada*/
		
		Scanner sc = new Scanner(System.in);
	    double ang, alt, escada, radiano;
	    System.out.print("Digite o valor do angulo:  ");
	    ang = sc.nextDouble();
	    System.out.print("Digite a altura da parede:  ");
	    alt = sc.nextDouble();
	    radiano = ang * 3.14 / 180;
	    escada = alt / Math.sin(radiano);
	    System.out.println("O resultado é: " + escada);
	}
}