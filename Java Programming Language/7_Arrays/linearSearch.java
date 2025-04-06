public class linearSearch {
    public static int linearSearch(int numbers[], int key){
            for(int i=0; i<numbers.length; i++){
                if(numbers[i] == key){
                    return i;
                }
            }
            return -1   ;      // key exit hi nahi karti
    }

    public static void main(String[] args) {
        int numbers [] = {1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13};
        int key = 10 ;

        int index = linearSearch(numbers , key); 
        if(index == -1){
            System.out.println("NOT found");
        } else {
            System.out.println("key is at index: "+ index);
        }

    }
}