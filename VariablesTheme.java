public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль\n");

        byte numberCores = 8;
        short ram = 16;
        int rom = 512;
        long processorSpeed = 3_300_000_000L;
        float laptopWeight = 1.85f;
        double screenSize = 15.99;
        char symbol1 = 'a';
        boolean isVariable = true;
        char symbol2 = 'J';
        char symbol3 = 'V';
        char symbol4 = 'v';

        System.out.println("Количество ядер процессора " + numberCores);
        System.out.println("Объем оперативной памяти " + ram);
        System.out.println("Объем ПЗУ " + rom);
        System.out.println("Частота процессора " + processorSpeed);
        System.out.println("Вес ноутбука " + laptopWeight);
        System.out.println("Диагональ экрана " + screenSize);
        System.out.println("Просто символ \"" + symbol1 + "\"");
        System.out.println("Логическая переменная " + isVariable);

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");

        int penPrice = 100;
        int bookPrice = 200;

        System.out.println("Сумма скидки: " + (penPrice + bookPrice) * 0.11);
        System.out.println("Стоимость товаров со скидкой: " + ((penPrice + bookPrice) 
            - (penPrice + bookPrice) * 0.11));

        System.out.println("\n3. Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        System.out.println("Тип byte: " + b + " инкремент: " + ++b + " декремент: " + --b);
        System.out.println("Тип short: " + s + " инкремент: " + ++s + " декремент: " + --s);
        System.out.println("Тип int: " + i + " инкремент: " + ++i + " декремент: " + --i);
        System.out.println("Тип long: " + l + " инкремент: " + ++l + " декремент: " + --l);

        System.out.println("\n5. Перестановка значений переменных\n");
        int firstNum = 2;
        int secondNum = 5;
        int temp = 0;
        System.out.println("Перестановка с использованием третьей переменной");
        System.out.println(firstNum + " " + secondNum);
        temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;
        System.out.println(firstNum + " " + secondNum);
        System.out.println("Перестановка с использованием арифметических операций");
        System.out.println(firstNum + " " + secondNum);
        firstNum = firstNum + secondNum;
        secondNum = firstNum - secondNum;
        firstNum = firstNum - secondNum;
        System.out.println(firstNum + " " + secondNum);

        System.out.println("Перестановка с использованием побитовых операций");
        System.out.println(firstNum + " " + secondNum);
        firstNum = firstNum ^ secondNum;
        secondNum = secondNum ^ firstNum;
        firstNum = firstNum ^ secondNum;
        System.out.println(firstNum + " " + secondNum);

        System.out.println("\n6. Вывод символов и их кодов\n");
        char s1 = 35;
        char s2 = 38;
        char s3 = 64;
        char s4 = 94;
        char s5 = 95;
        System.out.println((int) s1 + " " + s1 + '\n' + (int) s2 + " " + s2 + '\n' + (int) s3 
            + " " + s3 + '\n' + (int) s4 + " " + s4 + '\n' + (int) s5 + " " + s5);

        System.out.println("\n7. Вывод количества сотен, десятков и единиц числа\n");
        int sourceNumber = 123;
        System.out.println("Число " + sourceNumber + " содержит:\n" + sourceNumber / 100 
            + " сотен\n" + sourceNumber / 10 % 10 + " десятков\n" + sourceNumber % 10 + " единиц");

        System.out.println("\n8. Вывод в консоль ASCII-арт Дюка\n");
        char tj1 = '/';
        char tj2 = '\\';
        char tj3 = '(';
        char tj4 = ')';
        char tj5 = '_';
        System.out.println("     " + tj1 + tj2);
        System.out.println("    " + tj1 + "  " + tj2);
        System.out.println("   " + tj1 + tj5 + tj3 + " " + tj4 + tj2);
        System.out.println("  " + tj1 + "      " + tj2);
        System.out.println(" " + tj1 + tj5 + tj5 + tj5 + tj5 + tj1 + tj2 + tj5 + tj5 + tj2);

        System.out.println("\n9. Вывод произведения и суммы цифр числа\n");
        sourceNumber = 345;
        System.out.println("Сумма цифр числа " + sourceNumber + " = " + (sourceNumber / 100 
            + sourceNumber / 10 % 10 + sourceNumber % 10));
        System.out.println("Произведение цифр числа " + sourceNumber + " = " + ((sourceNumber / 100) 
            * (sourceNumber / 10 % 10) * (sourceNumber % 10)));

        System.out.println("\n10. Вывод времени\n");
        sourceNumber = 86399;
        System.out.println(sourceNumber / 3600 + ":" + (sourceNumber - sourceNumber / 3600 * 3600) 
            / 60 + ":" + sourceNumber % 60);
    }
}