/* Se��o 03 - Exerc�cio 5
* 
* Fa�a um algoritmo que converta metros para cent�metros
*/

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao03_exercicio05 {

	public static void main(String[] args) {
		//Vari�veis
		float m, cm;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite a quantidade em metros: ");
		m = teclado.nextFloat();
		
		//Processamento
		cm = m * 100;
		
		//Sa�da
		System.out.println("Este comprimento em cm � igual a: "+cm);
		
		teclado.close();
	}

}
