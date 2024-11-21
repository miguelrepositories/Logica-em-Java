/*Seção 06 - Exercício 04
 * 
 * Tendo como dados de entrada a altura e o sexo de uma pessoa, construa
 * um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
 * Para homens: (72.7 * altura) - 58
 * Para mulheres: (62.1 * altura) - 44.7
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao06_exercicio04 {

	public static void main(String[] args) {
		//Variaveis
		float altura, pesoIdeal = 0;
		char sexo;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite a sua altura: ");
		altura = teclado.nextFloat();
		
		System.out.println("Informe o seu sexo (M / F): ");
		sexo = teclado.next().toUpperCase().charAt(0);
		
		//Processamentos
		if(sexo == 'M') {
			pesoIdeal = (float)(72.7 * altura) - 58;
		}
		if(sexo == 'F') {
			pesoIdeal = (float)((62.1 * altura) - 44.7);
		}
		if(sexo != 'M' && sexo != 'F') {
			System.out.println("Por favor, digite 'M' para Masculino e 'F' para feminino." );
			System.exit(0);
		}
		
		//Saida
		System.out.printf("Seu peso ideal é: %.2f", pesoIdeal);
		
		teclado.close();
	}

}
