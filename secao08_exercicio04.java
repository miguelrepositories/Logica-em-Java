/*Seção 08 - Exercício 4
 * 
 * Escreva um algoritmo que leia e mostre um vetor de 20 elementos
 * inteiros, em seguida, mostre a soma de todos os elementos.
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao08_exercicio04 {

	public static void main(String[] args) {
		//Variaveis
		int[] elements = new int[20];
		int soma = 0;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Digite a seguir uma sequência de 20 números inteiros.");
		for(int i=0;i<20;i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			//Processamentos
			elements[i] = teclado.nextInt();
			soma += elements[i];
		}
		
		//Saídas
		System.out.printf("\nA soma dos números digitados é: %d", soma);
		
		teclado.close();
	}

}
