public class Circle {
    private double _radius;
    private Point _center;
    public Circle(int x,int y, double radius)
    {
        _radius = radius;
        _center = new Point(x,y);
    }
    public Circle(Point center, double radius)
    {
        _radius = radius;
        _center = new Point(center);
    }
    public Circle(Circle other)
    {
        _radius = other.get_radius();
        _center = new Point(other.get_center());
    }

    public double get_radius() {
        return _radius;
    }

    public Point get_center() {
        return _center;
    }

    public void set_center(Point center) {
        _center = center;
    }

    public void set_radius(double radius) {
        _radius = radius;
    }
    public void printCircle()
    {
        System.out.println("radius = " + _radius);
        System.out.println("centerX = " + _center.get_x());
        System.out.println("centerY = " + _center.get_y());
    }
}
