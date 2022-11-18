import java.util.Scanner;

public class Quinze {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] titulo = new String[50];
        String[] autor = new String[50];
        String[] editora = new String[50];
        int[] ano = new int[50];
        String[] genero = new String[50];
        int i = 0;
        String resp;
        
        System.out.println("Bem-vindo à biblioteca!");


        do {
            System.out.print("Informe o título do livro:");
            titulo[i] = input.nextLine();

            System.out.print("Informe o autor do livro:");
            autor[i] = input.nextLine();

            System.out.print("Informe a editora do livro:");
            editora[i] = input.nextLine();

            System.out.print("Informe o ano de lançamento do livro:");
            ano[i] = Integer.parseInt(input.nextLine());

            System.out.print("Informe o gênero do livro:");
            genero[i] = input.nextLine();

            System.out.print("Deseja cadastrar outro livro? (s/n)");
            resp = input.nextLine();

            i++;

        } while (resp.equals("s"));

        System.out.println("Informe o número de um dos livros para visualizar as informações:");
        int num = input.nextInt();

        System.out.println("Título: " + titulo[num]);
        System.out.println("Autor: " + autor[num]);
        System.out.println("Editora: " + editora[num]);
        System.out.println("Ano de Lançamento: " + ano[num]);
        System.out.println("Gênero: " + genero[num]);
    }
}