package Main;

import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;
class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumfor = 0;
        System.out.print("Введите длину массива: ");
        int lenght = scanner.nextInt();
        int[]array = new int[lenght];
        System.out.print("Введите числа в массив: ");
        for (int i = 0; i < lenght; i++){
            array[i] = scanner.nextInt();
        }
        for (int j = 0; j<lenght; j++){
            sumfor += array[j];
        }
        System.out.println("Массив: " + Arrays.toString(array) + " ; Сумма цифр в массиве: " + sumfor);

    }
}
