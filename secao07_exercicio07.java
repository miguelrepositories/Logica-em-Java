/*Se��o 07 - Exerc�cio 7
 *
 * 	Sua organiza��o acaba de contratar um estagi�rio para trabalhar no
	Suporte de Inform�tica, com a inten��o de fazer um levantamento
	nas sucatas encontradas nesta �rea. A primeira tarefa dele � testar
	todos os cerca de 200 mouses que se encontram l�, testando e anotando o
	estado de cada um deles, para verificar o que se pode aproveitar deles.
	Foi requisitado que voc� desenvolva um programa para registrar este
	levantamento. O programa dever� receber um n�mero indeterminado
	de entradas, cada uma contendo: um n�mero de identifica��o do
	mouse o tipo de defeito:
	- necessita da esfera;
	- necessita de limpeza;
	- necessita troca do cabo ou conector;
	- quebrado ou inutilizado

	Uma identifica��o igual a zero encerra o programa. Ao final o
	programa dever� emitir o seguinte relat�rio:

	Quantidade de mouses: 100

	Situa��o								Quantidade	Percentual
	1- Necessita da esfera					40			40%
	2- Necessita de limpeza					30			30%
	3- Necessita troca do cabo ou conector	15			15%
	4- Quebrado ou inutlizado				15			15%
 *
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao07_exercicio07 {

	public static void main(String[] args) {
		//Vari�veis
		int id= 1, qtde, esfera = 0, limpeza = 0, caboConector = 0, quebrado = 0, defeito;
		float percent1, percent2, percent3, percent4;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		while(id != 0){
			System.out.println("Digite por gentileza, o n�mero de identifica��o do mouse: ");
			id = teclado.nextInt();
			if (id == 0){
				break;
			}
			System.out.print("Identifique o problema: \n");
			System.out.print("1- Necessita da esfera \n");
			System.out.print("2- Necessita de limpeza \n");
			System.out.print("3- Necessita troca do cabo ou conector \n");
			System.out.print("4- Quebrado ou inutilizado \n");
			System.out.print("\nDigite o n�mero do problema: ");
			defeito = teclado.nextInt();
			System.out.print("\n");

			//Processamentos
			switch (defeito){
				case 1:
					esfera++;
					break;
				case 2:
					limpeza++;
					break;
				case 3:
					caboConector++;
					break;
				case 4:
					quebrado++;
					break;
			}
		}
		qtde = esfera+limpeza+caboConector+quebrado;
		percent1 = ((float)esfera*100)/(float)qtde;
		percent2 = ((float)limpeza*100)/(float)qtde;
		percent3 = ((float)caboConector*100)/(float)qtde;
		percent4 = ((float)quebrado*100)/(float)qtde;

		//Sa�das
		System.out.printf("\nQuantidade de mouses: %d\n", qtde);
		System.out.printf("Situa��o						Quantidade	Percentual\n");
		System.out.printf("1- Necessita da esfera					%d		%.2f%%\n", esfera, percent1);
		System.out.printf("2- Necessita de limpeza					%d		%.2f%%\n", limpeza, percent2);
		System.out.printf("3- Necessita troca do cabo ou conector			%d		%.2f%%\n", caboConector, percent3);
		System.out.printf("4- Quebrado ou inutilizado				%d		%.2f%%\n", quebrado, percent4);
		
		teclado.close();
	}

}
