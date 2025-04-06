public class RecursionBasics {
    public static void printDec(int n){
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }

    // fibonacci series
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    // array is sorted or not
    public static boolean isSorted (int arr[], int i) {
        if(i == arr.length-1){
            return true;
        }   
        if(arr[i] > arr[i+1]){
            return false;
        }
        return  isSorted(arr, i+1);
    }

    // first and last occurance

    public static int firstOccurence (int arr[], int key, int i){
        if(i == arr.length) {
            return -1;

        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }


    public static void main(String[] args) {
        // int n = 23;
        // System.out.println(fib(n));


        // printDec(n);

        // int arr[] = {1, 2, 3, 4, 5};
        // System.out.println(isSorted(arr, 0));

        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(firstOccurence(arr, 5, 0));
    }
}