/*Seção 06 - Exercício 6
 * 
 * Elabore um algoritmo que leia as variáveis 'c' e 'n', respectivamente
 * código e número de horas trabalhadas de um operário. Calcule o salário
 * sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas
 * exceder a 50 calcule o excesso de pagamento armazenando-o na variável 'e'.
 * Caso contrário zerar tal variável.
 * A hora excedente de trabalho vale R$ 20,00. No final do processamento
 * imprimir o salário total e o salário excedente.
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao06_exercicio06 {

	public static void main(String[] args) {
		//Variáveis
		double c = 0, n, e = 0, valorHora = 10.00, salarioTotal = 0;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Digite o código do operário: ");
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
		
		//Saídas
		System.out.printf("Salario extra: R$ %.2f\n", e);
		System.out.printf("Salario total: R$ %.2f", salarioTotal);
		
		teclado.close();
	}
}
