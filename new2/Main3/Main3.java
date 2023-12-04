package Main3;

import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;

class Main3 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int sumdo = 0;
        int k = 0;
        System.out.print("Введите длину: ");
        int lenght = scanner.nextInt();
        int[] array = new int[lenght];
        System.out.print("Введите числа в массив: ");
        for(int i = 0; i < lenght; i++){
            array[i] = scanner.nextInt();
        }
        do{
            sumdo += array[k];
            k++;
        }while (lenght > k);
        System.out.println("Массив: " + Arrays.toString(array) + " Сумма массива: "+ sumdo);
    }
}
