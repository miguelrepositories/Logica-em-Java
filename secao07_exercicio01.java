/*Se��o 07 - Exerc�cio 1
 * 
 * Fa�a um algoritmo que determine o maior entre N n�meros. A condi��o 
 * de parada � a entrada de um valor 0, ou seja, o algoritmo deve ficar 
 * calculando o maior at� que a entrada seja igual a 0 (ZERO).
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao07_exercicio01 {

	public static void main(String[] args) {
		//Vari�veis
		float N, maior = 0;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite um n�mero real: ");
		N = teclado.nextFloat();
		
		//Processamento
		while(N != 0) {
			if( N > maior) {
				maior = N; 
			}
			System.out.println("Digite outro n�mero real: ");
			N = teclado.nextFloat();
		}
		
		//Sa�da
		System.out.printf("\nO maior entre os n�meros digitados �: %.2f", maior);
		
		teclado.close();
	}

}
