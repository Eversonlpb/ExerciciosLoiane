package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Informe a idade");
		int idade = scan.nextInt();
		
		if (idade >= 18){
			System.out.println("É maior de idade!");
		} else {
			System.out.println("É menor de idade!"); 
		}*/
		
		// barato <= 10
		// 10 < valor < 15 - pedir desconto
		// 15 <= valor 17 - pesquisar mais
		// >= 17 - muito caro
		
		System.out.println("Informe o valor do produto:");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Está barto, pode comprar!");
		} else if (valor > 10 &&  valor < 15) {
			System.out.println("Peça desconto!");
		}else if (valor >= 15 && valor < 17) {
			System.out.println("Pesquise mais!");
		} else if(valor >= 17) {
			System.out.println("Não compre, muito caro!");
		}
	}
}
