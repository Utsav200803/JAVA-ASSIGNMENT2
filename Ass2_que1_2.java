import java.util.Scanner;

public class Ass2_que1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        System.out.println("Enter radius of circle:");
        radius = sc.nextInt();
        Ass2_que1_1 a = new Ass2_que1_1(radius);
        double perimeter = a.getPerimeter();
        double area = a.getArea();
        System.out.println("Area of the circle:" + area);
        System.out.println("Perimeter of the circle:" + perimeter);
    }
}
