public class one {
    public static void hallow_rectangle(int totRows, int totCols) {
        //outer loop
        for(int i=1; i<=totRows; i++) {
            //inner columns
            for(int j=1; j<=totCols; j++) {
                //cell - (i,j)
                if(i == 1 || i == totRows || j == 1|| j == totCols) {
                    //boundary cells
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid (int n) {
        //outer
        for(int i=1; i<=n; i++) {
            // spaces
            for(int j=1; j<=n; j++) {
                System.out.print(" ");
            }

            // stars

            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void inverted_half_pyramid_withNumbers(int n) {
        for(int i=1; i<=n; i++) {
            //inner - numbers
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        // 1st half
        for(int i=1; i<=n; i++){
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            
            // stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    

        // 2nd half
        for(int i=n; i>=1; i--){
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            
            // stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rombus (int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.err.println();
        }
    }

    public static void hallow_rhombus (int n){
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // hallow rectangle- stars
            for(int j=1; j<=n; j++){
                if(i == 1|| i == n || j == 1 || j == n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        // 1st half of diamond
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
        }

        // stars
        for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    // 2nd half of diamond
    for(int i=n; i>=1; i--){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
        }

        // stars
        for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}


//  numberPyramid

        public static void numberPyramid(int n){
            for(int i = 1; i<=n; i++){
                //spaces
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                //numbers
                for(int j=1; j<=i; j++){
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    
        public static void palodromicPatternNumber(int n){
            for(int i = 1; i<=n; i++){
                // spaces
                for(int j = 1; j<=n-i; j++){
                    System.out.print(" ");
                }

                //decending numbers
                for(int j=i; j>=1; j--){
                    System.out.print(j);
                }
                // acending numbers
                for(int j=2; j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }

        }

    public static void main(String[] args) {
        hallow_rectangle(4, 5);
        inverted_rotated_half_pyramid(7);
        inverted_half_pyramid_withNumbers(5);
        butterfly(8);
        solid_rombus(5);
        hallow_rhombus(8);
        diamond(6);
        numberPyramid(4);
        palodromicPatternNumber(6);
    }
}

