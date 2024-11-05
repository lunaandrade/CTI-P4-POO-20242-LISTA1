package br.edu.principal;

public class Principal {

	public static void main(String[] args)
	{
		double ano_atual, ano_nas, idade, idade_2050;
		ano_nas = 1989;
		ano_atual = 2024;
		
		idade = ano_atual - ano_nas;
		idade_2050 = 2050 - ano_nas;
		
		System.out.println("A idade da pessoa é: " + idade);
		System.out.println("A idade da pessoa em 2050 será: " + idade_2050);
	}

}