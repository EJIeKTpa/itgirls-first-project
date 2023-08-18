package ru.kk.calculatorapp._main;

import ru.kk.calculatorapp.service.ResultWriterService;
import ru.kk.calculatorapp.util.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = Calculator.Sum(num1, num2);
        int diff = Calculator.Diff(num1, num2);
        int comp = Calculator.Comp(num1, num2);
        ResultWriterService.printSum(num1, num2, sum);
        ResultWriterService.printDiff(num1, num2, diff);
        ResultWriterService.printComp(num1, num2, comp);
    }

}
