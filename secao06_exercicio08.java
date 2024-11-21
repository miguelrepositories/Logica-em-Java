/*Se��o 06 - Exerc�cio 8
 * 
 * Fa�a um algoritmo que leia um n�mero inteiro e mostre uma
 * mensagem indicando se este n�mero � par ou �mpar, e se � 
 * positivo ou negativo.
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao06_exercicio08 {

	public static void main(String[] args) {
		//Vari�veis
		int num;
		String tipo = new String(""), sinal = new String("");
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite um n�mero inteiro: ");
		num = teclado.nextInt();
		
		//Processamento
		if (num == 0) {
			//Sa�da
			System.out.println("Este n�mero � neutro, ou seja igual a 0.");
			System.exit(0);
		}
		if(num % 2 == 0) {
			tipo = new String("par");
		}
		else if(num % 2 != 0) {
			tipo = new String("�mpar");
		}
		if(num > 0) {
			sinal = new String("positivo");
		}
		else if(num < 0) {
			sinal = new String("negativo");
		}
		
		//Sa�da
		System.out.printf("Este n�mero � %s e %s", tipo, sinal);
		
		teclado.close();
	}
}
