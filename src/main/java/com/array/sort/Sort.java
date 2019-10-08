package com.array.sort;

import java.util.Scanner;

public class Sort {
    private int c;
    private int a;
    private int b = 1;
    private int num = 0;
    private int[] array;
    private int numOfArray;
    Scanner in = new Scanner(System.in);

    public void arraySort() {
        // создание блока, который ловит строковые данные и выводит ошибку
        try {
            System.out.print("введите количество символов в массиве: ");
            numOfArray = in.nextInt();
            array = new int[numOfArray];
            // ввод каждого элемента массива
            for (int i = 0; i < array.length; i++) {
                System.out.print(b + " элемент = ");
                a = in.nextInt();
                b++;
                array[i] = a;
            }
            // сортировка пузырьком
            for (int k = 0; k < array.length; k++) {
                for (int l = 0; l < array.length - 1; l++) {
                    c = l;
                    // проверяем порядок чисел по возростанию
                    if (array[l] > array[c + 1]) {
                        num = array[l];
                        array[l] = array[c + 1];
                        array[c + 1] = num;
                    }
                }
            }
            // вывод значений
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("нельзя вводить строки!"); // вывод ошибки
        }
    }
}
