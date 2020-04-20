package javacollections.optional;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class UniqueWords {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try (
                FileReader fileReader = new FileReader(new File("/Users/nastassia.ilyich/Desktop/test.txt"))) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(System.getProperty("line.separator"));
            }
         HashSet<String> listWithUniqueWords = new HashSet<>(Arrays.asList(stringBuilder.toString().toLowerCase().split("\\W+")));
            for (String s:listWithUniqueWords){
                System.out.println(s);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}