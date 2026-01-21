
import java.util.Scanner;

public class ReverseString {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the encrypted code : ");
            String word = sc.next();
            char[] letters = word.toCharArray();
            
            for(int i=0,j=word.length()-1;i<j;i++,j--){
                char t = letters[i];
                letters[i] = letters[j];
                letters[j] = t;
            }   
            System.out.println(new String(letters));
        }
    }
}
