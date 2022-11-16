public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 21;
        boolean maleGender = false;
        float height = 1.75f;
        char capitalLetter = "Mark".charAt(0);

        if(age > 20) {
            System.out.println("Ваш возраст подходит");
        } else {
            System.out.println("Вы слишком молоды");
        }
        if(!maleGender) {
            System.out.println("Ваш пол женский");
        } else {
            System.out.println("Ваш пол мужской");
        }
        if(height < 1.80) {
            System.out.println("Ваш рост слишком мал");
        } else {
            System.out.println("Ваш рост подходит");
        }
        if(capitalLetter == 'M') {
            System.out.println("Ваше имя начинается на M");
        } else if(capitalLetter == 'I') {
            System.out.println("Ваше имя начинается на I");
        } else {
            System.out.println("Ваше имя неправильное");
        }

        System.out.println("\n2. Поиск max и min числа\n");
        int num1 = -4;
        int num2 = 5;

        if(num1 > num2) {
            System.out.println("max: " + num1 + "\nmin: " + num2);
        } else if(num1 < num2) {
            System.out.println("max: " + num2 + "\nmin: " + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Проверка числа\n");
        num1 = 4;
        if(num1 == 0) {
            System.out.println(num1 + " - это число ноль!");
        } else {
            if(num1 % 2 == 0) {
                System.out.print(num1 + " - это четное");
            } else {
                System.out.print(num1 + " - это нечетное");
            }
            if(num1 > 0) {
                System.out.println(" положительное число");
            } else {
                System.out.println(" отрицательное число");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        num1 = 234;
        num2 = 432;
        boolean isEqual = false;

        System.out.println("Сравниваем числа " + num1 + " и " + num2);
        if(num1 / 100 == num2 / 100) {
            System.out.println("Цифры сотен одинаковы и равны: " + num1 / 100);
            isEqual = true;
        }
        if(num1 / 10 % 10 == num2 / 10 % 10) {
            System.out.println("Цифры десятков одинаковы и равны: " + num1 / 10 % 10);
            isEqual = true;
        }
        if(num1 % 10 == num2 % 10) {
            System.out.println("Цифры единиц одинаковы и равны: " + num1 % 10);
            isEqual = true;
        }
        if(!isEqual) {
            System.out.println("Одинаковых цифр нет");
        }

        System.out.println("\n5. Определение символа по его коду\n");
        char someChar = '\u0057';

        if(someChar >= 'A' && someChar <= 'Z') {
            System.out.println(someChar + "-большая буква");
        } else if (someChar >= 'a' && someChar <= 'z') {
            System.out.println(someChar + "-маленькая буква");
        } else if (someChar >= '0' && someChar <= '9') {
            System.out.println(someChar + "-цифра");
        } else {
            System.out.println(someChar + "-не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %\n");
        float deposit = 300000;
        float interest = 0.07f;

        if(deposit < 100000) {
            interest = 0.05f;
        } else if(deposit > 300000) {
            interest = 0.1f;
        }
        System.out.println("Сумма вклада " + deposit + "\nНачисленный процент " + interest * 
            deposit + "\nИтоговая сумма " + (deposit + interest * deposit));

        System.out.println("\n7. Определение оценки по предметам\n");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyGrade = 2;
        int programmingGrade = 2;

        if(historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if(historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        } else if(historyPercent > 91) {
            historyGrade = 5;
        }
        if(programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if(programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        } else if(programmingPercent > 91) {
            programmingGrade = 5;
        }
        System.out.println(historyGrade + " История\n" + programmingGrade + " Программирование\n" + 
            (historyGrade + programmingGrade) / 2.0 + " Средний балл\n" + 
            (historyPercent + programmingPercent) / 2.0 + " Средний процент");

        System.out.println("\n8. Расчет прибыли за год\n");
        int rentalPrice = 5000;
        int primeCost = 9000;
        int sales = 13000;
        int yearlyProfit = (sales - primeCost - rentalPrice) * 12;

        if(yearlyProfit > 0) {
            System.out.println("прибыль за год: +" + yearlyProfit + " руб.");
        } else {
            System.out.println("прибыль за год: " + yearlyProfit + " руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот\n");
        int sum = 567;
        int hundredsInStock = 10;
        int tensInStock = 5;
        int onesInStock = 50;
        int needHundreds = sum / 100;
        int needTens = sum / 10 % 10;
        int needOnes = sum % 10;

        if(needHundreds > hundredsInStock) {
            needTens = (needHundreds - hundredsInStock) * 10 + needTens;
            needHundreds = hundredsInStock;
        }
        if(needTens > tensInStock) {
            needOnes = (needTens - tensInStock) * 10 + needOnes;
            needTens = tensInStock;
        }
        if(needOnes > onesInStock) {
            System.out.println("Сумму " + sum + " выдать невозможно");
        } else {
            System.out.println("К выдаче:\n" + needHundreds + " сотен\n" + needTens + " десяток\n" 
                + needOnes + " единичек\nИтого: " + (needHundreds * 100 + needTens * 10 + needOnes));
        }
    }
}