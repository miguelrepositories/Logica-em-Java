/*Se��o 07 - Exerc�cio 2
 * 
 * Fa�a um algoritmo que conte de 1 a 100 e a cada m�ltiplo de 10 emita
 * uma mensagem: "M�ltiplo de 10".
 */

package br.com.geekuniversity.exercicios;

public class secao07_exercicio02 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			System.out.printf("\n%d", i);
			if( i % 10 == 0) {
				System.out.printf("(M�ltiplo de 10.)");
			}
		}
	}
}
