/*
2. Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Média aritmética
2. Média ponderada
3. Sair
Digite a opção desejada:
Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar
a média ponderada.
Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida, mostrando uma mensagem. 
*/

package desafios;

import java.util.Scanner;

public class desafio2 {

    public static void calculaMedia() {

        Scanner leitor = new Scanner(System.in);

        double nota1, nota2, nota3, peso1, peso2, peso3, media;
        int opcao;

        System.out.println("Menu de opções:");
        System.out.println("1. Média aritmética");
        System.out.println("2. Média ponderada");
        System.out.println("3. Sair");
        System.out.println("Digite a opção desejada:");
    
        opcao = leitor.nextInt();

        switch(opcao){
            case 1:
            System.out.println("Digite a nota 1:");
            nota1 = leitor.nextDouble();
            System.out.println("Digite a nota 2:");
            nota2 = leitor.nextDouble();
            media = (nota1 + nota2) / 2;
            System.out.println("Média aritmética: " + media);
            break;
            case 2:
            System.out.println("Digite a nota 1:");
            nota1 = leitor.nextDouble();
            System.out.println("Digite o peso da nota 1:");
            peso1 = leitor.nextDouble();
            System.out.println("Digite a nota 2:");
            nota2 = leitor.nextDouble();
            System.out.println("Digite o peso da nota 2:");
            peso2 = leitor.nextDouble();
            System.out.println("Digite a nota 3:");
            nota3 = leitor.nextDouble();
            System.out.println("Digite o peso da nota 3:");
            peso3 = leitor.nextDouble();
            media = ((nota1*peso1) + (nota2*peso2) + (nota3*peso3)) / (peso1 + peso2 + peso3);
            System.out.println("Média ponderada: " + media);
            break;
            case 3:
            break;
            default:
            System.out.println("Opção inválida!");
        }

        leitor.close();
        
    }
}
