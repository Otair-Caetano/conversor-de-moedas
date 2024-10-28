package br.com.meucambio.cambio;

import br.com.meuconversor.moedas.Moedas;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;

public class Cambio extends Moedas {
    private double taxaCambioDolar;
    private String apiKey;

    public Cambio(double taxaCambioDolar, String apiKey) {
        super();
        this.taxaCambioDolar = taxaCambioDolar;
        this.apiKey = apiKey;
    }

    public double getTaxaCambioDolar() {
        return taxaCambioDolar;
    }

    public void setTaxaCambioDolar(double taxaCambioDolar) {
        this.taxaCambioDolar = taxaCambioDolar;
    }

    // Método genérico para buscar cotação de USD para uma moeda específica
    private double buscarCotacaoParaMoeda(String moedaDestino) {
        String apiUrl = "https://api.exchangerate-api.com/v4/latest/USD?apikey=" + apiKey;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .header("User-Agent", "Mozilla/5.0")
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject json = new JSONObject(response.body());

            return json.getJSONObject("rates").getDouble(moedaDestino);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return 0.0;
    }

    public double buscarCotacaoDolarParaBRL() {
        return buscarCotacaoParaMoeda("BRL");
    }

    public double buscarCotacaoDolarParaARS() {
        return buscarCotacaoParaMoeda("ARS");
    }

    public double buscarCotacaoDolarParaCOP() {
        return buscarCotacaoParaMoeda("COP");
    }
}