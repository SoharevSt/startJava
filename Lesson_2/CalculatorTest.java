import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer = "";

        Calculator calculator = new Calculator();
        while(!answer.equals("no")) {
            answer = "";
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое число:");
            calculator.setNum1(sc.nextInt());
            System.out.println("Введите знак математической операции:");
            sc.nextLine();
            calculator.setSign(sc.nextLine().charAt(0));
            System.out.println("Введите второе число:");
            calculator.setNum2(sc.nextInt());
            System.out.println(calculator.calc());
            sc.nextLine();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = sc.nextLine();
            }
        }
    }
}