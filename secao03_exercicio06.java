/* Se��o 03 - Exerc�cio 6
* 
* Fa�a um algoritmo que pergunte quanto voc� ganha
* por hora e o n�mero de horas trabalhadas no m�s.
* Calcule e mostre o total do seu sal�rio no referido
* m�s.
*/

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao03_exercicio06 {

	public static void main(String[] args) {
		//Variaveis
		float salarioHora, horasTrabalhadas, salarioTotal;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Por favor, digite quanto voc� ganha por hora: ");
		salarioHora = teclado.nextFloat();
		
		System.out.println("Digite quantas horas voc� trabalhou neste m�s: ");
		horasTrabalhadas = teclado.nextFloat();
		
		//Processamento
		salarioTotal = salarioHora*horasTrabalhadas;
		
		//Sa�da
		System.out.println("O seu sal�rio total corresponde a: " + salarioTotal);
		
		teclado.close();

	}

}
