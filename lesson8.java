public class ArithmeticProgression {
    private int _firstMember;
    private int _difference;
    public ArithmeticProgression(int fM, int diff)
    {
        _firstMember = fM;
        _difference = diff;
    }
    public void printGeneralSeries()
    {
        String Gs = String.format("an = %d + (n-1) * %d ", _firstMember,_difference);
        System.out.println("The general series:"+ Gs);
    }
    public int memberCalculation(int n)
    {
        return  _firstMember + (n-1) *_difference;
    }
    public float calculateN(int an)
    {
        float fm = (float) _firstMember;
        float diff = (float) _difference;
        float n = (an - fm + diff) / diff + 1;
        if (n >= 1 && n % 1 == 0) {
            return (int) n - 1 ;
        } else {
            return 0;
        }
    }
    public void setFM(int new_fm){_firstMember = new_fm;}
    public void setDiff(int new_diff){_difference = new_diff;}
    public int getFM(){return _firstMember;}
    public int getDiff(){return _difference;}
    public ArithmeticProgression(ArithmeticProgression other)
    {
        _firstMember = other.getFM();
        _difference = other.getDiff();
    }
    public boolean equal(ArithmeticProgression other)
    {
        return (_firstMember == other._firstMember) && (_difference == other._difference);
    }
    public boolean smallDiff(int other_diff)
    {
        return _difference>other_diff;
    }


}
