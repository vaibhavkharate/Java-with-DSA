public class nestedLoop {
    public static void main(String[] args) {

        // PRINT STAR PATTERN

        for (int line = 1; line <= 4; line++) {

            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        } 
    

    // PRINT INVERTED STAR PATTERN
        int n = 4 ;
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= 4-line+1; star++) {
                System.out.print("*");
            }
            System.out.println();
        } 

    // PRINT HALF-PYRAMID PATTERN

        int m = 4;

        for (int line = 1; line <= m; line++) {
            // number print
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }



        int o = 4 ;
        char ch = 'A';

        //outer loop
        for (int line = 1; line <= o; line++) {
            //inner loop
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

}
