/* Seção 03 - Exercício 5
* 
* Faça um algoritmo que converta metros para centímetros
*/

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao03_exercicio05 {

	public static void main(String[] args) {
		//Variáveis
		float m, cm;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite a quantidade em metros: ");
		m = teclado.nextFloat();
		
		//Processamento
		cm = m * 100;
		
		//Saída
		System.out.println("Este comprimento em cm é igual a: "+cm);
		
		teclado.close();
	}

}
