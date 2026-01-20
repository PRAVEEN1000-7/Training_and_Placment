import java.util.Scanner;


public class sequence {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the range : ");
            int n = sc.nextInt();
            
            for(int i=1;i<=n;i++){
                int m = i*i;
                int result = (i%2==0)?(m-2):(m-1);
                System.out.print(result+" ");
            }
        }
    }
}
