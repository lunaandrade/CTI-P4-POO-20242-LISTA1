package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double alt, tam, dis;
		System.out.println("Digite a altura que deseja pendurar o quadro");
		alt = sc.nextDouble();
		System.out.println("Digite o tamanho da escada");
		tam = sc.nextDouble();
		if (tam > alt) {
			dis = (tam * tam)-(alt * alt);
			System.out.println("A distância que a escada deve estar da parede será de " + Math.sqrt(dis) + " metros");
		}
		else {
			System.out.println("O tamanho da escada não pode ser menor ou igual à altura do quadro");
		}
	}
}
