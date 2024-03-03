package org.example;

import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Считываем номер столбца
        int column = scanner.nextInt();
        // Считываем операцию (сумма или среднее)
        char operation = scanner.next().charAt(0);

        // Создаем двумерный массив 12x12
        double[][] matrix = new double[12][12];
        // Заполняем массив элементами
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Вычисляем результат (сумму или среднее) элементов в указанном столбце
        double result = 0;
        for (int i = 0; i < 12; i++) {
            result += matrix[i][column];
        }

        // Если операция - среднее, делим сумму на количество элементов
        if (operation == 'M') {
            result /= 12;
        }

        // Выводим результат с одним знаком после десятичной точки
        System.out.printf("%.1f\n", result);
    }
}
