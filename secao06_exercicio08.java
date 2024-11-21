/*Seção 06 - Exercício 8
 * 
 * Faça um algoritmo que leia um número inteiro e mostre uma
 * mensagem indicando se este número é par ou ímpar, e se é 
 * positivo ou negativo.
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao06_exercicio08 {

	public static void main(String[] args) {
		//Variáveis
		int num;
		String tipo = new String(""), sinal = new String("");
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite um número inteiro: ");
		num = teclado.nextInt();
		
		//Processamento
		if (num == 0) {
			//Saída
			System.out.println("Este número é neutro, ou seja igual a 0.");
			System.exit(0);
		}
		if(num % 2 == 0) {
			tipo = new String("par");
		}
		else if(num % 2 != 0) {
			tipo = new String("ímpar");
		}
		if(num > 0) {
			sinal = new String("positivo");
		}
		else if(num < 0) {
			sinal = new String("negativo");
		}
		
		//Saída
		System.out.printf("Este número é %s e %s", tipo, sinal);
		
		teclado.close();
	}
}
