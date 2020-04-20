package javafundamentals.maintask;
// Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

public class ArgumentCount {

    public static void main(String[] args) {
        int sum = 0;
        int mulres = 1;

        if ((args == null) || (args.length == 0)) {
            System.out.println("There are no arguments");
        } else {
            for (int i = 1; i < args.length; i++) {
                if (isInteger(args[i])) {
                    sum += Integer.parseInt(args[i]);
                    mulres *= Integer.parseInt(args[i]);
                }
            }

            System.out.println("Sum is: " + sum + "\n" + "Product of all numbers is: " + mulres);
        }
    }

    public static boolean isInteger(String arg) {
        if (arg == null) {
            return false;
        }

        try {
            Integer.parseInt(arg);
        } catch (NumberFormatException e) {
            System.out.println("This argument is not an Integer: \"" + arg + "\", try again");
            return false;
        }

        return true;
    }
}


