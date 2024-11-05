package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double custo, conv, qtd, qtd2, arr;
		System.out.print("Digite o custo do espetáculo: ");
		custo = sc.nextDouble();
		System.out.print("Digite o preço do ingresso: ");
		conv = sc.nextDouble();
		qtd = custo / conv;
		arr = Math.round(qtd);
		
		if (arr < qtd) {
			qtd = qtd + 1;
			qtd2 = Math.round(qtd);
		}
		else {
			qtd2 = arr;
		}
		
		System.out.print("A quantidade mínima de ingressos que deverão ser vendidos para suprir o custo do espetáculo é de " + qtd2 + " ingressos");

	}

}
