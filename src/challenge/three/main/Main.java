package challenge.three.main;

import challenge.three.models.Address;
import challenge.three.models.ApiViaCep;
import challenge.three.models.WriteFile;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String search = "";

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting().create();


        try {
            WriteFile write = new WriteFile();
            while (!search.equalsIgnoreCase("exit")) {
                System.out.print("Enter your cep number: ");
                search = scanner.nextLine();

                if (search.equalsIgnoreCase("exit")) {
                    break;
                }

                write.openFile(search.replaceAll("[.-]", "").trim());
                Address address = ApiViaCep.searchCep(search);

                write.writeToFile(gson.toJson(address));
                write.closeFile();

                System.out.println("\n" + address);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
