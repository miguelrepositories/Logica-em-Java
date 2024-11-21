/*Seção 07 - exercicio 3
 * 
 * Elabore um programa que gera e escreve os números ímpares
 * dos números entre 100 e 200.
 */

package br.com.geekuniversity.exercicios;

public class secao07_exercicio03 {

	public static void main(String[] args) {
		
		for (int i = 100; i <= 200;i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
