/* Seção 02 - Exercício 2
* 
* Faça um algoritmo para somar dois números
* e multiplicar o resultado pelo primeiro número.
*/

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao02_exercicio02 {

	public static void main(String[] args) {
		//Variáveis
		int num1, num2, soma, resultado;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Digite o primeiro número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = teclado.nextInt();
		
		//Processamentos
		soma = num1 + num2;
		resultado = soma * num1;
		
		//Saída
		System.out.println("O resultado da multiplicação da soma dos dois números pelo primeiro é: "+ resultado);
		
		teclado.close();
	}

}
