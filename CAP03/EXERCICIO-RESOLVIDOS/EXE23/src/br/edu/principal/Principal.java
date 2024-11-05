package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double fra, in1, in2, num, num2, arr;
		System.out.print("Digite um número real: ");
		num = sc.nextDouble();
		in1 = Math.round(num);
		if (in1 > num) {
			num2 = num - 0.5;
			in2 = Math.round(num2);
		}
		else {
			in2 = in1;
		}
		System.out.println("O resultado inteiro é: " + in2);
		fra = num - in2;
		System.out.println("O resultado fracionado é: " + fra);
		arr = Math.round(num);
		System.out.println("O resultado arredondado é: " + arr);

	}

}
