/* Se��o 06 - Exerc�cio 1
* 
* Ler uma variavel n�merica "N" e imprimi-la somente
* se a mesma for maior que 100, caso contr�rio imprimi-la 
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
		System.out.println("Digite um n�mero qualquer: ");
		N = teclado.nextFloat();
		
		//Processamento
		if(N > 100) {
			//Sa�da
			System.out.printf("O valor digitado foi: %.2f", N);
		}else {
			N = 0;
			//Sa�da
			System.out.printf("N = "+ N);
		}
		
		teclado.close();
	}

}
