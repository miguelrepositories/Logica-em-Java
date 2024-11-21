/* Seção 03 - Exercício 2
* 
* Faça um algoritmo para "calcular o estoque médio de uma peça
* sendo que:
* 
* estoque_medio = (quantidade_minima + quantidade_maxima) / 2
*/

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao03_exercicio02 {

	public static void main(String[] args) {		
		//Variáveis
		int qtdeMaxima, qtdeMinima;
		float estoqueMedio;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Digite a quantidade mínima: ");
		qtdeMinima = teclado.nextInt();
		
		System.out.println("Digite a quantidade máxima: ");
		qtdeMaxima = teclado.nextInt();
		
		//Processamentos
		estoqueMedio = (qtdeMinima + qtdeMaxima) / 2;
		
		//Saída
		System.out.println("O estoque médio desta peça é: " + estoqueMedio);
		
		teclado.close();

	}

}
