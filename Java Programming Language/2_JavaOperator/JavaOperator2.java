// ****** OPERATOR  in Java ******
/*
    symbols that tell compiler to perform some operation
    e.g  sum = a + b

******** Types of Operator ******

    1. Arithmetic Operator (Binary/Unary)
    2. Relational Operator
    3. Logical Operator
    4. Bitwise Operator (Bit Manipulation)
    5. Assignment Operator

 2. Relational Operator
    ==
    !=
    >
    <
    >=
    <=

 3. Logical Operator
    && --> and
    || -> or
    !  -> not

5. Assignment Operator
    =
    +=
    -=
    *=
    /=

 */
public class JavaOperator2 {
    public static void main(String[] args) {
        int A = 10;
        int B = 5;
        System.out.println("equal"+ (A==B));
        
        int C = 20;
        int D = 3 ;
        System.out.println(C > D);
        System.out.println(C < D);


       // 3. Logical Operator

       System.out.println((3>2) && (3>1)); // multiplication w.r.t. the (0,1)
       System.out.println((3<2) || (3<1)); // addition
       System.out.println(!(5>10));
       System.out.println(!(5<10));

       // 5. Assignment Operator

       int X = 20;
       X += 30; // X = X + 30
       System.out.println(X);
    }
}