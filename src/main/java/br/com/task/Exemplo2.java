package br.com.task;

import java.util.Scanner;

/**
 * @author mauriciomucci
 */
public class Exemplo2 {
    /*
    Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou
    minúscula, além de informar a quantidade de vezes em que ela ocorre.

    IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou
    pode ser previamente definida no código;
    * */
    public static void main(String[] args) {
        System.out.print("Informe uma string: ");
        var scanner = new Scanner(System.in);
        var str = scanner.nextLine();
        scanner.close();
        var count = str.toLowerCase().chars().filter(c -> c == 'a').count();
        System.out.printf(count == 0 ? "Não há ocorrência da letra 'a' na string." :
        "A letra 'a' ocorre %d vezes na string.", count);
    }
}
