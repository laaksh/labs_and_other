package labs.LabThird;

import com.google.gson.Gson;

import com.google.gson.stream.JsonReader;
import labs.LabThird.controller.*;
import labs.LabThird.model.University;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LabThird {
    private static final String PATH = "src/main/resources/u.json";

    public static void main(String[] args) throws IOException {
        UniversityCreator c = new UniversityCreator(new Scanner(System.in));
        University u = c.createUniversity();
        System.out.println(u.toString());

        Gson gson = new Gson();
        String json = gson.toJson(u);

        File file = new File(PATH);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(json);
        fileWriter.flush();
        fileWriter.close();

        JsonReader jsonReader = new JsonReader(new FileReader(file));
        University fromJsonToUniversity = gson.fromJson(jsonReader, University.class);

        if (u.equals(fromJsonToUniversity)) {
            System.out.println("EQUALS");
        }
    }
}
