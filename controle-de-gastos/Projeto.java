import java.util.Scanner;
import java.util.ArrayList;

public class Projeto {

    public static void adicionarGasto(ArrayList<String> descricoes, ArrayList<Double> valores) { // crio as funcoes dentro de parametro para o menu chamar
        Scanner adicionarGasto = new Scanner (System.in);

        System.out.print("Informe a descrição do gasto (Ex: Mercado, Uber): ");
        String descricao = adicionarGasto.nextLine();

        while (descricao.isEmpty()) { // verifica se o campo está vazio ou não
            System.out.println("O Campo de descrição deve ser preenchido.");
            System.out.print("Digite novamente a descrição do gasto: ");
            descricao = adicionarGasto.nextLine();
        }

        descricoes.add(descricao);
        System.out.println("Descrição adicionada com sucesso!");


        System.out.print("Informe o valor do gasto: ");
        double valor = adicionarGasto.nextDouble();

        while (valor <= 0) {
            System.out.println("Não é possível processar gasto. Inválido.");
            System.out.print("Digite novamente o valor gasto: ");
            valor = adicionarGasto.nextDouble();
        }

        valores.add(valor);
        System.out.println("Valor adicionado com sucesso");

        System.out.println("=== GASTO ADICIONADO ===");
        System.out.println("DESCRIÇÃO: " + descricao);
        System.out.println("VALOR: R$" + valor);
    }

    public static void listarGasto(ArrayList<String> descricoes, ArrayList<Double> valores) {

        System.out.println("== LISTA DE GASTOS ==");
        if (descricoes.isEmpty()) {
            System.out.println("Não há gasto cadastrado.");
        }

        for (int i = 0; i < descricoes.size(); i++) { // inicializa pelo indice 0, conta quantos indices tem e roda ate que seja menor que a lista, e soma +1
            System.out.println("DESCRIÇÃO: " + descricoes.get(i));
            System.out.println("VALORES: R$" + valores.get(i));
            System.out.println("=============================");
        }
    }

    public static void totalGasto(ArrayList<Double> valores) {
        System.out.println("== TOTAL DE GASTOS ==");

        double soma = 0;

        if (valores.isEmpty()) {
            System.out.println("Não há gastos para ser calculado");
        }
        else {
            for (int i = 0; i < valores.size(); i++) {

                soma += valores.get(i);
            }
            System.out.println("TOTAL DE GASTO: R$" + soma);
        }
    }
}
