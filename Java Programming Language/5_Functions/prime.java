public class prime {
    public static boolean isPrime(int n){
        // corner cases
        // 2
        if (n == 2){
            return true;
        }
    boolean isPrime = true;
    for(int i=2; i<=n-1; i++){
        if(n % i == 0){ // completely dividing
            // isPrime = false;
            // break;
            return false;
        }
    }
    
    // return isPrime;
    return true;

}

    public static void primeInRange(int n) {
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i +" ");
            }
        }
    }

    public static void binToDec (int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }

        System.out.println("Decimal of "+ myNum + "=" + decNum);

        }

        public static void decToBin (int n){
            int myNum = n;
            int pow = 0;
            int binNum = 0;

            while (n > 0){
                int rem = n % 2;
                binNum = binNum + (rem * (int)Math.pow(10, pow));
                pow++;
                n = n/2;
            }
            System.out.println("Binary form of "+ myNum + " = " + binNum);
        }
    

    public static void main(String args[]){
        System.out.println(isPrime(5));
        System.out.println(isPrime(2));
        System.out.println(isPrime(20));

        primeInRange(20);

        binToDec(10001);

        decToBin(9);
    }
}

