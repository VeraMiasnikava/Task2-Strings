package com.task2strings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    /*task1:
    Напишите программу, которая будет генерировать строку большой длинны
    заполненную рандомными символами русского алфавита (учитывая пробелы).
    После чего введите какое-нибудь слово через консоль и попробуйте найти первое его вхождение
    в данной строке.
    Если слово не будет найдено, увеличьте количество символов в строке или введите слово проще.
    После чего найдите все вхождения слова и выведите их количество.
    task4:
    Напишите программу, которая будет проверять валидность введенного url адреса.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите задачу:" +
                "1-работа со строкой большой длины;  " +
                "4-проверка валидности введенного url");
        int n;
        try {
            n = in.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("введено не целое число! " +
                    "По умолчанию выбрана задача 1");
            in.next();
            n = 1;
        }
        switch (n) {
            case 1:
                System.out.println("задача 1: работа со строкой большой длины ");
                BigString bigString = new BigString();
                bigString.task1();
                break;
            case 4:
                System.out.println("задача 4: проверка валидности url");
                UrlAddress urlAddress=new UrlAddress();
                urlAddress.task4();
                break;
            default:
                System.out.println("не выбрана ни одна задача");
        }
        in.close();
    }

}
