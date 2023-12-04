package Main6;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;
class Main6{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        System.out.print("Введите число: ");
        int length = scanner.nextInt();
        int sum = method(length);
        System.out.println(sum);
    }
    public static int method(int b){
        int i = 1;
        int c = 1;
        for(i = 1; i<=b; i++){
            int a = 1;
            a = a * i;
            c = c * a;
        }
        return c;
    }
}
