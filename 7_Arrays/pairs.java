// Pairs in an array -- using nestaed loop

public class pairs{
    public static void printPairs(int numbers[]){
        int tp = 0;

        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i]; // 2, 4, 6, 8, 10
            for (int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.err.println("Total number of pairs: " + tp);
    }


    // subarrays

    public static void printSubarrays(int numbers[]){
        int ts = 0;
        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++) { //print
                System.out.print(numbers[k] + " ");// subaray 

            }
            ts++;
            System.err.println();
        }
        System.out.println();
    }
    System.out.println("Total number of subarrays: " + ts);
}

    public static void maxSubarraySum (int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++) {
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){// print
                    //subarray sum
                    currSum += number[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = "+ maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        int number[] ={ 1, -4, 9, -2, 5};
        printPairs(numbers); 
        
        // timecomplexitiy is the O(n2) time because of nested loops

        printSubarrays(numbers);

        maxSubarraySum(number);// O(n3)
    }
}