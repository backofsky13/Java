import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Red", 5.0);
        Ball b2 = new Ball("Blue", 7.0);
        Ball b3 = new Ball("Yellow"); b3.setRadius(9.0);
        System.out.println(b1);
        b1.intoRadiusBall();
        b2.intoRadiusBall();
        b3.intoRadiusBall();
    }
}
