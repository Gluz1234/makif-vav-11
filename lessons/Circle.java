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

    public double perimeter()
    {
        return 2*3.14*_radius;
    }
    public double area()
    {
        return 3.14*_radius*_radius;
    }
    public void move(int deltaX,int deltaY)
    {
        _center.move(deltaX,deltaY);
    }
    public boolean equals(Circle other)
    {
        boolean xCheck = _center.get_x() == other.get_center().get_x();
        boolean yCheck = _center.get_y() == other.get_center().get_y();
        boolean radiusCheck = _radius == other.get_radius();
        return xCheck && yCheck && radiusCheck;
    }
    public boolean isLarger(Circle other)
    {
        return (this.area() > other.area());
    }

    public boolean isInCircle(Point p)
    {
        return ((Math.pow(p.get_x() - _center.get_x(), 2) + Math.pow(p.get_y() - _center.get_y(), 2)) < Math.pow(_radius, 2));
    }
    public String toString()
    {
        return "The center is:(" + _center.get_x() + "," + _center.get_y() + ") and the radius = " + _radius;
    }
}
