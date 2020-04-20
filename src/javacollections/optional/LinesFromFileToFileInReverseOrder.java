package javacollections.optional;

import java.io.*;
import java.util.*;

public class LinesFromFileToFileInReverseOrder {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        try (FileReader fileReader = new FileReader(new File("/Users/nastassia.ilyich/Desktop/test.txt"))) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.reverse(stringList);

        try (FileWriter writer = new FileWriter(new File("/Users/nastassia.ilyich/Desktop/test2.txt"))) {
            for (String s : stringList) {
                writer.write(s + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
