package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Third {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите элемент массива array[" + i + "]: ");
            line = reader.readLine();
            array[i] = Integer.parseInt(line);
        }
        for (int k = 0; k < array.length; k++) {
            if (array[k]%3==0) System.out.println(array[k]);
        }
    }

}
