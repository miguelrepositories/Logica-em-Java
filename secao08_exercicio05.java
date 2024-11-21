/*Se��o 08 - Exerc�cio 5
 * 
 * Fa�a um programa que carregue um vetor com dez n�meros
 * inteiros. Calcule e mostre os n�meros superiores a 50 e suas
 * respectivas posi��es. Mostrar mensagem se n�o existir nenhum
 * n�mero nesta condi��o.
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao08_exercicio05 {

	public static void main(String[] args) {
		//Vari�veis
		int[] num = new int[10];
		boolean indicador = false;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite a seguir, dez n�meros inteiros.");
		
		for (int i = 0; i < 10;i++) {
			System.out.printf("Informe o %d� n�mero: \n", i+1);
			num[i] = teclado.nextInt();
		}
		System.out.printf("\n");
		for (int i = 0; i < 10;i++) {
			if (num[i] > 50) {
				System.out.printf("Vetor[%d] = %d\n", i, num[i]);
				indicador = true;
			}
		}
		if(indicador == false) {
			System.out.printf("\nN�o existe nenhum n�mero maior que 50 entre os que foram digitados.");
		}
		teclado.close();

	}

}
