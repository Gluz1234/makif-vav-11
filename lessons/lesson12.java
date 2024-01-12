public class Tester {
    public static void main(String[] args)
    {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(point1);
        point2.set_x(3);
        point2.set_y(4);
        System.out.println("Point 1:");
        point1.printPoint();
        System.out.println("Point 2:");
        point2.printPoint();
        System.out.println("Distance between Point 1 and Point 2: " + point1.distance(point2));
        System.out.println();
        Circle circle1 = new Circle(point1, 5.0);
        Circle circle2 = new Circle(circle1);
        circle2.set_radius(8.0);
        System.out.println("Circle 1:");
        circle1.printCircle();
        System.out.println("Circle 2:");
        circle2.printCircle();
        System.out.println("Perimeter of Circle 1: " + circle1.perimeter());
        System.out.println("Area of Circle 1: " + circle1.area());
        System.out.println();
        System.out.println("Moving Circle 1 by (dx=2, dy=3):");
        circle1.move(2, 3);
        circle1.printCircle();
        System.out.println();
        System.out.println("Are Circle 1 and Circle 2 equal? " + circle1.equals(circle2));
        System.out.println();
        Point testPoint = new Point(6, 7);
        System.out.println("Is the point " + testPoint.toString() + " inside Circle 1? " + circle1.isInCircle(testPoint));
    }
}
