public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 21;
        boolean ifMale = false;
        float height = 1.75f;
        char firstNameLetter = "Mark".charAt(0);

        if(age > 20) {
            System.out.println("Ваш возраст подходит");
        } else {
            System.out.println("Вы слишком молоды");
        }
        if(!ifMale) {
            System.out.println("Ваш пол женский");
        } else {
            System.out.println("Ваш пол мужской");
        }
        if(height < 1.80) {
            System.out.println("Ваш рост слишком мал");
        } else {
            System.out.println("Ваш рост подходит");
        }
        if(firstNameLetter == 'M') {
            System.out.println("Ваше имя правильное");
        } else {
            System.out.println("Ваше имя неправильное");
        }

        System.out.println("\n2. Поиск max и min числа\n");
        int first = -4;
        int second = 5;

        if(first > second) {
            System.out.println("max: " + first + "\nmin: " + second);
        } else if(first < second) {
            System.out.println("max: " + second + "\nmin: " + first);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Проверка числа\n");

        if(first == 0) {
            System.out.println(first + " - это число ноль!");
        } else if(first > 0) {
            if(first % 2 == 0) {
                System.out.println(first + " - это положительное четное число");
            } else {
                System.out.println(first + " - это положительное нечетное число");
            }
        } else {
            if(first % 2 == 0) {
                System.out.println(first + " - это отрицательное четное число");
            } else {
                System.out.println(first + " - это отрицательное нечетное число");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        first = 234;
        second = 432;
        boolean isFlag = true;

        System.out.println("Сравниваем числа " + first + " и " + second);
        if(first / 100 == second / 100) {
            System.out.println("Цифры сотен одинаковы и равны: " + first / 100);
            isFlag = false;
        }
        if(first / 10 % 10 == second / 10 % 10) {
            System.out.println("Цифры десятков одинаковы и равны: " + first / 10 % 10);
            isFlag = false;
        }
        if(first % 10 == second % 10) {
            System.out.println("Цифры единиц одинаковы и равны: " + first % 10);
            isFlag = false;
        }
        if(isFlag) {
            System.out.println("Одинаковых цифр нет");
        }

        System.out.println("\n5. Определение символа по его коду\n");
        char symbol = '\u0057';

        if(symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + "-большая буква");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(symbol + "-маленькая буква");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + "-цифра");
        } else {
            System.out.println(symbol + "-не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %\n");
        float deposit = 300000;
        float interest = 0;

        if(deposit < 100000) {
            interest = (float) (deposit * 0.05);
        } else if(deposit > 300000) {
            interest = (float) (deposit * 0.1);
        } else {
            interest = (float) (deposit * 0.07);
        }
        System.out.println("Сумма вклада " + deposit + "\nНачисленный процент " + interest 
                + "\nИтоговая сумма " + (deposit + interest));

        System.out.println("\n7. Определение оценки по предметам\n");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyGrade = 0;
        int programmingGrade = 0;

        if(historyPercent <= 60) {
            historyGrade = 2;
        } else if(historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if(historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        } else if(historyPercent > 91) {
            historyGrade = 5;
        }
        if(programmingPercent <= 60) {
            programmingGrade = 2;
        } else if(programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if(programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        } else if(programmingPercent > 91) {
            programmingGrade = 5;
        }
        System.out.println(historyGrade + " История\n" + programmingGrade + " Программирование\n" 
                + (historyGrade + programmingGrade) / 2.0 + " Средний балл\n" 
                + (historyPercent + programmingPercent) / 2.0 + " Средний процент");

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