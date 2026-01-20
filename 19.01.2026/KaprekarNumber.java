import java.util.*;

public class KaprekarNumber {
    
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.print("Enter the number : ");
            int n = sc.nextInt();

            int sq = n*n, org = n;

            int l=0;
            while(n>0){
                n=n/10;
                l++;
            }

            int D = (int) Math.pow(10,l);
            int limit = sq%D;
            int s = sq/D;
            int result = s + limit;

            String val = (result == org)? "Kaprekar Number":"Not a Kaprekar Number";
            System.out.println(val);
        }
    }
}
