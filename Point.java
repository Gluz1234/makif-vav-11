public class Point {
    private int _x;
    private int _y;
    public Point(int x,int y)
    {
        _x = x;
        _y = y;
    }
    public Point(Point other)
    {
        _x = other.get_x();
        _y = other.get_x();
    }

    public int get_x() {
        return _x;
    }

    public int get_y() {
        return _y;
    }

    public void set_x(int x) {
        _x = x;
    }

    public void set_y(int y) {
        _y = y;
    }
    public void printPoint()
    {
        System.out.println("x = " + _x);
        System.out.println("y = " + _y);
    }
}
