/* 
    TERNARY OPERATORS
    variable = condition? statement1 : statement2

*/

public class condition2 {
    public static void main(String[] args) {
        int number = 5;

        //ternary operator

        String type = ((number%2) == 0) ? "even" : "odd";
        System.out.println(type);

        // check if a student is pass or failed

        int marks = 45 ;
        String reportCard = marks >= 33 ? "pass" : "fail";
        System.out.println(reportCard);

        // SWITCH STATEMENT
        int task = 2;
        switch(task) {
            case 1 : System.out.println("Samosa");
                        break;
            case 2 : System.out.println("Burger");
                        break;
            case 3 : System.out.println("MangoShake");
                    break;
            default: System.out.println("We wake up");
                
    }

}
}