package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArray = {7, 1, 3, 2, 6, 4, 5};
        printInt(intArray);
        int length = intArray.length;
        for (int i = 0; i < length; i++) {
            length--;
            int tempNum = intArray[i];
            intArray[i] = intArray[length];
            intArray[length] = tempNum;
        }
        printInt(intArray);

        System.out.println("\n2. Вывод произведения элементов массива");
        intArray = new int[10];
        length = intArray.length;
        for (int i = 0; i < length; i++) {
            intArray[i] = i;
        }
        int prodDigits = 1;
        for (int i = 1; i < length - 1; i++) {
            prodDigits *= i;
            System.out.print(intArray[i] + (i < length - 2 ? " * " : " = "));
        }
        System.out.println(prodDigits);
        System.out.print(intArray[0] + ", " + intArray[9]);

        System.out.println("\n\n3. Удаление элементов массива");
        double[] doubleArray = new double[15];
        int numberZero = 0;
        length = doubleArray.length;
        for (int i = 0; i < length; i++) {
            doubleArray[i] = Math.random();
        }
        double middleCellNumber = doubleArray[length / 2];
        printDoubleFormat(length, doubleArray);
        for (int i = 0; i < length; i++) {
            if (doubleArray[i] > middleCellNumber) {
                doubleArray[i] = 0;
                numberZero++;
            }
        }
        printDoubleFormat(length, doubleArray);
        System.out.println("Количество обнуленных ячеек: " + numberZero);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] uppercaseLetterArray = new char[26];
        length = uppercaseLetterArray.length;
        for (int i = 0; i < length; i++) {
            uppercaseLetterArray[i] = (char) ('A' + i);
        }
        for (int i = 1; i <= length; i++) {
            for (int j = length - 1; j >= length - i; j--) {
                System.out.print(uppercaseLetterArray[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArray = new int[30];
        int i;
        int j;
        for (i = 0; i < intArray.length; ) {
            int randomNum = (int) (Math.random() * 40 + 60);
            for (j = 0; j < i; j++) {
                if (intArray[j] == randomNum) {
                    break;
                }
            }
            if (j == i) {
                intArray[i] = randomNum;
                i++;
            }
        }
        Arrays.sort(intArray);
        for (i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
            if (i % 10 == 9) {
                System.out.println();
            }
        }

        System.out.println("\n6. Сдвиг элементов массива");
        String[] srcArray = {" ", "AA", "", "BBB", "CC", "D", " ", "E", "FF", "G", ""};
        length = 0;
        for (String s : srcArray) {
            if (!s.isBlank()) {
                length++;
            }
        }
        String[] destArray = new String[length];
        length = srcArray.length;
        for (i = 0, j = 0; i < length; i++) {
            int stringNum = 0;
            while (!srcArray[i].isBlank() && i < length - 1) {
                stringNum++;
                i++;
            }
            System.arraycopy(srcArray, i - stringNum, destArray, j, stringNum);
            j += stringNum;
        }
        printString(srcArray);
        printString(destArray);
    }

    private static void printInt(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printDoubleFormat(int length, double[] sourceArray) {
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f ", sourceArray[i]);
            if (i == length / 2) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void printString(String[] stringArray) {
        for (String s : stringArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
