package br.edu.principal;

public class Principal {

	public static void main(String[] args) 
	{
		double num, p_pole, p_jardas, p_milhas;
		
		num = 5;
		
		p_pole = num * 12;
		p_jardas = num / 3;
		p_milhas = num / 5280;
		
		System.out.println("O número em pés é: " + num);
		System.out.println("O número em polegadas é: " + p_pole);
		System.out.println("O número em jardas é: " + p_jardas);
		System.out.println("O número em milhas é: " + p_milhas);
		
	}

}