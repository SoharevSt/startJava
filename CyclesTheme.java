public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел\n");
        int srcNum = -10;
        int evenNum = 0;
        int oddNum = 0;

        do {
            if(srcNum % 2 == 0) {
                evenNum += srcNum;
            } else {
                oddNum += srcNum;
            }
            srcNum++;
        } while(srcNum <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + evenNum 
                + ", а нечетных = " + oddNum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 5;
        int num2 = 10;
        int num3 = -1;
        int minNum = 0;
        int maxNum = 0;

        if(num1 >= num2) {
            maxNum = num1;
            minNum = num2;
        } else {
            minNum = num1;
            maxNum = num2;
        }
        if(num3 >= maxNum) {
            maxNum = num3;
        } else if(num3 <= minNum) {
            minNum = num3;
        }
        for(int i = maxNum - 1; i > minNum; i--) {
            System.out.print(i + ";");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");
        srcNum = 1234;
        int tmpNum = 0;
        int sumNums = 0;
        int count = 1;
        while(count < 5) {
            tmpNum = srcNum % 10;
            srcNum /= 10;
            sumNums += tmpNum;
            count++;
            System.out.print(tmpNum);
        }
        System.out.println("\n" + sumNums);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        int j = 1;
        for(int i = 1; i < 24; i +=2, j++) {
            System.out.printf("%3d", i);
            if(j % 5 == 0) {
                System.out.println();
            }
        }
        for(; j <= 15; j++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\n5. Проверка количества двоек на четность\n");
        srcNum = 3242592;
        tmpNum = srcNum;
        int numTwos = 0;
        while(tmpNum != 0) {
            if(tmpNum % 10 == 2) {
                numTwos++;
            }
            tmpNum /= 10;
        }
        if(numTwos % 2 == 0) {
            System.out.println("число " + srcNum + " содержит " + numTwos + "(четное) количество двоек");
        } else {
            System.out.println("число " + srcNum + " содержит " + numTwos + "(нечетное) количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли\n");
        for(int i = 1; i < 6; i++) {
            for(j = 1; j < 11; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        count = 5;
        int count2 = 5;
        while(count > 0) {
            while(count2 > 0) {
                System.out.print("#");
                count2--;
            }
            System.out.println();
            count2 = --count;
        }

        count = 1;
        count2 = 1;
        do {
            do {
                System.out.print("$");
                count++;
            } while(count <= count2);
            System.out.println();
            if(count2 < 3) {
                count = 1;
                count2++;
            } else if(count2 == 3) {
                count = 3;
                count2++;
            } else {
                count = 5;
                count2++;
            }
        } while(count2 < 6);

        System.out.println("\n7. Отображение ASCII-символов\n");
        System.out.printf("%6s", "Dec");
        for(int i = 1; i < 48; i += 2) {
            System.out.println();
            System.out.printf("%5c", i);
        }
        System.out.printf("\n\n%6s", "Char");
        for(j = 98; j < 123; j += 2) {
            System.out.println();
            System.out.printf("%5c", j);
        }

        System.out.println("\n\n8. Проверка, является ли число палиндромом\n");
        srcNum = 1234321;
        int revNum = 0;
        int originNum = srcNum;

        while(srcNum != 0){
            revNum = revNum * 10 + srcNum % 10;
            srcNum = srcNum / 10;
        }
        if(originNum == revNum) {
            System.out.println("Число " + originNum + " является палиндромом");
        }
        else {
            System.out.println("Число " + originNum + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым\n");
        srcNum = 234162;
        int firstNum = srcNum / 1000;
        int lastNum = srcNum % 1000;
        int firstSum = 0;
        int lastSum = 0;

        while(firstNum != 0){
            firstSum += firstNum % 10;
            firstNum /= 10;
            lastSum += lastNum % 10;
            lastNum /= 10;
        }
        System.out.println("Сумма цифр " + srcNum / 1000 + " = " + firstSum + "\nСумма цифр " + 
                srcNum % 1000 + " = " + lastSum);
        if(firstSum == lastSum) {
            System.out.println("Число " + srcNum + " является счастливым");
        }
        else {
            System.out.println("Число " + srcNum + " не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.println("\tТАБЛИЦА ПИФАГОРА");
        System.out.printf("%4c", '|');
        for(int k = 2; k < 10; k++) {
            System.out.printf("% 3d", k);
        }
        System.out.println();
        for(int f = 1; f < 30; f++) {
            System.out.printf("%c", '-');
        }
        System.out.println();
        for (int i = 2; i < 10; i++) {
            System.out.printf("%3d|", i);
            for (j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}