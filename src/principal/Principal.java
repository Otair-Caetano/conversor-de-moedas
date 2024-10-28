package principal;

import br.com.meucambio.cambio.Cambio;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String apiKey = "SUA_CHAVE_API_AQUI"; // Substitua pela sua chave da API
        Cambio cambio = new Cambio(0.0, apiKey);

        System.out.println("***********************************************************");
        System.out.println("Seja bem-vindo/a ao Conversor de Moedas");

        System.out.println("\n1) Dólar ==> Peso argentino");
        System.out.println("2) Peso argentino ==> Dólar");
        System.out.println("3) Dólar ==> Real brasileiro");
        System.out.println("4) Real brasileiro ==> Dólar");
        System.out.println("5) Dólar ==> Peso colombiano");
        System.out.println("6) Peso colombiano ==> Dólar");
        System.out.println("7) Atualizar cotação do dólar");
        System.out.println("8) Sair");
        System.out.println("Escolha uma opção válida:");
        System.out.println("***********************************************************");

        while (true) {
            int opcao = entrada.nextInt();

            if (opcao == 8) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor em Dólar:");
                    double valorDolar = entrada.nextDouble();
                    double cotacaoPesoArgentino = cambio.buscarCotacaoDolarParaARS();
                    System.out.println("Valor da conversão de Dólar para Peso argentino é: " + " $" + (valorDolar * cotacaoPesoArgentino));
                    break;
                case 2:
                    System.out.println("Digite o valor em Peso argentino:");
                    double valorPesoArgentino = entrada.nextDouble();
                    double cotacaoDolarParaARS = 1 / cambio.buscarCotacaoDolarParaARS();
                    System.out.println("Valor da conversão de Peso argentino para Dólar é: " + " US$" + (valorPesoArgentino * cotacaoDolarParaARS));
                    break;
                case 3:
                    System.out.println("Digite o valor em Dólar:");
                    valorDolar = entrada.nextDouble();
                    double cotacaoReal = cambio.buscarCotacaoDolarParaBRL();
                    System.out.println("Valor da conversão de Dólar para Real brasileiro é: " + " R$" + (valorDolar * cotacaoReal));
                    break;
                case 4:
                    System.out.println("Digite o valor em Real brasileiro:");
                    double valorReal = entrada.nextDouble();
                    double cotacaoDolar = 1 / cambio.buscarCotacaoDolarParaBRL();
                    System.out.println("Valor da conversão de Real brasileiro para Dólar é: " + " US$" + (valorReal * cotacaoDolar));
                    break;
                case 5:
                    System.out.println("Digite o valor em Dólar:");
                    valorDolar = entrada.nextDouble();
                    double cotacaoPesoColombiano = cambio.buscarCotacaoDolarParaCOP();
                    System.out.println("Valor da conversão de Dólar para Peso colombiano é: " + (valorDolar * cotacaoPesoColombiano));
                    break;
                case 6:
                    System.out.println("Digite o valor em Peso Colombiano:");
                    double valorPesoColombiano = entrada.nextDouble();
                    double cotacaoDolarParaCOP = 1 / cambio.buscarCotacaoDolarParaCOP();
                    System.out.println("Valor da conversão de Peso colombiano para Dólar é: " + (valorPesoColombiano * cotacaoDolarParaCOP));
                    break;
                case 7:
                    System.out.println("Atualizando cotação do dólar para Real brasileiro...");
                    double novaCotacao = cambio.buscarCotacaoDolarParaBRL();
                    System.out.println("Cotação atualizada do dólar para BRL: " + novaCotacao);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println("\nEscolha uma nova opção ou digite 8 para sair:");
        }
        entrada.close();
    }
}