/* Se��o 02 - Exerc�cio 2
* 
* Fa�a um algoritmo para somar dois n�meros
* e multiplicar o resultado pelo primeiro n�mero.
*/

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao02_exercicio02 {

	public static void main(String[] args) {
		//Vari�veis
		int num1, num2, soma, resultado;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Digite o primeiro n�mero: ");
		num1 = teclado.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		num2 = teclado.nextInt();
		
		//Processamentos
		soma = num1 + num2;
		resultado = soma * num1;
		
		//Sa�da
		System.out.println("O resultado da multiplica��o da soma dos dois n�meros pelo primeiro �: "+ resultado);
		
		teclado.close();
	}

}
