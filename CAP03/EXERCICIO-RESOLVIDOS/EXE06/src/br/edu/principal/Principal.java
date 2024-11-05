package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double salario, novo_salario, aumento, imposto, perc_aum, perc_imp;
		
		salario = 1.300;
		perc_aum = 5;
		perc_imp = 7;
		
		aumento = salario * (perc_aum / 100);
		imposto = salario * (perc_imp /100);
		
		novo_salario = salario + aumento - imposto;
		
		System.out.print(novo_salario);
	}

}
