import java.util.*;

public class RotateArray {

  public static void main(String[] args){
      
    try(Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      int k = sc.nextInt();
        
      int[] arr = new int[n];
      for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        
      int j=0;
      while(j<k) {
          int rear = arr[n-1];
          for(int i=n-1;i>0;i--){
              arr[i] = arr[i-1];
          }
          arr[0]=rear;
          j++;
      }
   
      for(int i:arr) System.out.print(i+" ");

    }
  }
}