/* Seção 03 - Exercício 6
* 
* Faça um algoritmo que pergunte quanto você ganha
* por hora e o número de horas trabalhadas no mês.
* Calcule e mostre o total do seu salário no referido
* mês.
*/

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao03_exercicio06 {

	public static void main(String[] args) {
		//Variaveis
		float salarioHora, horasTrabalhadas, salarioTotal;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Por favor, digite quanto você ganha por hora: ");
		salarioHora = teclado.nextFloat();
		
		System.out.println("Digite quantas horas você trabalhou neste mês: ");
		horasTrabalhadas = teclado.nextFloat();
		
		//Processamento
		salarioTotal = salarioHora*horasTrabalhadas;
		
		//Saída
		System.out.println("O seu salário total corresponde a: " + salarioTotal);
		
		teclado.close();

	}

}
