public class Snack {
    private String _name;
    private double _price;
    public Snack(String name,double price){
        _name = name;
        _price = price;
    }

    public double get_price() {
        return _price;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        _name = name;
    }

    public void set_price(double price) {
        _price = price;
    }

}
