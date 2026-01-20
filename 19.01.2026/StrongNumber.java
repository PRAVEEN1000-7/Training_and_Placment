import java.util.Scanner;

public class StrongNumber {

    public static int factorial(int n) {
        int r=1;
        for( int i=1;i<=n;i++){
            r*=i;
        }
        return r;
    }
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            int org = n;
            int sum=0;

            while(n>0){   
                int m = factorial(n%10);
                n=n/10;
                sum += m;
            }
            System.out.println((sum==org)?"Yes":"No");
        }
    }

}
