/*Seção 07 - Exercício 1
 * 
 * Faça um algoritmo que determine o maior entre N números. A condição 
 * de parada é a entrada de um valor 0, ou seja, o algoritmo deve ficar 
 * calculando o maior até que a entrada seja igual a 0 (ZERO).
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao07_exercicio01 {

	public static void main(String[] args) {
		//Variáveis
		float N, maior = 0;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite um número real: ");
		N = teclado.nextFloat();
		
		//Processamento
		while(N != 0) {
			if( N > maior) {
				maior = N; 
			}
			System.out.println("Digite outro número real: ");
			N = teclado.nextFloat();
		}
		
		//Saída
		System.out.printf("\nO maior entre os números digitados é: %.2f", maior);
		
		teclado.close();
	}

}
