/*Seção 07 - Exercício 2
 * 
 * Faça um algoritmo que conte de 1 a 100 e a cada múltiplo de 10 emita
 * uma mensagem: "Múltiplo de 10".
 */

package br.com.geekuniversity.exercicios;

public class secao07_exercicio02 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			System.out.printf("\n%d", i);
			if( i % 10 == 0) {
				System.out.printf("(Múltiplo de 10.)");
			}
		}
	}
}
