 /*

 WHILE LOOP
 while(condition){
    //do something
 }

  */
import java.util.Scanner;


public class whileLoop {
    public static void main(String[] args) {
        int counter = 0; // counter is an variable to take track on the number of times the desired work done
        // the initialization is starting from the 0 i.e ***int counter = 0***
        while(counter < 100){ // condition
            System.out.println("hello World");
            counter++;
        }
        System.out.println("Printer is done the Job");

// while (true) --> this ia an infinate loop condition that is true at any time



// print number from 1 to 10
 
        int number = 1;
        while(number <= 10){
            System.out.print(number+" ");
            number++;
        }
        System.out.println(); 


    // Input from the user (print number from 1 to N)

    Scanner sc = new Scanner(System.in);
    int range = sc.nextInt();
    int start = 1;

    while(start <= range){
        System.out.print(start +" ");
        start++;
    }
    System.out.println();

    //print sum of first n natural numbers

    Scanner system = new Scanner(System.in);
    int n = system.nextInt();
    int sum = 0;

    int i = 1;
    while(i <= n){
        sum += i;
        i++;
    }
    System.out.println("sum is:"+ sum);
}

}