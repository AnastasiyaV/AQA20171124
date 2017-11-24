package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1) метод который считает сумму квадратов чисел (в массиве)
        Scanner scSumSquare = new Scanner(System.in);
        System.out.println("Enter number for sumSquare");
        int nSumSquare = scSumSquare.nextInt();
        double sumSquare = 0.0;
        for (int i=0; i<=nSumSquare;i++){
            sumSquare += i * i;

        }
        System.out.println("sumSquare = "+sumSquare);


// 2) метод который считает количество символов в строке
// 2а) Метод который делает символ с в аппер кейс и возвращает измененное слово
        String str = "Cxxxxx c";
        System.out.println(str.length());
        List<String> stringList = Arrays.asList(str);
        System.out.println(stringList);
        for (String s:stringList) {
            if (s.contains("c")) {
                System.out.println(s.toUpperCase());
            }
        }
// конвертирует не конкретный символ, а всю строку в toUpperCase :(
    }
}
