package com.task2strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlAddress {
    private String urlAddress;

    boolean testUrlAddress(){
        Pattern pattern = Pattern.compile("(https?://)*([a-zA-Z]+\\.)+(com|by|ua|ru|edu)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(urlAddress);
        return matcher.matches();
    }

    void task4() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("введите url-адрес или 0 для окончания работы с программой");
            urlAddress = in.nextLine();
            if (urlAddress.isEmpty()) {
                System.out.println("введена пустая строка, повторите попытку");
            } else if (urlAddress.equals("0")) {
                        break;
            } else {
                boolean b;
                b = this.testUrlAddress();
                if (b) {
                    System.out.println("верный url-адрес");
                } else {
                    System.out.println("неверный url-адрес");
                }
            }
        }while(true);
        in.close();
    }
}
