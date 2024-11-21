/*Se��o 07 - Exerc�cio 5
 * 
 * Fa�a um programa que leia um nome de usu�rio e a sua senha
 * e n�o aceite a senha igual ao nome do usu�rio, mostrando uma
 * mensagem de erro e voltando a pedir as informa��es.
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao07_exercicio05 {

	public static void main(String[] args) {
		//Variaveis
		String nome, senha;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.print("Informe o nome de usu�rio: ");
		nome = teclado.next();
		
		System.out.print("Informe sua senha: ");
		senha = teclado.next();
		
		//Processamento

		while(nome.equals(senha)) {
			System.out.println("\nPor favor, digite uma senha diferente do nome de usu�rio.");
			System.out.print("Informe o nome de usu�rio: ");
			nome = teclado.next();
			System.out.print("Informe sua senha: ");
			senha = teclado.next();
		}

		teclado.close();
	}

}
