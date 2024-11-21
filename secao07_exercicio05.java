/*Seção 07 - Exercício 5
 * 
 * Faça um programa que leia um nome de usuário e a sua senha
 * e não aceite a senha igual ao nome do usuário, mostrando uma
 * mensagem de erro e voltando a pedir as informações.
 */

package br.com.geekuniversity.exercicios;

import java.util.Scanner;

public class secao07_exercicio05 {

	public static void main(String[] args) {
		//Variaveis
		String nome, senha;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.print("Informe o nome de usuário: ");
		nome = teclado.next();
		
		System.out.print("Informe sua senha: ");
		senha = teclado.next();
		
		//Processamento

		while(nome.equals(senha)) {
			System.out.println("\nPor favor, digite uma senha diferente do nome de usuário.");
			System.out.print("Informe o nome de usuário: ");
			nome = teclado.next();
			System.out.print("Informe sua senha: ");
			senha = teclado.next();
		}

		teclado.close();
	}

}
