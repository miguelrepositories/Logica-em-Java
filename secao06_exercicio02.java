/* Se��o 06 - Exerc�cio 2
* 
* Elabore um algoritmo que leia um n�mero. Se positivo armazene-o 'a',
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
		System.out.println("Digite um n�mero real: ");
		num = teclado.nextFloat();
		
		//Processamento
		if (num > 0) {
			a = num;
			//Sa�da
			System.out.println("O n�mero digitado � positivo.");
		}
		if (num < 0) {
			b = num;
			//Sa�da
			System.out.println("O n�mero digitado � negativo.");
		}
		if (num == 0){
			//Sa�da
			System.out.println("O n�mero digitado � neutro.");
		}
		
		teclado.close();
	}
}
