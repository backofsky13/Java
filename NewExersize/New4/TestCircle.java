package New4;

import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

class TestCircle {
    public static void main(String[] arg){
        Circle c = new Circle(3, 7);
        c.setSquare(5);
        System.out.println("Новая площадь круга: " + c.getSquare() );
    }

}