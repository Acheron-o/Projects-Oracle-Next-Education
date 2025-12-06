package br.com.alura.screenmatch.main;
import br.com.alura.screenmatch.modelos.Title;
import br.com.alura.screenmatch.modelos.TituloOmd;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.plaf.synth.SynthOptionPaneUI;
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
        System.out.println("Type a either a movie or series: ");
        var movie = input.nextLine();
        try {
            var movieEncoded = URLEncoder.encode(movie, StandardCharsets.UTF_8);
        String adress = "https://omdbapi.com/?t=" + movieEncoded + "&apikey=2bb2525d";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(adress)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            var json = response.body();
            System.out.println(json);
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            TituloOmd myTitleOmdb = gson.fromJson(json, TituloOmd.class);
            System.out.println("Title: " + myTitleOmdb);
            Title myTitle = new Title(myTitleOmdb.title());

        } catch (Exception e) {
            System.out.println("ERROR while codifying the URL");
        }


    }
}
