/* Se��o 03 - Exerc�cio 4
 * 
 * Fa�a um algoritmo que pe�a dois n�meros e imprima a soma.
*/

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao03_exercicio04 {
	public static void main(String[] args) {
		//Vari�veis
		int num1, num2, soma;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Digite o primeiro n�mero: ");
		num1 = teclado.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		num2 = teclado.nextInt();
		
		//Processamentos
		soma = num1 + num2;
		
		//Sa�da
		System.out.println("A soma dos n�meros �: " + soma);
		
		teclado.close();
	}

}
