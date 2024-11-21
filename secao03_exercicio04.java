/* Seção 03 - Exercício 4
 * 
 * Faça um algoritmo que peça dois números e imprima a soma.
*/

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao03_exercicio04 {
	public static void main(String[] args) {
		//Variáveis
		int num1, num2, soma;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Digite o primeiro número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = teclado.nextInt();
		
		//Processamentos
		soma = num1 + num2;
		
		//Saída
		System.out.println("A soma dos números é: " + soma);
		
		teclado.close();
	}

}
