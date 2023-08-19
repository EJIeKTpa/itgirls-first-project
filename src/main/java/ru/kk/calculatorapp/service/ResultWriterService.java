package ru.kk.calculatorapp.service;

public class ResultWriterService {

    public static void printResult(int num1, int num2, int result, String operation) { // создаем метод printResult в классе ResultWriterService и указываем его атрибуты число 1, число 2,результат, строковая операция
        String operationSymbol; // создаем переменную в которую будут присвоены знаки операции в зависимости от строковой операции
        switch (operation) {
            case "sum":
                operationSymbol = "+";
                break;
            case "diff":
                operationSymbol = "-";
                break;
            case "comp":
                operationSymbol = "*";
                break;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
        System.out.println("Operation: " + num1 + operationSymbol + num2 + "=" + result); //строка в конце метода отвечает за вывод на печать
    }
}