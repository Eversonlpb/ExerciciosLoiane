package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class ExerciciosJava {

	public static void main(String[] args) {
		
	/*	// 1. Fa?a um programa que mostre a mensagem "Hello World" na tela.
		
		System.out.println("Hello World");
		
		// 2. Fa?a um programa que pe?a um n?mero e ent?o mensagem "O numero informado foi: [n?mero]"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n?mero:");
		int numero = scan.nextInt();
		System.out.println("O n?mero informado foi: " + numero); 
		
		// 3. Fa?a um programa que pe?a dois n?mero e imprima a soma.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primero n?mero");
		int primeiroNumero = scan.nextInt();
		System.out.println("Informe o segundo n?mero");
		int segundoNumero = scan.nextInt();
		int resultado = primeiroNumero + segundoNumero;
		System.out.println("O resultado da soma dos numeros informados ?: " + resultado);
		
		// 4. Fa?a um programa que pe?a as 4 notas bimestrais e mostre a m?dia.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe as quatro notas bimestrais (separadas por espa?o):");
		double primeiraNota = scan.nextDouble();
		double segundaNota = scan.nextDouble();
		double terceiraNota = scan.nextDouble();
		double quartaNota = scan.nextDouble();
		double resultado = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
		System.out.println("A m?dia das notas informadas ?: " + resultado);
		
		// 5. Fa?a um programa que converta metros para cent?metros.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor em metros a ser convertido para cent?metros:");
		double metros = scan.nextDouble();
		double resultado = metros * 100;
		System.out.println("O resultado ?: " + resultado+"cm.");
		
		// 6. Fa?a um programa que pe?a um raio de um c?rculo, calcule e mostre sua ?rea.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o raio do c?rculo cuja ?rea ser? calculada:");
		double raio = scan.nextDouble();
		double area = 3.14*raio*raio;
		System.out.println("A ?rea aproximada do c?rculo ?: " + area);
		
		// 7. Fa?a um programa que calcule a ?rea de um quadrado, 
		//    em seguida mostre o dobro desta ?rea para o usu?rio.
		
		int base = 25;
		int resultado = (base*base) * 2;
		System.out.println("O dobro da ?rea do quadrado ?:" + resultado);
		
		// 8. Fa?a um programa que pergunte o quanto voc? ganha por hora e 
		//    o n?mero de horas trabalhadas no m?s.
		//    Calcule e mostre o total do sal?rio referido no m?s.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor da hora trabalhada:");
		double salarioPorHora = scan.nextDouble();
		System.out.println("Informe o n?mero de horas trabalhadas no m?s:");
		double horasTrabalhadas = scan.nextDouble();
		double resultado = horasTrabalhadas * salarioPorHora;
		System.out.println("O valor a ser recebido ?: " + resultado);
		
		// 9. Fa?a um programa que pe?a a temperatura em graus Celsius,
		//    transforme e mostre em graus Fahrenheit.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em Fahrenheit:");
		double temperatura = scan.nextDouble();
		double resultado = (temperatura -32) / 1.8;
		System.out.println("A temperatura em Celsius ?: " + resultado);
		
		// 10. Fa?a um programa que pe?a a temperatura em graus Fahrenheit,
		//     transforme e mostre em graus Celsius.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em Fahrenheit:");
		double temperatura = scan.nextDouble();
		double resultado = (temperatura *1.8) +32;
		System.out.println("A temperatura em Celsius ?: " + resultado);
		
		// 11. Fa?a um programa que pe?a dois n?meros inteiros e um n?mero real.
		//     Calcule e mostre:
		//     a. O produto do dobro do primeiro com metade do segundo.
		//     b. A soma do triplo do primeiro com o terceiro.
		//     c. O terceiro elevado ao cubo.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe dois n?meiros inteiros e um n?mero real (separados por espa?o):");
		int primeiroNumero = scan.nextInt();
		int segundoNumero = scan.nextInt();
		double terceiroNumero = scan.nextDouble();
		double resultadoA = (primeiroNumero * 2) + (segundoNumero / 2);
		System.out.println("O resultado da quest?o A ?: " + resultadoA);
		double resultadoB = (primeiroNumero * 3) + terceiroNumero;
		System.out.println("O resultado da quest?o B ?: " + resultadoB);
		double resultadoC = terceiroNumero * terceiroNumero * terceiroNumero;
		System.out.println("O resultado da quest?o C ?: " + resultadoC); 
		
		// 12. Tendo como dados de entrada a altura de uma pessoa , 
		//     construa um algoritmo que calcule seu peso, usando a seguinte forma: 
		//     (72,7 * altura) - 58
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a altura: ");
		double altura = scan.nextDouble();
		double imc = (72.7 * altura) - 58;
		System.out.println("O peso ideal ?: " + imc);
		
		// 13. Fa?a um programa que pergunte quanto voc? ganha por hora e o n?mero de horas trabalhadas no m?s.
		//     Calcule e mostre o total do seu sal?rio no referido m?s, 
		//     sabendo-se que s?o descontados 11% para o imposto de renda, 8% para o INSS e 5% para o sindicato, 
	    //     fa?a um programa que nos d?:
		
		//     a. Sal?rio bruto.
		//     b. Quanto pagou ao INSS.
		//     c. Quanto pagou ao sindicato.
		//     d. O sal?rio l?quido.
		//     e. Calcule os descontos e o sal?rio l?quido, conforme a tabela abaixo.
		
		//     | + Sal?rio Bruto - IR (11%) -  INSS (8%) - Sindicato (5%) = Sal?rio L?quido |
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor do sal?rio por hora e o"
							+ "n?mero de horas trabalhadas no m?s (separados por espa?o)");
		double salarioHora = scan.nextDouble();
		double horasTrabalhadas = scan.nextDouble();
		double salarioBruto = salarioHora * horasTrabalhadas;
		double ir =  11.0 / 100.0;
		double inss = 8.0 / 100.0;
		double sindicato =  5.0 / 100.0;
		double resultadoB = inss * salarioBruto;
		double resultadoC = sindicato * salarioBruto;
		double resultadoD = salarioBruto - (ir * salarioBruto) - (inss * salarioBruto) - (sindicato * salarioBruto);
		
		System.out.println("O valor do sal?rio bruto ?: " + salarioBruto);
		System.out.println("O valor a ser em pago ao INSS ?: " + resultadoB);
		System.out.println("O valor a serm pago ao sindicato ?:" + resultadoC);
		System.out.println("O valor do sal?rio l?quido ?: " + resultadoD);
		
		// 14. Fa?a um programa que pe?a o tamanho de um arquivo para download (em MB) e 
		//     a velocidade de um link de internet (em Mbps), 
		//     calcule e informe o tempro aproximado de download do arquivo usando este link (em minutos).
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o tamanho do arquivo para download (em MB) e"
				           + "a velocidade de download pelo link utilizado (em Mpbs).");
		double arquivo = scan.nextDouble();
		double velocidade = scan.nextDouble();
		double conversao = velocidade/8;
		double tempoDeDownload = arquivo / conversao;
		double minutos = tempoDeDownload / 60;
		System.out.println("O tempo estimado de download ? de " + tempoDeDownload + "segundos." 
		+ "Ou " + minutos + "minutos.");*/
		
		
		
		
	}
}
