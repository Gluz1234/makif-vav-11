public class A {
    private int _N1;
    private int _N2;
    public A(int num1,int num2)
    {
        _N1 = num1;
        _N2 = num2;
    }

    public void setN1(int _N1) {
        this._N1 = _N1;
    }

    public void setN2(int _N2) {
        this._N2 = _N2;
    }
    public void add(int num){
        _N1 += num;
        _N2 += num;
    }

    @Override
    public String toString() {
        return _N1 + " + " + _N2 + " = " + (_N1+_N2);
    }
}
