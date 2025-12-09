package br.com.alura.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PostalCodeSystem{
    public static void main(String[] args)   {
        Scanner leitura =  new Scanner(System.in);
        String busca = "";

        Gson gsong =  new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        System.out.println("Digite um qualquer CEP válido");
        busca = leitura.nextLine();
        try {

            String endereco = "https://viacep.com.br/ws/" +
                    busca +
                    "/json/";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = null;
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException  |InterruptedException e ) {
                System.out.println("Não consegui obter o endereço a partir desse CEP.");
            }

            String json = response.body();
            System.out.println(json);
            FileWriter escrita = new FileWriter("endereco.json");
            escrita.write(gsong.toJson(json));
            escrita.close();

        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca, verifique o endereço");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}