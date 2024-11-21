/* Se��o 06 - Exerc�cio 3

* 
* Ler um n�mero e verificar se ele � par ou �mpar. Quando for par
* armazenar esse valor em 'p' e quando for �mpar armazen�-lo em 'i'.
* Exibir 'p' e 'i' no final do processamento.
*/

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao06_exercicio03 {

	public static void main(String[] args) {
		//Vari�veis
		int num, p = 0, i = 0;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite um n�mero inteiro: ");
		num = teclado.nextInt();
		
		//Processamento
		if (num % 2 == 0) {
			p = num;
		}
		if (num % 2 != 0) {
			i = num;
		}
		if (num == 0){
			//Sa�da
			System.out.println("Este n�mero � neutro, ou seja igual a 0.");
			System.exit(0);
		}
		
		//Sa�da
		System.out.println("A vari�vel p = "+ p);
		System.out.println("A vari�vel i = "+ i);
		
		teclado.close();

	}

}
