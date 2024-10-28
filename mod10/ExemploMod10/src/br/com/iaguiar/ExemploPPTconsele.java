package br.com.iaguiar;

import java.util.Scanner;

/**
 * @author isaac.aguiar
 */

public class ExemploPPTconsele {
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);
        System.out.println("Digite um número");

        int result = s.nextInt();

        if (result == 1) {
            System.out.println("Resultado igual a 1");
        }else if (result > 1) {
            System.out.println("Resultado menor que 1");

        } else {
            System.out.println("Resultado menor que 1");
        }

        for (int  i = 0; i < 10; i++) {
            System.out.println("Linha " + i);
        }
    }
}
