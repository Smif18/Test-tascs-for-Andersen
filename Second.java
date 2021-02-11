package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите имя: ");
        String line = reader.readLine();
        System.out.println("Вы ввели: " + line);
        if (line.equals("Вячеслав"))
            System.out.println("Привет, Вячеслав");
        else
            System.out.println("Нет такого имени");
    }

}
