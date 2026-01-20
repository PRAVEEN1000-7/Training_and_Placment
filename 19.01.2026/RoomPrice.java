import java.util.Scanner;

public class RoomPrice {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int month, rent, days, price;

            System.out.print("Enter the month (1-12) : ");
            month = sc.nextInt();

            if (month<=0 || month>=12) {
                System.out.println("invalid input");
                return;
            }
            System.out.print("Enter the rent per day : ");
            rent = sc.nextInt();
            System.out.print("Enter the no of days : ");
            days = sc.nextInt();

            if ( (month>=4 && month<=6 ) || month==11 || month==12 ){
               price = (rent + ((rent*20)/100) ) * days ;
            }
            else {
                price = rent * days;
            }
        System.out.println("price : " + price);
        }
    }
}
