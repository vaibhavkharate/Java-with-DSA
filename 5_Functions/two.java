public class two {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }


    public static int factorial (int n) {
        int f = 1; // always we initialize 1 when we do the multiplication

        for(int i = 1; i <= n; i++) {
            f= f * i;
        }
        return f;
    }

    public static int binCoeff (int n ,int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n /(fact_r * fact_nmr);
        return binCoeff;
    }

    // Functions Overloading using parameter

     public static int sum (int q, int w) { // sum of 2 numbers
        return q + w;
    }

    public static int sum (int q, int w, int e) { // sum of 3 numbers
        return q + w + e;
    }

    // Functions Overloading using DataType

    public static int sums(int a, int b) {
        return a + b;
    }

    public static float sums (float a, float b) {
        return a + b;
    }

    // find the number is prime or not prime
    public static boolean isPrime(int n){
        if (n == 2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if (n % i == 0){
                return false ;
            }
    
        }
    
        return true;

}

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int prod = multiply(a, b);
        System.out.println(" a * b = " + prod);

        // similarly if i want to multiply

        prod = multiply(6 , 5);
        System.out.println(" a * b = " + prod);


        // factorial calculation

        System.out.println("the n factorial is : " + factorial(4));


        // Binomial Coefficient calculation

        System.out.println((binCoeff(6, 5)));

        // Functions Overloading using parameters
        /* function overloading depends only on the change in parameters values not on the return type of the function.
            */

        System.out.println("The sum of 2 numbers:" + sum(5, 3));

        System.err.println("The sum of 3 numbers:" + sum(1, 2, 3));

           // Functions Overloading using DataType
        System.out.println(sums(5, 3));
        System.out.println(sums(5.7f,9.3f));

        // prime number
        System.out.println(isPrime(8));
    

    }

}






   