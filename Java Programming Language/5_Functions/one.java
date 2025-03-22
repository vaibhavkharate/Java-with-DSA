import java.util.*;

public class one {
    public static void printHelloWorld() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");

    }

    public static void calculateSum(int num1, int num2) { // this is called as the parameters or formal parameters
        
        // Scanner scanner = new Scanner (System.in);
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        int sum =   num1+ num2;
        System.out.println("Sum is : " + sum);
    }

    public static void swap(int x , int y ) { // this is called as the parameters or formal parameters 
        //swap
        int temp = x;
        x = y;
        y = temp;

        System.out.println("x ="+ x);
        System.out.println("y ="+ y); 
    }

    public static void main(String[] args) {
        printHelloWorld(); // this is functions called


        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        calculateSum(a, b); // this is know as arguments  or actual parameters 

        // swap - value exchange

        int x = 5;
        int y = 10;
        swap(x,y);
        // //swap
        // int temp = x;
        // x = y;
        // y = temp;

        // System.out.println("x ="+ x);
        // System.out.println("y ="+ y);

    }
}