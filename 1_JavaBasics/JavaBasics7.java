// ****** TYPE PROMOTION ******
/*
1. Java automatically promotes each byte, short, and char operand to int when evaluating an expression.
2. If one operand is long , float or double the whole expression is promoted to long , float , double respectively
   ( largest possible data type )
 */
public class JavaBasics7 {
    public static void main(String[] args) {
        short a = 'a';
        char b = 'b';
        byte c = 'c';
        byte bt = (byte) (a + b + c);
        System.out.println(bt);
       
    }
}