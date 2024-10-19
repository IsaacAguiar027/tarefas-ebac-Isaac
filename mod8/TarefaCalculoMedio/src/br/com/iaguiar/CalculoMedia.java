package br.com.iaguiar;

/**
 * @author isaac.aguiar
 */
public class CalculoMedia {

    public static void main (String args[]) {
        nota();
        calculoNota();

    }
    //Nota dos alunos
    private static void nota() {
        System.out.println("**** Notas ****");

        int nota1 = 10;
        double nota2 = 5.6;
        int nota3 = 8;
        double nota4 = 9.1;

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);

    }

    private static void calculoNota() {

        int nota1 = 10;
        double nota2 = 5.6;
        int nota3 = 8;
        double nota4 = 9.1;
        double nota5 = nota1 + nota2 + nota3 + nota4;

        //Soma de todas as notas
        double isNotaGeral = nota5;

        //Soma da Media geral de nota
        System.out.println("**** Média de Nota ****");
        double  isMedia = isNotaGeral / 4;
        System.out.println("Nota: " + isMedia);


    }

}
