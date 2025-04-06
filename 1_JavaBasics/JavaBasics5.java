import java.util.*;

public class JavaBasics5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.printf("Area of circle with radius %.2f is %.2f", rad, area);
       
    }
}