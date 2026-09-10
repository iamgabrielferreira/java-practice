import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {
        Scanner menu = new Scanner (System.in);
        ArrayList<String> descricoes = new ArrayList<>();
        ArrayList<Double> valores = new ArrayList<>();

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("=== CONTROLE DE GASTOS ===");
            System.out.println("1 - Adicionar Gasto");
            System.out.println("2 - Listar Gasto");
            System.out.println("3 - Ver Total Gasto");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = menu.nextInt();

            menu.nextLine(); // para limpar o buffet do enter

            if (opcao == 1) {
                Projeto.adicionarGasto(descricoes, valores);
            }
            else if (opcao == 2) {
                Projeto.listarGasto(descricoes, valores);
            }
            else if (opcao == 3) {
                Projeto.totalGasto(valores);
            }
            else if (opcao == 4) {
                System.out.println("SAINDO DO MENU");
            }
            else {
                System.out.println("Opção inexistente. Tente novamente.");
            }
        }
    }
}

// no menu eu chamo a funçao.