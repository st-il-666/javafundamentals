package javacollections.optional;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortedLinesFromFile {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        try (FileReader fileReader = new FileReader(new File("/Users/nastassia.ilyich/Desktop/test.txt"))) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(stringList);
    }
}
