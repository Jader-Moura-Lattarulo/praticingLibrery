package exercise01;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();

        FileReader reader = new FileReader("src/personJson.json");

        PersonRecord person = gson.fromJson(reader, PersonRecord.class);

        System.out.printf("""
                Nome: %s
                Idade: %d
                Cidade: %s""", person.name(), person.age(), person.city());

        reader.close();

    }
}