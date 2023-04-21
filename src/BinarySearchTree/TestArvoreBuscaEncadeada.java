import java.util.Scanner;
public class TestArvoreBuscaEncadeada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        do{
            System.out.println("""
                    Menu
                    1. Inserir um número
                    2. Excluir um número
                    3. Retornar a altura da árvore
                    4. Listar os números (percurso Pré-Ordem))
                    5. Listar os números (percurso Pós-Ordem))
                    6. Listar os números (percurso Simétrico)
                    7. Listar os números (percurso em níveis)
                    8. Listar os números de forma ordenada.
                    0. Sair""");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Digite o número a ser inserido: ");
                    break;
                case 2:
                    System.out.println("Digite o número a ser excluído: ");
                    break;
                case 3:
                    System.out.println("A altura da árvore é: ");
                    break;
                case 4:
                    System.out.println("Lista de números em pré-ordem: ");
                    break;
                case 5:
                    System.out.println("Lista de números em pós-ordem: ");
                    break;
                case 6:
                    System.out.println("Lista de números em ordem simétrica: ");
                    break;
                case 7:
                    System.out.println("Lista de números do percursso em nível: ");
                    break;
                case 8:
                    System.out.println("Números ordenados: ");
                    break;
                case 0:
                    break;
            }
        }
        while (menu != 0);
    }
}
