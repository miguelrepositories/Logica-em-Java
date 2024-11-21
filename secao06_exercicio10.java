/*Seção 06 - Exercício 10
 * 
 * Elabore um algoritmo que dada a idade de um nadador classifique-o
 * em uma das seguintes categorias:
 * 
 * infantil-a = 5 a 7 anos
 * infantil-b = 8 a 11 anos
 * juvenil-a = 12 a 13 anos
 * juvenil-b = 14 a 17 anos
 * adultos = Maiores de 18 anos
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao06_exercicio10 {

	public static void main(String[] args) {
		//Variáveis
		int idade;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite a idade do nadador: ");
		idade = teclado.nextInt();
		
		//Processamento
		if(idade < 5) {
			System.out.println("Este nadador não possui idade suficiente.");
			System.exit(0);
		}
		if(idade >= 5 && idade <= 7) {
			System.out.println("Este nadador se enquadra na categoria 'infantil-a'.");
		}
		if(idade >= 8 && idade <= 11) {
			System.out.println("Este nadador se enquadra na categoria 'infantil-b'.");
		}
		if(idade >= 12 && idade <= 13) {
			System.out.println("Este nadador se enquadra na categoria 'juvenil-a'.");
		}
		if(idade >= 14 && idade <= 17) {
			System.out.println("Este nadador se enquadra na categoria 'juvenil-b'.");
		}
		if(idade >=18) {
			System.out.println("Este nadador se enquadra na categoria 'adultos'.");
		}
		teclado.close();
	}

}
