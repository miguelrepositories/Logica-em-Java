/*Se��o 08 - Exerc�cio 6
 * 
 * Fa�a um programa que receba um c�digo n�merico inteiro e um
 * vetor de cinco posi��es de n�meros reais. Se o c�digo for
 * zero, termine o programa. Se o c�digo for 1, mostre o vetor
 * na ordem direta. Se o c�digo for 2, mostre o vetor na ordem
 * inversa.
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao08_exercicio06 {

	public static void main(String[] args) {
		//Vari�veis
		double[] vetor1 = new double[5];
		int cod;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite a seguir cinco n�meros reais.");
		for(int i=0;i<5;i++) {
			System.out.printf("Digite o %d� n�mero: ", i+1);
			vetor1[i] = teclado.nextDouble();
		}
		System.out.println("\nEscolha uma das op��es abaixo:");
		System.out.println("1 - Mostrar o vetor na ordem direta");
		System.out.println("2 - Mostrar o vetor na ordem inversa.");
		System.out.println("0 - Sair");
		System.out.println("\nDigite o n�mero equivalente � sua escolha: ");
		cod = teclado.nextInt();
		switch(cod){
			case 1:
				for(int i=0;i<4;i++){
					System.out.printf("%.2f; ", vetor1[i]);
				}
				System.out.printf("%.2f", vetor1[4]);
				break;
			case 2:
				for(int i=4;i>=1;i--){
					System.out.printf("%.2f; ", vetor1[i]);
				}
				System.out.printf("%.2f", vetor1[0]);
				break;
			case 0:
				System.out.println("\nAplica��o Encerrada...");
				break;
	}
		teclado.close();
	}

}
