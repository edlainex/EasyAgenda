import java.util.Scanner;

public class Main {

    // ******** Subalgoritmos *********

    public static Scanner teclado = new Scanner(System.in);
    public static String agenda[][] = new String[10][3];

    //Procedimento de limpeza Matriz
    public static void limparMatriz(String mm[][]){
        for(int l = 0; l < 10; l++)
        {
            for(int c = 0; c < 3; c++){
                mm[l][c] = "";
            }
        }
    }








    public static void exibeMenu()
    {
        System.out.println("********* M E N U ********");
        System.out.println("1 - Adicionar novo contato");
        System.out.println("2 - Editar contato");
        System.out.println("3 - Pesquisar contato");
        System.out.println("4 - Lista de contatos");
        System.out.println("5 - Apagar um contato");
        System.out.println("6 - Sair");
    }

    // PROGRAMA PRINCIAPAL
    public static void main(String[] args) {
        int opcao, linha;
        String nome;

        //ao inicializar, limpar matriz
        limparMatriz(agenda);

        do {
            //Menu
            exibeMenu();

            //Captura a opção escolhida pelo usuário
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            System.out.println();



        }while (opcao != 6);

    }
}