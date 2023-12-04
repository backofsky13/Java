package Main4;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;

class Main4{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int k = 1;
        System.out.print("Введите длину массива: ");
        int lenght = scanner.nextInt();
        int[] array = new int[lenght];
        System.out.print("Введите массив: ");
        for (int i = 0; i<lenght; i++){
            array[i] = scanner.nextInt();
        }
        for (int j = 0; j < lenght; j++){
            System.out.println(k+"/"+array[j]);
        }
    }
}