
import java.util.stream.Stream;



public class shortestPath{
    public static float getShortestPath(String path){
        int x = 0, y = 0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            //South
            if(dir == 'S') {
                y--;
            }
            //North
            else if(dir == 'N') {
                y++;
            }
            //West
            else if(dir == 'W') {
                x--;
            }
            //East
            else {
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }

    // Comparison of the String

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt((i))));
            }else{
                sb.append(str.charAt(i));
            }
        }// O(n)
        return sb.toString();
    }


    public static String Compress (String str2){
        String newStr2 = "";

        for (int i=0; i<str2.length(); i++){
            Integer count = 1;
            while(i<str2.length()-1 && str2.charAt(i) == str2.charAt(i+1)){
                count++;
                i++;
            }

            newStr2 += str2.charAt(i);
            if(count > 1){
                newStr2 += count.toString();
            }
        }

        return newStr2;
    }

    public static void main(String[] args){
        String path = "WNEENESENN";
        System.out.println(getShortestPath(path));
        String str = "hi, i am vaibhav";
        System.out.println(toUpperCase(str));


        String str2 = "aaabbccddd";
        System.out.println(Compress(str2));

        String s1 = "hari";
        String s2 = "hari";
        String s3 = new String("hari");

        if (s1.equals(s3)){
            System.out.println("String are Equal");
        }else {
            System.out.println("String are not Equal");
        }

        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }// O(26)
        // O(n^2)
        System.out.println(sb.length());
        System.out.println(sb);

    

    }
}