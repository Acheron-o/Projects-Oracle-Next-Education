package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = leitura.nextLine();
        var apiKey = "2bb2525d";
       try {
           var buscaCodificado = URLEncoder.encode(busca, StandardCharsets.UTF_8);
           String endereco = "https://www.omdbapi.com/?t=" + buscaCodificado + "&apikey=" + apiKey;

           HttpClient client = HttpClient.newHttpClient();
           HttpRequest request = HttpRequest.newBuilder()
                   .uri(URI.create(endereco))
                   .build();
           HttpResponse<String> response = client
                   .send(request, HttpResponse.BodyHandlers.ofString());

           String json = response.body();
           System.out.println(json);

           Gson gson = new Gson();
           Titulo meuTitulo = gson.fromJson(json, Titulo.class);
           System.out.println(meuTitulo);
       } catch (Exception e) {
           System.out.println("Aconteceu um erro: ");
           System.out.println(e.getMessage());
       }
       finally {
           System.out.println("Código finalizado!");
       }
    }
}