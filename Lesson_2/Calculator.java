public class Calculator {
    private char sign;
    private int num1;
    private int num2;

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int calc() {
        int result = 1;
        switch (sign) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            case '%' -> result = num1 % num2;
            case '^' -> {
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
            }
            default -> {
                System.out.println("Вам нужен другой калькулятор");
                result = 0;
            }
        }
        return result;
    }
}