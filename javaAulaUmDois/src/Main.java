import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean sextou = false;
        char letra = 'A';
        String nome = "Alex";
        int idade = 22;
        float salrio = 18.444f;
        System.out.println("Sextou: " + sextou);
        System.out.println("Caracter: " + letra);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salrio);
        System.out.println("==================");

        System.out.printf("O valor do salário é %.2f", salrio);
        System.out.println("\n==================");

        float media = 6f;
        System.out.printf("\nA média do %s foi %.1f",nome, media);
        System.out.format("\nA média do %s foi %.1f",nome, media);

        Scanner teclado = new Scanner(System.in);
        System.out.println("\nDigite o nome do aluno: ");
        String nomeAluno = teclado.nextLine();

        System.out.println("\nNota aluno: ");
        float nota = teclado.nextFloat();

        System.out.printf("Nome: %s\nNota: %.1f", nomeAluno,nota);

    }
}