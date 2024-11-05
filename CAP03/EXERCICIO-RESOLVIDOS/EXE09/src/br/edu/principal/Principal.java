package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*DECLARE base, altura, area NUMÉRICO
LEIA base, altura
area ← (base * altura)/2
ESCREVA area*/
		
		Scanner sc = new Scanner(System.in);
	     int base, altura, area;
	     System.out.print("Digite a base do triangulo: ");
	     base = sc.nextInt();
	     System.out.print("Digite a area do seu triangulo: ");
	     altura = sc.nextInt();
	     area = (base * altura) / 2;
	     System.out.println("A area do triangulo: " + area);

	}

}
