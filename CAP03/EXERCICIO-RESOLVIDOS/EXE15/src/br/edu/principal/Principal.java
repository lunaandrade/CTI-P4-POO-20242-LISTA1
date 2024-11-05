package br.edu.principal;

public class Principal {

	public static void main(String[] args) 
	{
		double preco_fa, perc_lucro, perc_imp, vlr_dis, vlr_i, preco_f;
		
		preco_fa = 60.000;
		perc_lucro = 15;
		perc_imp = 10;
		
		vlr_dis = preco_fa * (perc_lucro / 100);
		vlr_i = preco_fa * (perc_imp / 100);
		preco_f = preco_fa + vlr_dis + vlr_i;
		
		System.out.println("O valor correspondente ao lucro do distribuidor é: " + vlr_dis);
		System.out.println("O valor correspondente aos impostos é: " + vlr_i);
		System.out.println("O preço final do veículo é: " + preco_f);
		

	}

}