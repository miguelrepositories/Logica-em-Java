/* Se��o 03 - Exerc�cio 7
* 
*Tendo como dados de entrada a altura de uma pessoa,
*construa um algoritmo que calcule seu peso ideal,
*usando a seguinte f�rmula: (72.7 * altura) - 58
*/

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao03_exercicio07 {

	public static void main(String[] args) {
		//Variaveis
		float altura, pesoIdeal;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite o comprimento da sua altura: ");
		altura = teclado.nextFloat();
		
		//Processamento
		pesoIdeal = (float)(72.7 * altura) - 58;
		
		//Sa�da
		System.out.printf("Seu peso ideal seria: %.2f", pesoIdeal);
		
		teclado.close();
	}

}
