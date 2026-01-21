import java.util.Scanner;

public class AreaOverloading {
    
    static int area(int side) {
        return side * side;
    }

    static int area(int length, int width){
        return length * width;
    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter the side : ");
            int s = sc.nextInt();

            System.out.print("Enter the length : ");
            int l = sc.nextInt();
            System.out.print("Enter the width : ");
            int w = sc.nextInt();

            System.out.println("Area of Square : "+ area(s));
            System.out.println("Area of rectangle : "+ area(l,w));
        }
    }
}
