/*Se��o 06 - Exerc�cio 7
 * 
 * Desenvolva um algoritmo que:
 * a) Leia 4(quatro) n�meros;
 * b) Calcule o quadrado de cada um;
 * c) Se o valor resultante do quadrado do terceiro for >= 1000
 * imprima-o e finalize;
 * d) Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao06_exercicio07 {

	public static void main(String[] args) {
		//Variaveis
		float[] nums = new float[4], results = new float[4];
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("A seguir digite 4 n�meros reais.");
		for (int i=0; i < 4;i++) {
			System.out.printf("Digite o %d� n�mero: ", i+1);
			nums[i] = teclado.nextFloat();
		}
		for (int i=0; i < 4;i++) {
			results[i] = nums[i] * nums[i];
		}
		if (results[2] >= 1000) {
			System.out.printf("O quadrado do terceiro n�mero � "+ results[2]);
		}else {
			//Sa�da
			for (int i=0; i < 4;i++) {
			System.out.printf("%d� n�mero foi %.2f e o quadrado deste n�mero � %.2f\n", i+1, nums[i], results[i]);
			}
		}
		teclado.close();
	}

}
