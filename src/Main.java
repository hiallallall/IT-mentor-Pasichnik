import java.util.Scanner;

public class Main {
    static int x;
    static int y;
    public static int calculate(String operand, int x, int y) {
        return switch (operand) {
            case "-" -> x - y;
            case "+" -> x + y;
            case "/" -> x / y;
            case "*" -> x * y;
            default -> throw new Error("Неверный операнд");
        };
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ввести:");
        String string = s.nextLine();
        String[] strArray = string.split(" ");
        if (strArray.length != 3) {
            throw new Error("т.к. строка не удовлетворяет заданию");
        }
        String operand = strArray[1];
        x = Integer.parseInt(strArray[0]);
        y = Integer.parseInt(strArray[2]);
        if (x > 10 || x < 0 || y > 10 || y < 0) {
            throw new Error("Числа должны быть больше 0 и меньше 11");
        }
        System.out.println(calculate(operand,x,y));
    }
}
