/* Seção 06 - Exercício 2
* 
* Elabore um algoritmo que leia um número. Se positivo armazene-o 'a',
* se for negativo, em 'b'. No final mostrar o resultado.
*/

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao06_exercicio02 {

	public static void main(String[] args) {
		//Variavel
		float num, a, b;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite um número real: ");
		num = teclado.nextFloat();
		
		//Processamento
		if (num > 0) {
			a = num;
			//Saída
			System.out.println("O número digitado é positivo.");
		}
		if (num < 0) {
			b = num;
			//Saída
			System.out.println("O número digitado é negativo.");
		}
		if (num == 0){
			//Saída
			System.out.println("O número digitado é neutro.");
		}
		
		teclado.close();
	}
}
