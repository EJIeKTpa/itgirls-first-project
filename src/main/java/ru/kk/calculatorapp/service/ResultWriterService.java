package ru.kk.calculatorapp.service;

public class ResultWriterService {

    public static void printSum(int num1, int num2, int sum) {
        System.out.print(num1 + "+" + num2 + "=" + sum);
    }

    public static void printDiff(int num1, int num2, int diff) {
        System.out.print(num1 + "-" + num2 + "=" + diff);
    }

    public static void printComp(int num1, int num2, int comp) {
        System.out.print(num1 + "*" + num2 + "=" + comp);
    }

}
