import java.util.Scanner;

public class CollatzSequence {
 
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();

            int i=0;
            while(n>1){
                System.out.print((n!=1)? ""+n+"->":"");
                n = (n%2==0)?(n/2):(3*n+1) ;
                i++;
            }
            System.out.print(n+"\n");
            System.out.println("Count : "+ i);
        }
    }
}
