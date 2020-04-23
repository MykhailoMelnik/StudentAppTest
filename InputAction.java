import java.util.Scanner;

public class InputAction {
    private static Integer resultInteger;
    private static Double resultDouble;

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Integer inputInteger() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            resultInteger = scanner.nextInt();
        } else {
            System.out.println("Помилка введіть лише число test");
            inputInteger();
        }
        return resultInteger;
    }

    public static Double inputDouble() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            resultDouble = scanner.nextDouble();
        } else {
            System.out.println("Помилка введіть число з плаваючою точкою test");
            inputDouble();
        }
        return resultDouble;
    }

}
