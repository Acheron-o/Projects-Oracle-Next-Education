package br.com.alura.screenmatch.main;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainWithSearch {
    static void main(String[] args) throws IOException, InterruptedException {

        Scanner input = new Scanner(System.in);
        System.out.println("Escreva um filme: ");
        var movie = input.nextLine();
        try {
            // Transforma "Chainsaw Man" em "Chainsaw+Man" e trata caracteres especiais
            var movieEncoded = URLEncoder.encode(movie, StandardCharsets.UTF_8);

        String adress = "https://omdbapi.com/?t=" + movieEncoded + "&apikey=2bb2525d";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(adress))
                .build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
        } catch (Exception e) {
            System.out.println("Erro ao codificar URL");
        }

    }
}
