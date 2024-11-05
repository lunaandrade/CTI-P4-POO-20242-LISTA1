package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DECLARE n1, n2, n3, n4, soma NUMÉRICO
				//LEIA n1, n2, n3, n4
				//soma ← n1 + n2 + n3 + n4
				//ESCREVA soma
				Scanner sc = new Scanner(System.in);
				int n1, n2, n3, n4, soma;
				System.out.println("Digite sua primeira nota: ");
				n1 = sc.nextInt();
				System.out.println("Digite sua segunda nota: ");
				n2 = sc.nextInt();
				System.out.println("Digite sua terceira nota: ");
				n3 = sc.nextInt();
				System.out.println("Digite sua quarta nota: ");
				n4 = sc.nextInt();
				soma = n1 + n2 + n3 + n4;
				System.out.println("Sua soma final é " + soma);
			}

	}
