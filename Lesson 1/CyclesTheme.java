public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел\n");
        int startRange = -10;
        int sumEvenNum = 0;
        int sumOddNum = 0;

        do {
            if(startRange % 2 == 0) {
                sumEvenNum += startRange;
            } else {
                sumOddNum += startRange;
            }
            startRange++;
        } while(startRange <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEvenNum + 
                ", а нечетных = " + sumOddNum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 5;
        int num2 = 10;
        int num3 = -1;
        int minNum = num1;
        int maxNum = num2;

        if(num1 > maxNum) {
            maxNum = num1;
        }
        if (num3 > maxNum) {
            maxNum = num3;
        }
        if(num2 < minNum) {
            minNum = num2;
        }
        if(num3 < minNum) {
            minNum = num3;
        }
        for(int i = maxNum - 1; i > minNum; i--) {
            System.out.print(i + ";");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");
        int srcNum = 1234;
        int sumDigits = 0;
        while(srcNum > 0) {
            int digit = srcNum % 10;
            srcNum /= 10;
            sumDigits += digit;
            System.out.print(digit);
        }
        System.out.println("\n" + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        int numPerLine = 1;
        int charByNum = 3;
        int numLimit = 5;
        for(int i = 1; i < 24; i += 2, numPerLine++) {
            System.out.printf("%3d", i);
            if(numPerLine % numLimit == 0) {
                System.out.println();
            }
        }
        for(; numPerLine <= charByNum * numLimit; numPerLine++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\n5. Проверка количества двоек на четность\n");
        srcNum = 3242522;
        int copySrcNum = srcNum;
        int numTwos = 0;
        while(copySrcNum != 0) {
            if(copySrcNum % 10 == 2) {
                numTwos++;
            }
            copySrcNum /= 10;
        }
        System.out.println("число " + srcNum + " содержит " + numTwos + 
                (numTwos % 2 == 0 ? " (четное)" : " (нечетное)") + " количество двоек");

        System.out.println("\n6. Отображение фигур в консоли\n");
        for(int i = 1; i < 6; i++) {
            for(int j = 1; j < 11; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int rowCount = 5;
        int charCount = 5;
        while(rowCount > 0) {
            while(charCount > 0) {
                System.out.print("#");
                charCount--;
            }
            System.out.println();
            charCount = --rowCount;
        }

        charCount = 1;
        rowCount = 1;
        do {
            do {
                System.out.print("$");
                charCount++;
            } while(charCount <= rowCount);
            System.out.println();
            if(rowCount < 3) {
                charCount = 1;
            } else if(rowCount == 3) {
                charCount = 3;
            } else {
                charCount = 5;
            }
            rowCount++;
        } while(rowCount < 6);

        System.out.println("\n7. Отображение ASCII-символов\n");
        System.out.printf("%6s", "Dec");
        for(int i = 1; i < 48; i += 2) {
            System.out.printf("\n%5c", i);
        }
        System.out.printf("\n\n%6s", "Char");
        for(int j = 98; j < 123; j += 2) {
            System.out.printf("\n%5c", j);
        }

        System.out.println("\n\n8. Проверка, является ли число палиндромом\n");
        srcNum = 1234321;
        int revNum = 0;
        copySrcNum = srcNum;

        while(srcNum != 0) {
            revNum = revNum * 10 + srcNum % 10;
            srcNum /= 10;
        }
        System.out.println("Число " + copySrcNum + (copySrcNum == revNum ? "" : " не") + 
                " является палиндромом");

        System.out.println("\n9. Определение, является ли число счастливым\n");
        startRange = 234162;
        int topHalf = startRange / 1000;
        int bottomHalf = startRange % 1000;
        int topSum = 0;
        int bottomSum = 0;

        while(topHalf > 0) {
            topSum += topHalf % 10;
            topHalf /= 10;
            bottomSum += bottomHalf % 10;
            bottomHalf /= 10;
        }
        System.out.println("Сумма цифр " + startRange / 1000 + " = " + topSum + "\nСумма цифр " + 
                startRange % 1000 + " = " + bottomSum);
        System.out.println("Число " + startRange + (topSum == bottomSum ? "" : " не") + 
                " является счастливым");

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.println("\tТАБЛИЦА ПИФАГОРА");
        System.out.printf("%4c", '|');
        for(int i = 2; i < 10; i++) {
            System.out.printf("% 3d", i);
        }
        System.out.println();
        for(int i = 1; i < 30; i++) {
            System.out.printf("%c", '-');
        }
        System.out.println();
        for (int i = 2; i < 10; i++) {
            System.out.printf("%3d|", i);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}