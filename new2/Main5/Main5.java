package Main5;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;
import java.math.*;
class Main5{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int lenght = scanner.nextInt();
        int[] array = new int[lenght];
        System.out.print("Вывод массива с рандомными числами: ");
        for (int i = 0; i < lenght; i++){
            array[i] = (int) Math.round((Math.random() * 30) - 15);

        }
        System.out.print(Arrays.toString(array));
        System.out.print(" Отсортированный массив: ");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
