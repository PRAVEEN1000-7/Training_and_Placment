import java.util.*;

abstract class Shape {

    @SuppressWarnings({"abtract method", "unused"})
    abstract double Area(double input);

    static void details() {
        System.out.println("\nParent abstract class.");
    }
}

class Circle extends Shape {
    @Override
    double Area(double radius) {
        return Math.PI * (radius * radius);
    }
}

class Square extends Shape {
    @Override
    double Area(double sq) {
        return sq * sq ;
    }
}

public class ShapeAbstract {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            Circle c = new Circle();
            Square s = new Square();

            System.out.print("Enter the side : ");
            int side = sc.nextInt();

            System.out.print("Enter the radius : ");
            int radius = sc.nextInt();

            System.out.println("Area of Square : "+ s.Area(side));
            System.out.printf("Area of Circle : %.2f",c.Area(radius));
            
            Shape.details();
        }
    }
}
