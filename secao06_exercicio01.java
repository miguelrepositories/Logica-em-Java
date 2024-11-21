/* Seção 06 - Exercício 1
* 
* Ler uma variavel númerica "N" e imprimi-la somente
* se a mesma for maior que 100, caso contrário imprimi-la 
* com o valor zero.
*/

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao06_exercicio01 {

	public static void main(String[] args) {
		//Variavel
		float N;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite um número qualquer: ");
		N = teclado.nextFloat();
		
		//Processamento
		if(N > 100) {
			//Saída
			System.out.printf("O valor digitado foi: %.2f", N);
		}else {
			N = 0;
			//Saída
			System.out.printf("N = "+ N);
		}
		
		teclado.close();
	}

}
