/*
DO-WHILE LOOP

do {
    // do something
} while (condition);


 */
import java.util.*;

public class dowhileLoop {
    public static void main(String[] args) {
        int counter = 1;
        do {
            System.out.println("Hello World");
            counter++;
        } while(counter <= 10);


// BREAK STATEMENT

    for (int i = 1; i <= 10; i++) {
        if (i == 3) {
            break;
        }
        System.out.println(i);
    }
    System.out.println("I am out of the loop");

    // KEEP ENTERING A  NUMBERS TILL USER ENTERS A MULTIPLE OF 10

    Scanner sc = new Scanner(System.in);
    
    do { 
        System.out.print("Enter your Number : ");
        int n = sc.nextInt();
        if (n % 10 == 0){
            break;
        }
        System.out.println(n);
    } while (true);


    // CONTINUE STATEMENT --> to skip an iteration

        for (int i = 1; i <= 10; i++) {
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }

    // display all the numbers entered by user expect multiple of 10

        Scanner input = new Scanner(System.in);

        do { 
            System.out.print("Enter your Number : ");
            int n = input.nextInt();

            if (n % 10 == 0){
                continue;
            }
            System.err.println("number was :"+ n);
        } while (true);


    }

    
}
