package ru.kk.calculatorapp.util;

public class Calculator {

    public static int calculate(int num1, int num2, String operation) { // создаем метод calculate и указываем его атрибуты
        switch(operation) { //оператор switch перебирает операции и возвращает их значение
            case "sum":
                return num1 + num2;
            case "diff":
                return num1 - num2;
            case "comp":
                return num1 * num2;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}