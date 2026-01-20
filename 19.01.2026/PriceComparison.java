import java.util.Scanner;

public class PriceComparison {
    
    public static void main(String arg[]){

        try (Scanner sc = new Scanner(System.in)) {
            int[] prices = new int[9];

            System.out.println("Enter the price details : ");
            for (int i=0;i<9;i++){
                prices[i] = sc.nextInt();
            }

            int[] price = new int[3];

            for(int i=0;i<9;i+=3){
                price[i] = prices[i] - ((prices[i + 1] * prices[i]) / 100) + prices[i + 2] ;

            }

            if (price[0]<price[1] & price[0]<price[2]) System.out.println("flipkart : "+ price[0]);
            else if (price[1]<price[0] & price[1]<price[2]) System.out.println("snapdeal : "+ price[1]);
            else if (price[1]==price[0] & price[1]==price[2]) System.out.println("flipkart : "+ price[0]+"\n"+"snapdeal : "+ price[1]+"\n"+"amazon : "+ price[2]);
            else System.out.println("amazon : "+ price[2]);

            System.out.println("flipkart : "+ price[0]+"\n"+"snapdeal : "+ price[1]+"\n"+"amazon : "+ price[2]);
        }


    }
}
