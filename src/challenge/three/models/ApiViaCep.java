package challenge.three.models;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiViaCep {
    public static Address searchCep(String cep) {
        String url = String.format("%s%s%s", "https://viacep.com.br/ws/",
                cep.replaceAll("[.-]", "").trim(), "/json/");

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request =
                HttpRequest.newBuilder().uri(URI.create(url)).build();

        try {
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Address.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}