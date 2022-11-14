public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль\n");

        byte numberCores = 8;
        short ram = 16;
        int rom = 512;
        long processorSpeed = 3_300_000_000L;
        float laptopWeight = 1.85f;
        double screenSize = 15.99;
        char chipset = 'a';
        boolean isNew = true;

        System.out.println("Количество ядер процессора " + numberCores);
        System.out.println("Объем оперативной памяти " + ram);
        System.out.println("Объем ПЗУ " + rom);
        System.out.println("Частота процессора " + processorSpeed);
        System.out.println("Вес ноутбука " + laptopWeight);
        System.out.println("Диагональ экрана " + screenSize);
        System.out.println("Производитель процессора \"" + chipset + "\"");
        System.out.println("Компьютер новый " + isNew);

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");

        int penPrice = 100;
        int bookPrice = 200;
        int totalCost = penPrice + bookPrice;

        System.out.println("Сумма скидки: " + totalCost * 0.11);
        System.out.println("Стоимость товаров со скидкой: " + (totalCost - totalCost * 0.11));

        System.out.println("\n3. Вывод слова JAVA\n");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");

        byte byteType = 127;
        short shortType = 32767;
        int intType = 2147483647;
        long longType = 9223372036854775807L;

        System.out.println("Тип byte: " + byteType + " инкремент: " + ++byteType + " декремент: " 
                + --byteType);
        System.out.println("Тип short: " + shortType + " инкремент: " + ++shortType + " декремент: " 
                + --shortType);
        System.out.println("Тип int: " + intType + " инкремент: " + ++intType + " декремент: " + 
                --intType);
        System.out.println("Тип long: " + longType + " инкремент: " + ++longType + " декремент: " 
                + --longType);

        System.out.println("\n5. Перестановка значений переменных\n");

        int num1 = 2;
        int num2 = 5;
        int temp = num1;

        System.out.println("Перестановка с использованием третьей переменной");
        System.out.println(num1 + " " + num2);
        num1 = num2;
        num2 = temp;
        System.out.println(num1 + " " + num2);
        System.out.println("Перестановка с использованием арифметических операций");
        System.out.println(num1 + " " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println(num1 + " " + num2);

        System.out.println("Перестановка с использованием побитовых операций");

        System.out.println(num1 + " " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println(num1 + " " + num2);

        System.out.println("\n6. Вывод символов и их кодов\n");

        char octothorp = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char underscore = '_';

        System.out.println((int) octothorp + " " + octothorp + '\n' + (int) ampersand + " " 
                + ampersand + '\n' + (int) at + " " + at + '\n' + (int) caret + " " + caret + '\n' 
                + (int) underscore + " " + underscore);

        System.out.println("\n7. Вывод количества сотен, десятков и единиц числа\n");

        int sourceNumber = 123;
        System.out.println("Число " + sourceNumber + " содержит:\n" + sourceNumber / 100 
                + " сотен\n" + sourceNumber / 10 % 10 + " десятков\n" + sourceNumber % 10 + " единиц");

        System.out.println("\n8. Вывод в консоль ASCII-арт Дюка\n");

        char slash = '/';
        char backslash = '\\';
        char openParenthesis = '(';
        char closeParenthesis = ')';

        System.out.println("     " + slash + backslash);
        System.out.println("    " + slash + "  " + backslash);
        System.out.println("   " + slash + underscore + openParenthesis + " " + closeParenthesis 
                + backslash);
        System.out.println("  " + slash + "      " + backslash);
        System.out.println(" " + slash + underscore + underscore + underscore + underscore + slash 
                + backslash + underscore + underscore + backslash);

        System.out.println("\n9. Вывод произведения и суммы цифр числа\n");

        sourceNumber = 345;
        int ones = sourceNumber % 10;
        int tens = sourceNumber / 10 % 10;
        int hunreds = sourceNumber / 100;

        System.out.println("Сумма цифр числа " + sourceNumber + " = " + (ones + tens + hunreds));
        System.out.println("Произведение цифр числа " + sourceNumber + " = " + (ones * tens * hunreds));

        System.out.println("\n10. Вывод времени\n");

        sourceNumber = 86399;
        System.out.println(sourceNumber / 3600 + ":" + (sourceNumber - sourceNumber / 3600 * 3600) 
                / 60 + ":" + sourceNumber % 60);
    }
}