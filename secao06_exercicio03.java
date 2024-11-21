/* Seção 06 - Exercício 3

* 
* Ler um número e verificar se ele é par ou ímpar. Quando for par
* armazenar esse valor em 'p' e quando for ímpar armazená-lo em 'i'.
* Exibir 'p' e 'i' no final do processamento.
*/

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao06_exercicio03 {

	public static void main(String[] args) {
		//Variáveis
		int num, p = 0, i = 0;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite um número inteiro: ");
		num = teclado.nextInt();
		
		//Processamento
		if (num % 2 == 0) {
			p = num;
		}
		if (num % 2 != 0) {
			i = num;
		}
		if (num == 0){
			//Saída
			System.out.println("Este número é neutro, ou seja igual a 0.");
			System.exit(0);
		}
		
		//Saída
		System.out.println("A variável p = "+ p);
		System.out.println("A variável i = "+ i);
		
		teclado.close();

	}

}
