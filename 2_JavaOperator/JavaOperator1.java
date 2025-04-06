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

1. Arithmetic Operator (Binary/Unary)

    ** Binary (2 operand is required)
    +
    -
    *
    /
    %

    ** Unary 
    ++ (increment operator)
    -- (decrement operator)
    e,g = a=a+1 , a++; , a--: ++a

 */
public class JavaOperator1 {
    public static void main(String[] args) {
        int A = 10;
        int B = 5;
        System.out.println("modulo(remainder)"+ (A%B));
        
        //uniary operator
        int C = 10;
        int D = C++; 
        /* post increment 
        1. value use
        2. value change
        */
        System.out.println(C);
        System.out.println(D);

        
        int E = 5;
        int F = ++E;
          /* pre increment 
        1. value change
        2. value use
        */
        System.out.println(E);
        System.out.println(F);
    }
}