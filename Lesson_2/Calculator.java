public class Calculator {
    char sign;
    int num1;
    int num2;

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int calc(char sign, int num1, int num2) {
        int result;
        switch (sign) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            case '%' -> result = num1 % num2;
            case '^' -> {
                int r = 1;
                for (int i = 1; i <= num2; i++) {
                    r *= num1;
                }
                result = r;
            }
            default -> {
                System.out.println("Вам нужен другой калькулятор");
                result = -1;
            }
        }
        return result;
    }
}