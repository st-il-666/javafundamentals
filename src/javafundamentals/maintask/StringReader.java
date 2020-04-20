package javafundamentals.maintask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class StringReader {
    static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        //Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter how many random numbers would you like to generate: ");
        generateRandomNumbers(readLine(reader));

        System.out.println("With moving to a new line: ");
        for (int randomNumber : numbers) {
            System.out.println(randomNumber);
        }
        System.out.println("Without moving to a new line: ");
        for (int randomNumber : numbers) {
            System.out.print(randomNumber + " ");
        }

    }

    private static int readLine(BufferedReader reader) {
        try {
            return Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.err.print("Input error " + e);
        }
        return -1;
    }

    public static void generateRandomNumbers(int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            numbers.add(random.nextInt());
        }
    }
}
