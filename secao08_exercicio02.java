/*Seção 08 - Exerício 2
 * 
 * Escreva um algoritmo que leia dois vetores de 10 posições e faça e
 * soma dos elementos de mesmo índice, colocando o resultado em um
 * terceiro vetor. Mostre o vetor resultante.
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao08_exercicio02 {

	public static void main(String[] args) {
		//Variáveis
		int[] vetor1 = new int[10], vetor2 = new int[10], vetor3 = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		for(int i=0;i<10;i++) {
			System.out.printf("Informe o %dº número do 1º Vetor: ", i+1);
			vetor1[i] = teclado.nextInt();
		}
		System.out.printf("\n");
		for(int i=0;i<10;i++) {
			System.out.printf("Informe o %dº número do 2º Vetor: ", i+1);
			vetor2[i] = teclado.nextInt();
		}
		System.out.printf("\n");
		for(int i=0;i<10;i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
			System.out.printf("Vetor1[%d] + Vetor2[%d] = %d\n", i, i, vetor3[i]);
		}
		teclado.close();
	}

}
