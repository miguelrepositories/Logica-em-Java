/*Se��o 06 - Exerc�cio 9
 * 
 * A Secretaria de Meio Ambiente que controla o �ndice de polui��o
 * mant�m 3 grupos de ind�strias que s�o altamente poluentes do 
 * meio ambiente. O �ndice de polui��o aceit�vel varia de 0,05 at�
 * 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� grupo
 * s�o intimadas a suspenderem suas atividades, se o �ndice crescer
 * para 0,4 as industrias do 1� e 2� grupo s�o intimadas a suspenderem
 * suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser
 * notificados a paralisarem suas atividades. Fa�a um algoritmo que
 * leia o �ndice de polui��o medido e emita a notifica��o adequada
 * aos diferentes grupos de empresas.
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao06_exercicio09 {

	public static void main(String[] args) {
		//Vari�veis
		float indice;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite o �ndice de polui��o atual: ");
		indice = teclado.nextFloat();
		
		//Processamento
		if(indice < 0.3) {
			System.out.println("Ind�ce de polui��o aceit�vel.");
			System.exit(0);
		}
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("ATEN��O: Empresas do 1� grupo, suspender as atividades.");
		}
		if(indice >= 0.4 && indice < 0.5) {
			System.out.println("ATEN��O: Empresas do 1� e 2� grupo, suspender atividades.");
		}
		if(indice >= 0.5) {
			System.out.println("ATEN��O: Empresas do 1�, 2� e 3� grupo, suspender atividades.");
		}
		
		teclado.close();
	}

}
