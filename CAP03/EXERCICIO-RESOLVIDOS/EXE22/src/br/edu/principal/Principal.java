package br.edu.principal;
import java.util.Scanner;
public class Principal {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			double qw, sal, valqw, valpg, disc;
			System.out.print("Digite seu salário: ");
			sal = sc.nextDouble();
			System.out.print("Digite a quantidade de quilowatts: ");
			qw = sc.nextDouble();
			valqw = sal / 5;
			System.out.println("O valor de cada quilowatt é de: " + valqw);
			valpg = valqw * qw;
			System.out.println("O valor a ser pago é de: " + valpg);
			disc = valpg - (valpg * 0.15);
			System.out.println("O valor com o desconto de 15% é de: " + disc);
			
		}

	}

