package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double hora, hora2, h, h2, m, conv;
		System.out.print("Digite sua hora: ");
		hora = sc.nextDouble();
		
		h = Math.round(hora);
		
		if (h > hora) {
			hora2 = hora - 0.50;
			h2 = Math.round(hora2);
		}
		else {
			h2 = h;
		}
		
		m = hora - h2;
		conv = (h2 * 60) + (m * 100);
		
		if (m > 0.59) {
			System.out.println("Você não inseriu uma hora válida");
		}
		else {
			System.out.println("Sua hora foi: " + h2);
			System.out.println("Seus minutos foram: " + m);
			System.out.println("O resultado da conversão de horas para minutos foi: " + conv);
		
		}
		
	}

}
