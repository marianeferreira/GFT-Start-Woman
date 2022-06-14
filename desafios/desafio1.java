/*
1. A GFT Brasil resolveu dar um aumento de salário aos seus colaboradores
e lhe contrataram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste
segundo o seguinte critério, baseado no salário atual;
a. Salários até R$ 280,00 (incluindo): aumento de 20%;
b. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
c. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
d. Salários de R$ 1500,00 em diante: aumento de 5%
Após o aumento ser realizado; informe na tela;
a. O salário antes do reajuste;
b. O percentual de aumento aplicado;
c. O valor do aumento;
d. O novo salário, após o aumento.
*/
package desafios;

import java.util.Scanner;

public class desafio1 {

	public static void calculaNovoSalario() {
	
		Scanner leitor = new Scanner(System.in);
		double salario, novoSalario;
		int percentual;
	
		System.out.println("Digite o valor do salario atual:");
		salario = leitor.nextDouble();
	
		if (salario <= 280.0) {
			percentual = 20;
			novoSalario = salario * 1.20;
		} else if (salario > 280.0 && salario <= 700.0) {
			percentual = 15;
			novoSalario = salario * 1.15;
		} else if (salario > 700.0 && salario <= 1500.0) {
			percentual = 10;
			novoSalario = salario * 1.1;
		} else {
			percentual = 5;
			novoSalario = salario * 1.05;
		}
		
		System.out.println("Salario antes do reajuste: " + salario);
		System.out.println("Percentual de aumento aplicado: " + percentual + "%");
		System.out.println("Valor do aumento: " + (novoSalario - salario));
		System.out.println("Novo salario: " + novoSalario);
		
		leitor.close();
	}
}
