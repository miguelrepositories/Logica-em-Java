/*Se��o 06 - Exerc�cio 5
 * 
 * Jo�o da Silva, pescador, comprou um microcomputador para
 * controlar o rendimento di�rio de seu trabalho. Toda vez
 * que ele traz um peso de peixes maior que o estabelecido
 * pelo regulamento de pesca do estado de S�o Paulo (50 quilos) 
 * deve pagar uma multa de R$ 4,00 por quilo excedente. 
 * Jo�o precisa que voc� fa�a um algoritmo que
 * leia a vari�vel 'p' (peso de peixes) e verifique se h� excesso.
 * Se houver gravar na vari�vel 'e' (excesso) e na vari�vel 'm' o valor
 * da multa que Jo�o dever� pagar. Caso contr�rio mostrar
 * tais vari�veis com o conte�do 'zero'.
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao06_exercicio05 {

	public static void main(String[] args) {
		//Vari�veis
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
		
		//Sa�da
		System.out.printf("Voc� pescou: %.2f Kg", p);
		System.out.printf("\nO peso excedente equivale a: %.2f Kg\n", e);
		System.out.printf("O valor da multa equivale a: R$ %.2f", m);
		
		teclado.close();
	}

}
