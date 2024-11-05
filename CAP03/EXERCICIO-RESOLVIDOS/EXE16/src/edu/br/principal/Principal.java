package edu.br.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*DECLARE horas_t, vlr_sal_min, vlr_hora_t NUMÉRICO
vlr_sal_bru, imp, vlr_sal_liq NUMÉRICO
LEIA horas_t
LEIA vlr_sal_min
vlr_hora_t ← vlr_sal_min / 2
vlr_sal_bru ← vlr_hora_t * horas_t
imp ← vlr_sal_bru * 3 / 100
vlr_sal_liq ← vlr_sal_bru − imp
ESCREVA vlr_sal_liq*/
		
		Scanner sc = new Scanner(System.in);
	     int horas_t, vlr_sal_min, vlr_hora_t, vlr_sal_bruto, imp, vlr_sal_liq;
	     System.out.print("Digite quatas horas voce trabalha no dia: ");
	     horas_t = sc.nextInt();
	     System.out.print("Digite o valor do seu salario: ");
	     vlr_sal_min = sc.nextInt();
	     vlr_hora_t = vlr_sal_min / 2;
	     vlr_sal_bruto = vlr_hora_t * horas_t;
	     imp = vlr_sal_bruto * 3/100;
	     vlr_sal_liq =vlr_sal_bruto - imp;
	     System.out.println("o valor liquido do seu salario será: " + vlr_sal_liq);
	}

}
