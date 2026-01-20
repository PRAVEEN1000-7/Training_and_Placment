import java.util.Scanner;

public class palinedrome {
    
    public static void main(String arg[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the sentence : ");
            String word = sc.nextLine().replaceAll("\\s", "").toLowerCase();
            
            System.out.println(isPalindrome(word));
        }
     
    }

    public static boolean isPalindrome(String word) {
            
            int l = 0, r = word.length()-1;

            while(l<r){
                if(word.charAt(l)!=word.charAt(r)) {
                    return false;
                }
                l++;
                r--;
            }

            return true;
        }
}
