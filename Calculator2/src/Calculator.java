import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введиде значение: Пример (1 + 2)");
            String input = scanner.nextLine();
            String[] str = input.split(" ");
            if (str.length <= 2) {
                throw new Exception("Строка не является математической операцией или пропущен пробел между оператором и операндом");
            }
            if (str[0].length() > 2 || str[2].length() > 2) {
                throw new Exception("Не удовлетворяет условию (вводятся только целые числа от 1 до 10)");
            }
            int a = Integer.parseInt(str[0]);
            String c = str[1];
            char operator = c.charAt(0);
            System.out.printf("Резульат: ");
            int b = Integer.parseInt(str[2]);
            if (str.length > 3) {
                throw new Exception("Формат математической операции не удовлетворяет заданию - два целых числа и одно из действии (+, -, /, *)");
            }
            if (b <= 0 ) {
                throw new Exception("На 0 делить нельзя");
            }
            else if (a <= 0 || a > 10 || b <= 1 || b > 10) {
                throw new Exception("Введённое значение не удовлетворяет условию (a и b - целые числа от 1 до 10)");
            }
            switch (operator) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("Символ не является математической операцией");
            }
        }
    }
}