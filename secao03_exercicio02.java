/* Se��o 03 - Exerc�cio 2
* 
* Fa�a um algoritmo para "calcular o estoque m�dio de uma pe�a
* sendo que:
* 
* estoque_medio = (quantidade_minima + quantidade_maxima) / 2
*/

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao03_exercicio02 {

	public static void main(String[] args) {		
		//Vari�veis
		int qtdeMaxima, qtdeMinima;
		float estoqueMedio;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Digite a quantidade m�nima: ");
		qtdeMinima = teclado.nextInt();
		
		System.out.println("Digite a quantidade m�xima: ");
		qtdeMaxima = teclado.nextInt();
		
		//Processamentos
		estoqueMedio = (qtdeMinima + qtdeMaxima) / 2;
		
		//Sa�da
		System.out.println("O estoque m�dio desta pe�a �: " + estoqueMedio);
		
		teclado.close();

	}

}
