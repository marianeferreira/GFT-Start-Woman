/*
  4. Escreva um programa que pergunte o dia, mês e ano do aniversário de uma
pessoa e diga se a data é válida ou não. Caso não seja, diga o motivo.
Suponha que todos os meses têm 31 dias e que estejamos no ano de 2000.
Caso a data esteja correta imprima “Data válida”.
 */

package desafios;

import java.util.Scanner;

public class desafio4 {


    public static void data() {

        Scanner leitor = new Scanner(System.in);

        int dia, mes, ano;

        System.out.println("Digite o dia do seu aniversário:");
        dia = leitor.nextInt();
        System.out.println("Digite o mês do seu aniversário:");
        mes = leitor.nextInt();
        System.out.println("Digite o ano do seu aniversário:");
        ano = leitor.nextInt();

        if((dia<1) || (dia>31)){
            System.out.println("Data inválida, o dia deve estar entre 1 e 31");
        } else if ((mes<1) || (mes>12)) {
            System.out.println("Data inválida, o mês deve estar entre 1 e 12");
        } else if ((ano<1) || (ano>2000)) {
            System.out.println("Data inválida, o ano deve estar entre 1 e 2000");
        } else {
            System.out.println("Data válida");
        }

        leitor.close();

    }
    
}
