/*Se��o 06 - Exerc�cio 6
 * 
 * Elabore um algoritmo que leia as vari�veis 'c' e 'n', respectivamente
 * c�digo e n�mero de horas trabalhadas de um oper�rio. Calcule o sal�rio
 * sabendo-se que ele ganha R$ 10,00 por hora. Quando o n�mero de horas
 * exceder a 50 calcule o excesso de pagamento armazenando-o na vari�vel 'e'.
 * Caso contr�rio zerar tal vari�vel.
 * A hora excedente de trabalho vale R$ 20,00. No final do processamento
 * imprimir o sal�rio total e o sal�rio excedente.
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao06_exercicio06 {

	public static void main(String[] args) {
		//Vari�veis
		double c = 0, n, e = 0, valorHora = 10.00, salarioTotal = 0;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Digite o c�digo do oper�rio: ");
		c = teclado.nextDouble();
		
		System.out.println("Digite o total de horas trabalhadas: ");
		n = teclado.nextDouble();
		
		//Processamento
		if (n > 50.00) {
			e = (n - 50.00) * 20.00;
			salarioTotal = (50 * valorHora) + e;
		}else {
			salarioTotal = n * valorHora;
		}
		
		//Sa�das
		System.out.printf("Salario extra: R$ %.2f\n", e);
		System.out.printf("Salario total: R$ %.2f", salarioTotal);
		
		teclado.close();
	}
}
