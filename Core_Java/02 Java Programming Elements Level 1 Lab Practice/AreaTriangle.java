public import java.util.Scanner;
class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        double area = 0.5 * base * height;
        double areaCm = area * 6.4516;
        System.out.println("The area of triangle is " + area + " square inches and " + areaCm + " square cm");
    }
}

