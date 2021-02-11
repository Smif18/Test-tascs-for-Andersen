package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        String line = reader.readLine();
        int a = Integer.parseInt(line);
        if (a > 7) System.out.println("Привет");
    }
}
