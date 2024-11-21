/*Se��o 08 - Exerc�cio 1
 * 
 * Fa�a um algoritmo que carregue um vetor de 5 elementos inteiros
 * e em seguida armazene em um vetor apenas os n�meros pares maiores
 * que 0. No final deve mostrar os elementos do vetor na tela.
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao08_exercicio01 {

	public static void main(String[] args) {
		//Vari�veis
		int[] num = new int[5];
		int n = 0;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite a seguir, cinco n�meros inteiros.");
		
		for (int i = 0; i < 5;i++) {
			System.out.printf("Informe o %d� n�mero: \n", i+1);
			n = teclado.nextInt();
			if(n % 2 == 0 && n > 0) {
				num[i] = n;
			}
		}
		
		for (int i = 0; i < 5;i++) {
			if (num[i] > 0) {
				System.out.printf("num[%d] = %d\n", i, num[i]);
			}
		}
		teclado.close();
	}
}
