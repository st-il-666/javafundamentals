package javafundamentals.maintask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HiUser {
    public static void main(String[] args) {
        //Приветствовать любого пользователя при вводе его имени через командную строку.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String userName = reader.readLine();
            System.out.println("Hello " + userName + "!" + "\n" + "Nice to meet you!");
        } catch (IOException e) {
            System.err.print("Input error " + e);
        }
    }
}
