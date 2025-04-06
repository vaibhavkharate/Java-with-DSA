public class condition1 {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18){
            System.out.println("Adult : you are able to and allowed to drive a car as well as you can vote");
        }
        else {
            System.out.println("you are not allowed to drive a car");
        }

        int A = 38;
        int B = 45;
        if (A >= B) {
            System.out.println("A is greater than B");
        } else {
            System.out.println("B is greater than A");
        }

        int V = 4;
        int W = 7;
        int X = 9;
        if ((V >= W) && (V >= X)) {
            System.out.println("Largest is V");
        } else if(W >= X) {
            System.out.println("largst is W");
        }
        else {
            System.out.println("largest is X");
        }
    }


}