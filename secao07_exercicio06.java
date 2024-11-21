/*Seção 07 - Exercício 6
 * 
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada
 * de qualquer número inteiro entre 1 a 10. O usuário deve 
 * informar de qual numero ele deseja ver a tabuada.
 * A saída deve ser conforme o exemplo abaixo:
 * 
 * Tabuada de 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao07_exercicio06 {

	public static void main(String[] args) {
		//Variáveis
		int num;
		Scanner	teclado = new Scanner(System.in);
		
		//Entrada
		System.out.print("Digite um número entre 1 e 10\n");
		System.out.print("para que seja apresentada a tabuada: ");
		num = teclado.nextInt();
		
		//Processamento e Saída
		System.out.printf("Tabuada de %d:\n", num);
		for(int i=0;i<10;i++) {
			System.out.printf("%d x %d = %d\n", num, i+1, num*(i+1));
		}
		
		teclado.close();
	}

}
