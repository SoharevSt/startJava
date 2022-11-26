import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer;
        boolean isCalculate = true;
        
        Calculator calculator = new Calculator();
        while(isCalculate) {
            Scanner sc = new Scanner(System.in);
            boolean isNext = true;
            System.out.println("Введите первое число:");
            calculator.setNum1(sc.nextInt());
            System.out.println("Введите знак математической операции:");
            sc.nextLine();
            calculator.setSign(sc.nextLine().charAt(0));
            System.out.println("Введите второе число:");
            calculator.setNum2(sc.nextInt());
            System.out.println(calculator.calc(calculator.getSign(), calculator.getNum1(), 
                    calculator.getNum2()));
            sc.nextLine();
            while (isNext) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = sc.nextLine();
                if (answer.equals("yes")) {
                    isNext = false;
                } else if(answer.equals("no")) {
                    isNext = false;
                    isCalculate = false;
                }
            }
        }
    }
}