public class one {
    public static void update(int marks[], int nonChangeable){
        nonChangeable = 10; // this is not a array this is simple variable that will pass by value in other function
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;

        }
    }
    public static void main(String[] args) {
        // int marks[] = new int[50];
        // int numbers[] = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9};
        // String fruits[] = {"apple", "orange", "mango"};

        int marks[] = {95, 96, 92};
        int nonChangeable = 6;
        update(marks, nonChangeable);
        System.out.println(nonChangeable);

        // print marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}