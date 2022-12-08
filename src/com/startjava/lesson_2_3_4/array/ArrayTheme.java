package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArray = {7, 1, 3, 2, 6, 4, 5};
        printInt(intArray);
        System.out.println();
        int tempNum;
        int length = intArray.length;
        for (int i = 0, j = length - 1; i <= length / 2; i++, j--) {
            tempNum = intArray[i];
            intArray[i] = intArray[j];
            intArray[j] = tempNum;
        }
        printInt(intArray);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArray = new int[10];
        length = intArray.length;
        for (int i = 0; i < 10; i++) {
            intArray[i] = i;
        }
        int result = 1;
        for (int i = 0; i < length - 1; i++) {
            result = intArray[i] == 0 || intArray[i] == 9 ? result : result * intArray[i];
            if (i > 0 && i < length - 2) {
                System.out.print(intArray[i] + " * ");
            } else if (i == length - 2) {
                System.out.print(intArray[i] + " = ");
            }
        }
        System.out.println(result);
        for (int i = 0; i < length; i++) {
            if (intArray[i] == 0 || intArray[i] == 9) {
                System.out.print(intArray[i] + " индекс " + i + " ");
            }
        }

        System.out.println("\n\n3. Удаление элементов массива");
        double[] sourceArray = new double[15];
        double[] modifiedArray = new double[15];
        int numberZero = 0;
        length = sourceArray.length;
        int middleCellIndex = length / 2;
        for (int i = 0; i < length; i++) {
            sourceArray[i] = Math.random();
        }
        for (int i = 0; i < length; i++) {
            if (sourceArray[i] > sourceArray[middleCellIndex]) {
                modifiedArray[i] = 0;
                numberZero++;
            } else {
                modifiedArray[i] = sourceArray[i];
            }
        }
        printDoubleFormat(length, sourceArray, middleCellIndex);
        System.out.println();
        printDoubleFormat(length, modifiedArray, middleCellIndex);
        System.out.println("\nКоличество обнуленных ячеек: " + numberZero);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr = new char[26];
        length = charArr.length;
        for (int i = 0; i < length; i++) {
            charArr[i] = (char) ('A' + i);
        }
        for (int i = 1; i <= length; i++) {
            for (int j = length - 1; j >= length - i; j--) {
                System.out.print(charArr[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArray = new int[30];
        int count1;
        int count2;
        for (count1 = 0; count1 < intArray.length; ) {
            int randomNum = (int) (Math.random() * 40 + 60);
            for (count2 = 0; count2 < count1; count2++) {
                if (intArray[count2] == randomNum) {
                    break;
                }
            }
            if (count2 == count1) {
                intArray[count1] = randomNum;
                count1++;
            }
        }
        Arrays.sort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
            if (i % 10 == 9) {
                System.out.println();
            }
        }

        System.out.println("\n6. Сдвиг элементов массива");
        String[] stringArr = {" ", "AA", "", "BBB", "CC", "D", " ", "E", "FF", "G", ""};
        length = 0;
        for (String s : stringArr) {
            if (!s.isBlank()) {
                length++;
            }
        }
        String[] modifiedStringArr = new String[length];
        length = stringArr.length;
        for (int i = 0, j = 0; i < length; i++) {
            int stringNum = 0;
            while (!stringArr[i].isBlank()) {
                stringNum++;
                i++;
                if (i == length) {
                    break;
                }
            }
            System.arraycopy(stringArr, i - stringNum, modifiedStringArr, j, stringNum);
            j += stringNum;
        }
        printString(stringArr);
        System.out.println();
        printString(modifiedStringArr);
    }

    private static void printInt(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void printDoubleFormat(int length, double[] sourceArray, int middleCellIndex) {
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f ", sourceArray[i]);
            if (i == middleCellIndex) {
                System.out.println();
            }
        }
    }

    private static void printString(String[] stringArr) {
        for (String s : stringArr) {
            System.out.print(s + " ");
        }
    }
}
