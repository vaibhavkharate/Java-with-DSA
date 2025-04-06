/*
**********for Loop******

for(initialisation; condition; updation){
    //do somthing
}
*/

public class forLoop {
    public static void main(String[] args) {
        for(int i= 1; i<=10; i++){
            System.out.println("Hello World");

    }

    // print SQUARE pattern

    for(int line=1; line<=4; line++){
        System.out.println("* * * *");
    }

    int lines = 1;
    while(lines <= 5){
        System.out.println("*****");
        lines++;
    }

    //  print Reverse of a number

    /*
    1) last digit -->  num % 10
    2) Remove Last digit --> num / 10

     */

    int n = 10899;

    while (n > 0) { 
        int lastDigit = n % 10;
        System.out.print(lastDigit);
        n = n / 10; // n/=10
    }
    System.out.println();

    // reverse the given number

    int num = 18892;
    int rev = 0 ;
    while (num > 0) {
        int lastNumber = num % 10;
        rev = (rev*10) + lastNumber ;
        num = num/10;
    }
    System.out.println("the reverse number is" + rev);
}
}