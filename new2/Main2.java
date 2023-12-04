import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;
class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumwhile = 0;
        int k = 0;
        System.out.print("Введите длину массива: ");
        int lenght = scanner.nextInt();
        int[]array = new int[lenght];
        System.out.print("Введите числа в массив: ");
        for (int i = 0; i < lenght; i++){
            array[i] = scanner.nextInt();
        }
        while(lenght > k){
            sumwhile += array[k];
            k++;
        }
        System.out.println("Массив: " + Arrays.toString(array) + " ; Сумма цифр в массиве: " + sumwhile);

    }
}
