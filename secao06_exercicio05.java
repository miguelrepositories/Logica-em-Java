/*Seção 06 - Exercício 5
 * 
 * João da Silva, pescador, comprou um microcomputador para
 * controlar o rendimento diário de seu trabalho. Toda vez
 * que ele traz um peso de peixes maior que o estabelecido
 * pelo regulamento de pesca do estado de São Paulo (50 quilos) 
 * deve pagar uma multa de R$ 4,00 por quilo excedente. 
 * João precisa que você faça um algoritmo que
 * leia a variável 'p' (peso de peixes) e verifique se há excesso.
 * Se houver gravar na variável 'e' (excesso) e na variável 'm' o valor
 * da multa que João deverá pagar. Caso contrário mostrar
 * tais variáveis com o conteúdo 'zero'.
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao06_exercicio05 {

	public static void main(String[] args) {
		//Variáveis
		double p = 0, e = 0, m = 0;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Digite o peso (Kg) total de peixes: ");
		p = teclado.nextDouble();
		
		//Processamento
		if (p > 50.00) {
			e = p - 50;
			m = e * 4.00;
		}
		
		//Saída
		System.out.printf("Você pescou: %.2f Kg", p);
		System.out.printf("\nO peso excedente equivale a: %.2f Kg\n", e);
		System.out.printf("O valor da multa equivale a: R$ %.2f", m);
		
		teclado.close();
	}

}
