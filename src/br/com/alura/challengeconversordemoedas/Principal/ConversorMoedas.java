import br.com.alura.challengeconversordemoedas.Conversor.Conversor;
import br.com.alura.challengeconversordemoedas.TaxasCambio.TaxasCambio;

import java.util.Map;
import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaxasCambio taxasCambio = new TaxasCambio();
        Map<String, Double> taxas = taxasCambio.obterTaxas();

        if (taxas == null) {
            System.out.println("Erro ao obter taxas de câmbio. Verifique sua conexão.");
            return;
        }

        while (true) {
            System.out.println("\nEscolha uma conversão:");
            System.out.println("1 - Dólar (USD) → Real (BRL)");
            System.out.println("2 - Euro (EUR) → Real (BRL)");
            System.out.println("3 - Libra (GBP) → Real (BRL)");
            System.out.println("4 - Iene (JPY) → Dólar (USD)");
            System.out.println("5 - Dólar (USD) → Euro (EUR)");
            System.out.println("6 - Dólar (USD) → Peso Argentino (ARS)");
            System.out.println("7 - Sair");

            int escolha = scanner.nextInt();
            if (escolha == 7) {
                System.out.println("Obrigado por usar o conversor de moedas!");
                break;
            }

            Conversor conversor = new Conversor();
            conversor.realizarConversao(escolha, taxas);
        }

        scanner.close();
    }
}