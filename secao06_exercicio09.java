/*Seção 06 - Exercício 9
 * 
 * A Secretaria de Meio Ambiente que controla o índice de poluição
 * mantém 3 grupos de indústrias que são altamente poluentes do 
 * meio ambiente. O índice de poluição aceitável varia de 0,05 até
 * 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo
 * são intimadas a suspenderem suas atividades, se o índice crescer
 * para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem
 * suas atividades, se o índice atingir 0,5 todos os grupos devem ser
 * notificados a paralisarem suas atividades. Faça um algoritmo que
 * leia o índice de poluição medido e emita a notificação adequada
 * aos diferentes grupos de empresas.
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao06_exercicio09 {

	public static void main(String[] args) {
		//Variáveis
		float indice;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite o índice de poluição atual: ");
		indice = teclado.nextFloat();
		
		//Processamento
		if(indice < 0.3) {
			System.out.println("Indíce de poluição aceitável.");
			System.exit(0);
		}
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("ATENÇÃO: Empresas do 1º grupo, suspender as atividades.");
		}
		if(indice >= 0.4 && indice < 0.5) {
			System.out.println("ATENÇÃO: Empresas do 1º e 2º grupo, suspender atividades.");
		}
		if(indice >= 0.5) {
			System.out.println("ATENÇÃO: Empresas do 1º, 2º e 3º grupo, suspender atividades.");
		}
		
		teclado.close();
	}

}
