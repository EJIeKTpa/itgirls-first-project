package ru.kk.calculatorapp._main;

import ru.kk.calculatorapp.service.ResultWriterService;
import ru.kk.calculatorapp.util.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //вызвали ввод с клавиатуры
        int num1 = sc.nextInt(); // присвоили 1 число
        int num2 = sc.nextInt(); // присвоили 2 число

        String[] operationTypes = {"sum", "diff", "comp"}; //создали словарь чтобы из него брать значения для принта

        for (String operationType : operationTypes) { // для элементов operationTypes в словаре operationType
            int result = Calculator.calculate(num1, num2, operationType); // вызова метода calculate из класса Calculator с присвоением значения в result
            ResultWriterService.printResult(num1, num2, result, operationType); // вызов метода printResult из класса ResultWriterService
        }
    }
}