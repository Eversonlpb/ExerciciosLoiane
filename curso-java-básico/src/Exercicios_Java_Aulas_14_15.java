import java.util.Scanner;

public class Exercicios_Java_Aulas_14_15 {
	
	public static void main(String[] args) {
		
	
	
	// 1. Fa�a um programa que pe�a dois n�mero e imprima o maior deles.
	
	/* Scanner scan = new Scanner(System.in);
	System.out.println("Entre com dois n�meros inteiros: ");
	
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	
	if (num1 > num2) {
	System.out.println("O maior n�mero �: " + num1);
	} else if (num1 < num2) {
		System.out.println("O maior n�mero �: " + num2);
	}}

	// 2. Fa�a um programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo. 

		Scanner scan = new Scanner(System.in);
		double numero = scan.nextDouble();
		
		if (numero < 0) {
			System.out.println("N�mero negativo");
		} else if (numero >= 0){
			System.out.println("N�mero positivo");
		}
		
		
		
	// 3. Fa�a um programa que verifique se uma letra digitada � "F", "M" ou "NB".
	// Conforme a letra escrever: F - Feminino, M - Masculino, NB - N�o Bin�rio.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o sexo com 'F', 'M', 'NB':");
		String sexo = scan.nextLine();
		
		switch(sexo){
		case "F": System.out.println("F - Feminino");
		break;
		case "M": System.out.println("M- Masculino");
		break;
		case "NB": System.out.println("NB - N�o Bin�rio");
		break;
		default: System.out.println("Informa��o inv�lida");
		} 
		
	// 4. Fa�a um programa que verifique se uma letra digitada � vogal ou consoante.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra:");
		String letra = scan.next();
		
		switch(letra) {
		case "a": ;
		case "e": ; 
		case "i": ;
		case "o": ; 
		case "u": System.out.println("Vogal");
		break;
		default: System.out.println("Consoante ou numeral");
		}
		
		
	// 5. Fa�a um programa para leitura de duas notas parciais de um aluno.
	// O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
	// - A mensagem "Aprovado" se a m�dia for maior ou igual a 7.
	// - A mensagem "Reprovado" se a m�dia alcan�a for menor que 7.
	// - A mensagem "Aprovado com Distin��o" se a m�dia alcan�ada for igual a 10.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe as duas notas do(a) aluno(a):");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7 && media < 9 ) {
			System.out.println("Aprovado.");
		}else if (media == 10){
			System.out.println("Aprovado com Distin��o!");
		}else {
			System.out.println("Reprovado.");
		}
		
		
	// 6 . Fa�a um programa que leia tr�s n�meros e mostre o maior deles.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe tr�s n�meros a serem comparados:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O maior n�mero �: " + num1);
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("O maior n�mero �: " + num2);
		}else {
			System.out.println("O maior n�mero �: " + num3);
		}
		
		
	// 7. Fa�a um programa que leia tr�s n�mero e mostre o maior e menor deles.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe tr�s n�meros a serem comparados:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3 && num2 > num3) {
			System.out.println("O maior n�mero �: " + num1);
			System.out.println("O menor n�mero �: " + num3);
		} else if (num2 > num1 && num2 > num3 && num3 > num1) {
			System.out.println("O maior n�mero �: " + num2);
			System.out.println("O menor n�mero �: " + num1);
		} else if (num3 > num1 && num3 > num2 && num2 > num1) {
			System.out.println("O maior n�mero �: " + num3);
			System.out.println("O menor n�mero �:" + num1);
		}
		

		
	// 8. Fa�a um programa que pergunte o pre�o dos tr�s produtos e 
	//	informe qual produto voc� deve comprar, sabendo que a decis�o � sempre pelo mais barato.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe os valores dos tr�s produtos:");
		double prod1 = scan.nextDouble();
		double prod2 = scan.nextDouble();
		double prod3 = scan.nextDouble();
		
		if (prod1 < prod2 && prod1 < prod3) {
			System.out.println("O produto com menor pre�o �: " + prod1);
		}else if(prod2 < prod1 && prod2 < prod3) {
			System.out.println("O produto com menor pre�o �: " + prod2);
		}else {
			System.out.println("O produto com menor pre�o �: " + prod3);
		}
		
		
		
	// 9. Fa�a um programa que leia tr�s n�meros e mostre-os em ordem descrescente:
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com tr�s n�meros");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if (num1> num2 && num1 > num3 && num2 > num3) {
			System.out.println("A ordem descrescente �: " + num1 + ", " + num2 + ", " + num3 +  ".");
		}else if (num2> num1 && num2 > num3 && num1 > num3) {
			System.out.println("A ordem descrescente �: " + num2 + ", " + num1 + ", " + num3 + ".");
		}else if (num3> num1 && num3 > num2 && num2 > num1) {
			System.out.println("A ordem descrescente �: " + num3 + ", " + num2 + ", " + num1 + ".");
		}else if (num2 > num3 && num2 > num1 && num3 > num1) {
			System.out.println("A ordem descrescente �: " + num2 + ", " + num3 + ", " + num1 + ".");
		}else if(num1 > num2 && num1 > num3 && num3 > num2) {
			System.out.println("A ordem descrescente �: " + num1 + ", " + num3 + ", " + num2 + ".");
		}else {
			System.out.println("A ordem descrescente �: " + num3 + ", " + num1 + ", " + num2 + ".");
		}
		
		
		
	// 10. Fa�a um programa que pergunte em que turno voc� estuda.
	// Pe�a para digitar M - Matutino, V - Vespertino, ou N - Noturno. Imprima a mensagem "Bom dia!",
	// "Boa tarde!" ou "Boa noite!" ou "Valor inv�lido", conforme o caso.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o turno em que voc� estudo com 'M' para matutino," + 
		"'V' para vespertino e 'N' para noturno:");
		String turno = scan.next();
		
		switch(turno) {
		case "M": System.out.println("Bom dia!");
		break;
		case "V": System.out.println("Boa tarde!");
		break;
		case "N": System.out.println("Boa noite!");
		break;
		default: System.out.println("Valor inv�lido");
		}
		
		
	// 11. As Organiza��es Tabajara  resolveram dar um aumento de sal�rio aos seus colaboradores
	// e lhe contrataram  para desenvolver o programa que calcular� os reajustes.
	//  Fa�a um programa que receba o sal�rio de um colaborador e o reajuste segundo o seguinte crit�rio , baseado no sal�rio atual:
	// - Sal�rios at� R$280,00 (incluindo): aumento de 20%
	// - Sal�rios entre R$280,00 e R$700,00: aumento de 15% 
	// - Sal�rios entre R$700,00 e R$ 1.500,00: aumento de 10%
	// - Sal�rios acima de R$1.500,00 em diante: aumento de 5%.
	// Ap�s o aumento ter sido realizado, informe na tela: 
	// - O Sal�rio antes do reajuste;
	// - O percentual de aumento  aplicado ;
	// - O valor do aumento;
	// - O novo sal�rio ap�s o aumento;
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Informe o valor do sal�rio ao qual ser� aplicado o aumento:");
	
	
	float salario = scan.nextFloat();
	float vintePercentual = 20 / 100;
	float quinzePercentual = 15 / 100;
	float dezPercentual = 10 / 100;
	float cincoPercentual = 5 / 100;
	float valorAcrescido;
	float valorFinal;
	
	
	if ( salario <= 280.00) {
		valorFinal = salario + (vintePercentual * salario);
		System.out.println("Sal�rio antes do reajuste:" + salario);
		System.out.println("Aumento de 20%");
		valorAcrescido = vintePercentual * salario;
		System.out.println("O valor acrescentado �: " + valorAcrescido);
		System.out.println("O sal�rio ap�s o ajuste �:" + valorFinal);	
	} else if (salario > 280.00 || salario < 700.00) {
		valorFinal = salario + (quinzePercentual * salario);
		System.out.println("Sal�rio antes do reajuste:" + salario);
		System.out.println("Aumento de 15%");
		valorAcrescido = quinzePercentual * salario;
		System.out.println("O valor acrescentado �: " + valorAcrescido);
		System.out.println("O sal�rio ap�s o ajuste �:" + valorFinal);
	} else if (salario > 700.00 || salario < 1500.00) {
		valorFinal = salario + (dezPercentual * salario);
		System.out.println("Sal�rio antes do reajuste:" + salario);
		System.out.println("Aumento de 10%");
		valorAcrescido = dezPercentual * salario;
		System.out.println("O valor acrescentado �: " + valorAcrescido);
		System.out.println("O sal�rio ap�s o ajuste �:" + valorFinal);
	}else {
		valorFinal = salario + (cincoPercentual * salario);
		System.out.println("Sal�rio antes do reajuste:" + salario);
		System.out.println("Aumento de 5%");
		valorAcrescido = cincoPercentual * salario;
		System.out.println("O valor acrescentado �: " + valorAcrescido);
		System.out.println("O sal�rio ap�s o ajuste �:" + valorFinal);

	} 
		
	// 12. Fa�a um programa para o c�lculo de uma folha de pagamento sabendo que os descontos s�o de Impostos de Renda,
	// que depende do sal�rio bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do
	// Sal�rio Bruto menos os descontos. O programa dever� pedir ao usu�rio o valor da sua hora e a quantidade de horas
	// trabalhadas no m�s.
	// - Desconto do IR:
	// - Salario Bruto at� R$: 900 (inclusive) - isento.
	// - Salario Bruto at� R$: 1500 (inclusive) - desconto de 5%.
	// - Salario Bruto at� R$: 2500 (inclusive) - desconto de 10%.
	// - Salario Bruto acima de R$: 2500 - desconto de 20%.
	// - Imprima na tela as informa��es, dispostas conforme o exemplo abaixo.
	// No exemplo o valor da hora � de R$:5 e as quantidade de horas trabalhadas � de 220. 
		
	// |Sal�rio Bruto: (5*220)    	= R$: 1.100,00|
	// |(-) IR (5%)                 = R$:    55,00|
	// |(-) INSS (10%)              = R$:   110,00|
	// |FGTS (11%)                  = R$:   121,00|
	// |Total de Descontos          = R$:   165,00|
	// |Sal�rio Liquido             = R$:   935,00|
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor do sal�rio por hora seguido pelo n�mero de horas trabalhadas no m�s:");
		
		double salarioHora = scan.nextDouble();
		double horaMes = scan.nextDouble();
		double salarioMes = salarioHora * horaMes;
		double ir5 =  (5 / 100);
		double ir10 =  (10 / 100);
		double ir20 =  (20 / 100);
		double inss =  (10/100);
		double fgts = (11/100);
		
		if(salarioMes <= 900) {
			System.out.println("Sal�rio Bruto ------ R$:" + salarioMes);
			System.out.println("IR ----------------- R$:" + "Isento");
			System.out.println("INSS --------------- R$:" + (inss * salarioMes));
			System.out.println("FGTS --------------- R$:" + (fgts * salarioMes));
			System.out.println("Total de Descontos - R$:" + (inss*salarioMes + fgts * salarioMes));
			System.out.println("Sal�rio Liquido ---- R$:" + (salarioMes - (inss*salarioMes) - (fgts*salarioMes)));
		}else if(salarioMes > 900 && salarioMes <= 1500 ) {
			System.out.println("Sal�rio Bruto ------ R$:" + salarioMes);
			System.out.println("IR ----------------- R$:" + (ir5 *salarioMes));
			System.out.println("INSS --------------- R$:" + (inss * salarioMes));
			System.out.println("FGTS --------------- R$:" + (fgts * salarioMes));
			System.out.println("Total de Descontos - R$:" + (inss*salarioMes + fgts * salarioMes));
			System.out.println("Sal�rio Liquido ---- R$:" + (salarioMes - (inss*salarioMes) - (fgts*salarioMes)));
		}else if(salarioMes > 1500 && salarioMes <= 2500) {
			System.out.println("Sal�rio Bruto ------ R$:" + salarioMes);
			System.out.println("IR ----------------- R$:" + (ir10*salarioMes));
			System.out.println("INSS --------------- R$:" + (inss * salarioMes));
			System.out.println("FGTS --------------- R$:" + (fgts * salarioMes));
			System.out.println("Total de Descontos - R$:" + (inss*salarioMes + fgts * salarioMes));
			System.out.println("Sal�rio Liquido ---- R$:" + (salarioMes - (inss*salarioMes) - (fgts*salarioMes)));
		}else if(salarioMes > 2500) {
			System.out.println("Sal�rio Bruto ------ R$:" + salarioMes);
			System.out.println("IR ----------------- R$:" + (ir20*salarioMes));
			System.out.println("INSS --------------- R$:" + (inss * salarioMes));
			System.out.println("FGTS --------------- R$:" + (fgts * salarioMes));
			System.out.println("Total de Descontos - R$:" + (inss*salarioMes + fgts * salarioMes));
			System.out.println("Sal�rio Liquido ---- R$:" + (salarioMes - (inss*salarioMes) - (fgts*salarioMes)));
		}else {
			System.out.println("Valores inv�lidos");
		} 
		
	// 13. Fa�a um programa que leia um n�mero e exiba o dia correspondente da semana. (1-Domingo, 2-Segunda, etc...), 
	// se digitar outro valor, deve aparecer, valor inv�lido.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero de 1 a 7 correspondente a um dia da semana.");
		
		int dia = scan.nextInt();
		
		switch(dia) {
		case 1: System.out.println("Domingo");
		break;
		case 2: System.out.println("Segunda");
		break;
		case 3: System.out.println("Ter�a");
		break;
		case 4: System.out.println("Quarta");
		break;
		case 5: System.out.println("Quinta");
		break;
		case 6: System.out.println("Sexta");
		break;
		case 7: System.out.println("S�bado");
		break;
		default:System.out.println("Valor inv�lido");
		}
		
		
	// 14. Fa�a um programa que l� as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, 
	// e calcule a sua m�dia. A atribui��o de conceitos obedece a tabela abaixo:
		
	// | M�dia de aproveitamento         Conceito|
	// | Entre 9.0 e 10.0                   A    |
	// | Entre 7.5 e 9.0                    B    |
	// | Entre 6.0 e 7.5                    C    |
	// | Entre 4.0 e 6.0                    D    |
	// | Entre 4.0 e 0.0                    E    |
	//
	// O algoritmo deve mostrar na tela as notas, a m�dia ,
	// o conceito correspondente e a mensagem "APROVADO" se o conceito for A, B ou C, e "REPROVADO" se o conceito for D ou E. 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe as duas notas parciais do aluno:");
		double primeiraNota = scan.nextDouble();
		double segundaNota = scan.nextDouble();
		double media = (primeiraNota + segundaNota) / 2;
		
		if(media >= 9) {
			System.out.println("Primeira nota: " + primeiraNota);
			System.out.println("Segunda nota: " + segundaNota);
			System.out.println("M�dia: " + media);
			System.out.println("Conceito: A");
			System.out.println("Aluno(a) foi: Aprovado");
		}else if(media <= 9 && media >= 7.5) {
			System.out.println("Primeira nota: " + primeiraNota);
			System.out.println("Segunda nota: " + segundaNota);
			System.out.println("M�dia: " + media);
			System.out.println("Conceito: B");
			System.out.println("Aluno(a) foi: Aprovado");
		}else if(media <= 7.5 && media >= 6) {
			System.out.println("Primeira nota: " + primeiraNota);
			System.out.println("Segunda nota: " + segundaNota);
			System.out.println("M�dia: " + media);
			System.out.println("Conceito: C");
			System.out.println("Aluno(a) foi: Aprovado");
		}else if(media <= 6 && media >= 4) {
			System.out.println("Primeira nota: " + primeiraNota);
			System.out.println("Segunda nota: " + segundaNota);
			System.out.println("M�dia: " + media);
			System.out.println("Conceito: D");
			System.out.println("Aluno(a) foi: Reprovado");
		}else{
			System.out.println("Primeira nota: " + primeiraNota);
			System.out.println("Segunda nota: " + segundaNota);
			System.out.println("M�dia: " + media);
			System.out.println("Conceito: E");
			System.out.println("Aluno(a) foi: Reprovado");
		}
		
		
	// 15. Fa?a um programa que pe?a os 3 lados de um tri?ngulo. 
	// O programa dever? informa se os valores podem ser um tri?ngulo. 
	// Indique, caso os lados forem um tr?ngulo, se o mesmo ?: quil?tero, is?sceles ou escaleno.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Inform os valores dos tr?s lados do tri?ngulo:");
		double ladoA = scan.nextDouble();
		double ladoB = scan.nextDouble();
		double ladoC = scan.nextDouble();
		boolean triangulo = true;
		
		if(ladoA < ladoB + ladoC || ladoB < ladoA + ladoC || ladoC < ladoA + ladoB ) {
			System.out.println("? triango:" + triangulo);
			if(ladoA == ladoB && ladoA == ladoC) {
		System.out.println("Equil?tero");
			}else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
				System.out.println("Is?sceles");
			}else {
				System.out.println("Escaleno");
			}
		}else {
			System.out.println("N?o ? um tri?ngulo!");
		}
		
		
	// Fa?a um programa que calcule as ra?zes de uma equa??o de segrundo grau, na forma ax2 + bx + c.
	// O programa dever? pedir os valores de a, b e c e fazer as consist?ncias informando ao usu?rio nas seguintes sistua??es:
	// a.)Se o usu?rio informar o valor de A igual a zero a equa??o n?o ? de segundo grau e o programa n?o deve pedir os demais valores, sendo ecerrado.
	// b.)Se o delta calculado for negativo, a equa??o n?o possui raizes reais. Informe ao usu?rio e encerre o programa.
	// c.)Se o delta calculado for igual a zero a equa??o possui apenas uma raiz real; informe ao usu?rio.
	// d.)Se o delta for positivo, a equa??o possui duas ra?zes reais; informe-as ao usu?rio.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe os valores de A, B e C:");
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		if (a != 0) {
			double delta = (b*b) - (4*a*c);
			if(delta == 0) {
				double raiz1 = (-b + Math.sqrt(delta) / (2*a));
				System.out.println("Delta = " + delta);
				System.out.println("Raiz = " + raiz1);
			}else if(delta > 0) {
				double raiz1 = (-b + Math.sqrt(delta) / (2*a));
				double raiz2 = (-b - Math.sqrt(delta) / (2*a));
				System.out.println("Delta = " + delta);
				System.out.println("Primeira raiz  = " + raiz1);
				System.out.println("Segunda raiz = " + raiz2);
			}else {
				System.out.println("Delta = " + delta);
				System.out.println("N?o existem raizes reais!");
			}
		}else {
			System.out.println("Essa n?o ? uma equa??o de segundo grau!");
			System.out.println("Informe um valor diferente de 0 para A e tente novamente!");
		}
		
		
	// 17. Fa?a um programa que pe?a um n?mero correspondente a um determinado ano e em seguida informe se este ano ? um ano bissexto.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um ano:");
		int ano = scan.nextInt();
		
		if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println(ano + " ? um ano bissexto!");
		}else {
			System.out.println(ano + " N?O ? um ano bissexto!");
		}
		
		
	// 18. Fa?a um programa que pe?a um n?mero inteiro e determine se o n?mero ? par ou impar.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um n?mero inteiro:");
		
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " ? um n?mero par.");
		}else {
			System.out.println(numero + " ? um n?mero impar.");
		}
		*/
	// 19. 
	}}	 