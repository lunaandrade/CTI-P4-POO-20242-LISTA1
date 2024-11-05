package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double salario, novo_salario, perc, aumento;
		
		salario = 1.330;
		perc = 5;
		
		aumento = salario * (perc/100);
		novo_salario = salario + aumento;
		
		
		System.out.print(aumento);
		System.out.print(novo_salario);
	}

}
