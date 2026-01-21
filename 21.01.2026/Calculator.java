import java.util.Scanner;

public class Calculator {
    static int add(int a, int b){
        return a+b;
    }

    static double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a : ");
            int a = sc.nextInt();

            System.out.print("Enter b : ");
            int b = sc.nextInt();

            System.out.print("Enter a : ");
            float aa = sc.nextFloat();

            System.out.print("Enter b : ");
            float bb = sc.nextFloat();

            System.out.println("result : " + add(a,b) );
            System.out.printf("result : %.2f", add(aa,bb));
        }
    }
}
