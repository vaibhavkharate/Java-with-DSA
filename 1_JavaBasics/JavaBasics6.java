import java.util.*;

public class JavaBasics6 {
    public static void main(String[] args) {
        int  a = 25;
        long b = a;
        System.out.println(b);

        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        System.out.println(x);

        float h = 56.8f;
        int j = (int)h;
        System.out.println(j); // type casting to integer

        char ch = 'a';
        char ch2 = 'b';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);
    }
}

/*
****************type conversion******* widening conversions / implicit conversions

conversion happen when ;
a. type compatible
b. destination tyoe > source type

byte -> short -> int -> float -> long -> double ->

*****************type casting**************** narrowing conversions / explicit conversions

float a = 45.0;  // loss of data
int b = a;

*/