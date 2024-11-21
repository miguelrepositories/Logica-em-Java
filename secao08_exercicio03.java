/*Seção 08 - Exercício 3
 * 
 * Faça um programa que carregue um vetor com dez números
 * inteiros. Mostre o vetor na ordem inversa a que foi digitado.
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao08_exercicio03 {
	
	public static void main(String[] args) {
		//Variáveis
		int[] vetor1 = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Digite a seguir 10 números inteiros.");
		for (int i=0;i<10;i++) {
			System.out.printf("Digite o %dº número: \n", i+1);
			vetor1[i] = teclado.nextInt();
		}
		System.out.printf("\n");
		for (int i=(vetor1.length -1);i>=0;i--) {
			System.out.printf("Vetor1[%d] = %d \n", i, vetor1[i]);
		}
		teclado.close();
	}

}
