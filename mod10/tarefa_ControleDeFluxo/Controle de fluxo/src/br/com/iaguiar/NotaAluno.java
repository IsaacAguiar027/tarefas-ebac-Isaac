package br.com.iaguiar;

public class NotaAluno {

    public static void main(String[] args) {
            nota();
            resultadoNota();
    }

    private static void nota() {
            System.out.println("**** Notas ****");

            int nota = 8;
            double nota2 = 7;
            double nota3 = 4.5;
            int nota4 = 10;

            System.out.println("Aluno1 Nota: " + nota);
            System.out.println("Aluno2 Nota: " + nota2);
            System.out.println("Aluno3 Nota: " + nota3);
            System.out.println("Aluno4 Nota: " + nota4);

    }

    private static void resultadoNota() {
            System.out.println("**** Resultado ****");

            int nota = 8;
            double nota2 = 7;
            double nota3 = 4.5;
            int nota4 = 10;

            // Nota igual ou maior que 5, Aluno aprovado.
            // Nota Menor que 5, Aluno reprovado.

            if (nota >= 5 && nota <= 10) {
                System.out.println("Aluno1 Aprovado");
            } else if (nota >= 0 && nota <=5 ) {
                System.out.println("Aluno1 Reprovado");
            }
            if (nota2 >= 5 && nota2 <= 10) {
                System.out.println("Aluno2 Aprovado");
            } else if (nota2 >= 0 && nota2 <=5 ) {
                System.out.println("Aluno2 Reprovado");
            }

            if (nota3 >= 5 && nota3 <= 10) {
                System.out.println("Aluno3 Aprovado");
            } else if (nota3 >= 0 && nota3 <=5 ) {
                System.out.println("Aluno3 Reprovado");
            }

            if (nota4 >= 5 && nota4 <= 10) {
                System.out.println("Aluno4 Aprovado");
            } else if (nota4 >= 0 && nota4 <=5 ) {
                System.out.println("Aluno4 Reprovado");
            }
    }

}
