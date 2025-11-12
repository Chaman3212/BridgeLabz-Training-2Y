package levelone;

class Circle {
    double radius;

    // constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // method to calculate area
    public double area() {
        return Math.PI * radius * radius;
    }

    // method to calculate circumference
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }

    public static void main(String[] args) {
        Circle c = new Circle(7.5);
        c.display();
    }
}
