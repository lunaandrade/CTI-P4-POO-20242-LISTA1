package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ALGORITMO
				//DECLARE nota1, nota2, nota3, peso1, peso2, peso3, media NUMÉRICO
				//LEIA nota1, nota2, nota3, peso1, peso2, peso3
				//media← (nota1*peso1+ nota2*peso2+ nota3*peso3)/(peso1+ peso2+ peso3)
				//ESCREVA media
				//FIM_ALGORITMO.
				
				Scanner sc = new Scanner(System.in);
				int n1, n2, n3, p1, p2, p3, media;
				System.out.println("Digite sua primeira nota: ");
				n1 = sc.nextInt();
				System.out.println("Digite sua segunda nota: ");
				n2 = sc.nextInt();
				System.out.println("Digite sua terceira nota: ");
				n3 = sc.nextInt();
				System.out.println("Digite seu primeiro peso: ");
				p1 = sc.nextInt();
				System.out.println("Digite seu segundo peso: ");
				p2 = sc.nextInt();
				System.out.println("Digite seu terceiro peso: ");
				p3 = sc.nextInt();
				media = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);
				System.out.println("A media final é:  " + media);

			}


	}