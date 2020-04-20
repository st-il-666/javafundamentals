package javafundamentals.maintask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonthDetection {
    //Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
    public static final String[] MONTHS = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};

        static void printMonth(int month) {
            String result;
            try {
                result = MONTHS[month - 1];
                System.out.println("This is " + result + ".");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("There is no such month.");
            }
        }

        public static void main(String[] args) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the number of month: ");
            try {
            int number = Integer.parseInt(reader.readLine());
            printMonth(number);
            } catch (NumberFormatException | IOException e) {
                System.out.println("There is a problem while parsing, may be you have entered smth wrong?");
            }
        }
    }
