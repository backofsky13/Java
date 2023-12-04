package New4;

import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class Circle{
    private int diametr;
    private int square;


    public Circle(int d, int s){
        diametr = d;
        square = s;
    }
    public int getDiametr(){
        return diametr;
    }
    public int getSquare(){
        return square;
    }
    public void setSquare(int s) {
        square = s;
    }
    public void setDiamter(int d) {
        diametr = d;
    }

}

