import java.util.Scanner;

public class pairs {
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter an even number :");
            int n = sc.nextInt();
            System.out.println("Enter each elements separated by space :");
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            boolean swapped;
            for(int i=0;i<n-1;i++){
                
                swapped = false;
                for(int j=0;j<n-i-1;j++){
                    if (arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;

                        swapped = true;
                    }
                }
                if(!swapped) break; 
            }

            int i=0,j=arr.length-1;
            while(i<j){
                System.out.println(arr[i]+" , "+arr[j]);
                i++;
                j--;
                
                if(i==j){
                    System.out.println(arr[i]+" , 0");
                }
            }
        }
    }
}
