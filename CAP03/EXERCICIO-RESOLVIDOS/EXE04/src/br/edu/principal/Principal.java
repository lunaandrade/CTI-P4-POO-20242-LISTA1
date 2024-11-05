package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sal, novo;
		System.out.println("Digite seu salário: ");
		sal = sc.nextInt();
		novo = sal + (sal * 25/100);
		System.out.println("Seu novo salário é: " + novo);
	}
	}
