/*Se��o 07 - Exerc�cio 4
 * 
 * Construa um algoritmo que leia 10 valores inteiros e positivos e:
 * a) Encontre o maior valor
 * b) Encontre o menor valor
 * c) Calcule a m�dia dos n�meros lidos
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao07_exercicio04 {

	public static void main(String[] args) {
		//Vari�veis
		float[] valores = new float[10];
		float soma = 0, media = 0;
		int p = 1, N, maior = 0, menor;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a seguir 10 n�meros inteiros e positivos.");
		//Entradas
		for(int i=0;i<10;i++) {
			System.out.printf("Digite %d� n�mero: ", p);
			N = teclado.nextInt();
			
			if(N <= 0) {
				System.out.println("Por favor, digite um n�mero inteiro e positivo.");
				i = i-1;
				p = p--;
			}
			else if(N > 0) {
				valores[i] = N;
				p = p+1;
			}
		}
		menor = (int)(valores[0]);
		for (int i=0;i<10;i++) {
			if(valores[i] > maior) {
				maior = (int)(valores[i]);
			}
			if(valores[i] < menor) {
				menor = (int)(valores[i]);
			}
			soma += valores[i];
		}
		media = soma / 10;
		
		//Sa�da
		System.out.printf("\nO maior valor digitado foi: %d\n", maior);
		System.out.printf("O menor valor digitado foi: %d\n", menor);
		System.out.printf("A media dos valores digitados �: %.2f", media);
		
		teclado.close();
	}

}
