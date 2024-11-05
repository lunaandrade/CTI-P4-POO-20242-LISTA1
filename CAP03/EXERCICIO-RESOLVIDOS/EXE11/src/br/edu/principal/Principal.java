package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double num, quadrado, cubo, raiz_qua, raiz_cub;
		
		num = 10;
		quadrado = num * num;
		cubo = num * num * num;
		raiz_qua = Math.sqrt(num);
		raiz_cub = Math.cbrt(num);
		
		System.out.println("O número é : " + num);
		System.out.println("O número ao quadrado é : " + quadrado);
		System.out.println("O número ao cubo é: " + cubo);
		System.out.println("A raiz quadrada do número é: " + raiz_qua);
		System.out.println("A raiz cúbica do número é: " + raiz_cub);
	}

}
