package javafundamentals.optionaltask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NumbersFinding {
    static int minLength = Integer.MAX_VALUE;
    static int maxLength = 0;
    static ArrayList<Integer> theShortest = new ArrayList<>();
    static ArrayList<Integer> theLongest = new ArrayList<>();
    static ArrayList<Integer> smallerThanAverage = new ArrayList<>();
    static ArrayList<Integer> biggerThanAverage = new ArrayList<>();
    static double averageLength;
    static int numberWithTheSmallestDuplicatedDigits;
    static int allDigitsEvenCount;
    static int oddDigits;
    static int evenDigits;
    static ArrayList<Integer> equalOddEvenDigitsNum = new ArrayList<>();
    static int digitsInOrderOfMagnitude = 0;
    static int numbersWithUniqueDigits;

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> numbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (String enteredNumber = reader.readLine(); enteredNumber != null; enteredNumber = reader.readLine()) {
                numbers.add(Integer.parseInt(enteredNumber));
            }
        } catch (NumberFormatException ignored) {
        }
        findMinMaxLengthValue(numbers);
        System.out.println("Minimum value has: " + theShortest.toString() + " length is " + minLength + "\nMaximum value has: " + theLongest.toString() + " length is: " + maxLength);
        System.out.println("\nNumbers are sorted in ascending order: ");
        getAscendingOrder(numbers);
        System.out.println("\nNumbers are sorted in descending order: ");
        getDescendingOrder(numbers);
        getNumbersLowerThanAverageLength(numbers);
        System.out.println("\nAverage length is: " + averageLength + " and numbers which length is smaller: " + smallerThanAverage.toString());
        getNumbersHigherThanAverageLength(numbers);
        System.out.println("Average length is: " + averageLength + " and numbers which length is higher: " + biggerThanAverage.toString());
        findNumberWithTheSmallestUniqueNumbers(numbers);
        System.out.println("\nNumber with the smallest unique digits is: " + numberWithTheSmallestDuplicatedDigits);
        findNumbersWithEvenDigits(numbers);
        System.out.println("\nAll even digits has(have) " + allDigitsEvenCount + " number(s). \nEqual quantity of odd/even numbers has(have) " + equalOddEvenDigitsNum.size() + " number(s).");
        findDigitsInOrderOfMagnitude(numbers);
        System.out.println("\nFollowing number has digits in magnitude order: " + digitsInOrderOfMagnitude);
        findNumberWithUniqueDigits(numbers);
        System.out.println("\nFirst number with unique digits is: " + numbersWithUniqueDigits);
    }

    public static void findMinMaxLengthValue(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            int length = String.valueOf(number).length();
            if (length < minLength) {
                theShortest.clear();
                minLength = length;
                theShortest.add(number);
            } else if (length == minLength) {
                theShortest.add(number);
            } else if (length > maxLength) {
                theLongest.clear();
                maxLength = length;
                theLongest.add(number);
            } else if (length == maxLength) {
                theLongest.add(number);
            }
        }
    }

    public static void getAscendingOrder(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) > numbers.get(j)) {
                    int tmp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, tmp);
                }
            }
        }
        for (Integer number : numbers) {
            int length = String.valueOf(number).length();
            System.out.println("Number " + number + ". It's length is: " + length);
        }
    }

    public static void getDescendingOrder(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) < numbers.get(j)) {
                    int tmp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, tmp);
                }
            }
        }
        for (Integer number : numbers) {
            int length = String.valueOf(number).length();
            System.out.println("Number " + number + ". It's length is: " + length);
        }
    }

    public static void getAverageLength(ArrayList<Integer> numbers) {
        ArrayList<Integer> lengthList = new ArrayList<>();
        for (Integer number : numbers) {
            int length = String.valueOf(number).length();
            lengthList.add(length);
        }
        OptionalDouble average = numbers.stream().mapToInt(e -> e).average();
        if (average.isPresent()) {
            averageLength = average.getAsDouble();
        }
    }

    public static void getNumbersLowerThanAverageLength(ArrayList<Integer> numbers) {
        getAverageLength(numbers);
        for (Integer number : numbers) {
            if (number < averageLength) {
                smallerThanAverage.add(number);
            }
        }
    }

    public static void getNumbersHigherThanAverageLength(ArrayList<Integer> numbers) {
        getAverageLength(numbers);
        for (Integer number : numbers) {
            if (number > averageLength) {
                biggerThanAverage.add(number);
            }
        }
    }

    public static List<Integer> digitsInNumber(int number) {
        String n = Integer.toString(number);
        char[] charArray = n.toCharArray();
        List<Integer> digits = new ArrayList<>();
        for (char value : charArray) {
            int c = Character.getNumericValue(value);
            digits.add(c);
        }
        return digits;
    }

    public static void findNumberWithTheSmallestUniqueNumbers(ArrayList<Integer> numbers) {
        int smallestUniqueNumberCount = 10;
        int count;
        for (Integer number : numbers) {
            Set<Integer> set = new HashSet<>(digitsInNumber(number));
            count = set.size();
            if (count < smallestUniqueNumberCount) {
                smallestUniqueNumberCount = count;
                numberWithTheSmallestDuplicatedDigits = number;
            }
        }
    }

    public static boolean allDigitsEven(int number) {
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;

            if (digit % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void equalEvenOddDigits(int number) {
        oddDigits = 0;
        evenDigits = 0;
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            if (digit % 2 != 0) {
                oddDigits++;
            } else
                evenDigits++;
        }
    }

    public static void findNumbersWithEvenDigits(ArrayList<Integer> numbers) {
        for (int number : numbers) {
            if (allDigitsEven(number)) {
                allDigitsEvenCount++;
            }
            equalEvenOddDigits(number);
            if (oddDigits == evenDigits) {
                equalOddEvenDigitsNum.add(number);
            }
        }
    }

    public static boolean allDigitsInMagnitudeOrder(List<Integer> digits) {
        for (int i = 0; i < digits.size() - 1; i++) {
            if (digits.get(i) > digits.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void findDigitsInOrderOfMagnitude(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            if (digitsInOrderOfMagnitude == 0) {
                List<Integer> digits = digitsInNumber(number);
                if (allDigitsInMagnitudeOrder(digits)) {
                    digitsInOrderOfMagnitude = number;
                    return;
                }
            }
        }
    }

    public static boolean numberWithUniqueDigits(int number) {
        List<Integer> digits = digitsInNumber(number);
        Set<Integer> set = new HashSet<>(digits);
        return set.size() == digits.size();
    }

    public static void findNumberWithUniqueDigits(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            if (numberWithUniqueDigits(number)) {
                numbersWithUniqueDigits = number;
                return;
            }
        }
    }
}
