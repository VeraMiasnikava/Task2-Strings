package com.task2strings;

import java.util.Random;
import java.util.Scanner;

public class BigString {
    private StringBuilder bigString = new StringBuilder(" ");
    private Random random = new Random();
    private int length = 500;
    private static final char array[] = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и',
            'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'й',
            'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь',
            'э', 'ю', 'я', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    void randomBigString() {
        int index;
        for (int i = 0; i < length; i++) {
            index = random.nextInt(array.length);
            bigString.append(array[index]);
        }
        bigString.append(" ");
    }

    boolean firstNumberOfWord(String word) {
        word = " " + word + " ";
        int index;
        index = bigString.indexOf(word);
        if (index == -1) {
            System.out.println("Слово в строке не найдено");
            return false;
        } else {
            System.out.println("Номер первого вхождения слова=" + index);
            return true;
        }
    }

    void allNumbersOfWord(String word) {
        word = " " + word + " ";
        int index = -1, i = 0, count = 0;
        System.out.println("Номера вхождения слова:");
        while (true) {
            index = bigString.indexOf(word, i);
            if (index == -1) {
                break;
            } else {
                System.out.println(index);
                i = index + 1;
                count++;
            }
        }
        System.out.println("Количество вхождений слова=" + count);
    }

    void task1(){
        Scanner in = new Scanner(System.in);
        this.randomBigString();
        System.out.println(this.toString());
        do {
            System.out.println("введите искомое слово или 0 для окончания работы с программой");
            String word = in.nextLine();
            if (word.isEmpty()){
                System.out.println("введена пустая строка, повторите попытку");
            }else if (word.equals("0")) {
                break;
            } else {
                boolean b;
                b = this.firstNumberOfWord(word);
                if (b) {
                    this.allNumbersOfWord(word);
                    break;
                } else {
                    System.out.println("повторите попытку");
                }
            }
        }while(true);
        in.close();
    }

    @Override
    public String toString() {
        return String.format("Получили строку%n%s%n", bigString.toString());

    }


}
