/*Seção 08 - Exercício 5
 * 
 * Faça um programa que carregue um vetor com dez números
 * inteiros. Calcule e mostre os números superiores a 50 e suas
 * respectivas posições. Mostrar mensagem se não existir nenhum
 * número nesta condição.
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao08_exercicio05 {

	public static void main(String[] args) {
		//Variáveis
		int[] num = new int[10];
		boolean indicador = false;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite a seguir, dez números inteiros.");
		
		for (int i = 0; i < 10;i++) {
			System.out.printf("Informe o %dº número: \n", i+1);
			num[i] = teclado.nextInt();
		}
		System.out.printf("\n");
		for (int i = 0; i < 10;i++) {
			if (num[i] > 50) {
				System.out.printf("Vetor[%d] = %d\n", i, num[i]);
				indicador = true;
			}
		}
		if(indicador == false) {
			System.out.printf("\nNão existe nenhum número maior que 50 entre os que foram digitados.");
		}
		teclado.close();

	}

}
