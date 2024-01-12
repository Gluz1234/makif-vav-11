public class Tester {
    public static double total(Snack[] arr)
    {
        double sum = 0;
        for (Snack s: arr) {
            sum += s.get_price();
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Snack s1 = new Snack("chips",10);
        Snack s2 = new Snack("chocolate",3.5);
        Snack s3 = new Snack("ice cream",5);
        Snack[] arr = new Snack[]{s1,s2,s3};
        double sum = total(arr);
        System.out.println("sum = " + sum);
        A a1=new A(3,3);
        System.out.println(a1);
        a1.setN1(0);
        a1.setN2(0);
        System.out.println(a1);
        a1.add(5);
        System.out.println(a1);
    }
}
