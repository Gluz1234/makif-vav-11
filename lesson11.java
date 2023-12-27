public class lesson11 {
    public static void main(String[] args) {
        ex1(3);
        ex2(3);
        System.out.println();
        System.out.println(ex3(20,3));
        System.out.println(countDigits(10));
        System.out.println(countEvenDigits(2221));
        System.out.println(findLargestDigit(9812));
    }
    public static void ex1(int num)
    {
        if (num == 1)
        {
            System.out.println(1+ " ");
        }
        else
        {
            System.out.print(num + " ");
            ex1(num-1);
        }
    }
    public static void ex2(int num)
    {
        if (num > 0)
        {
            ex2(num-1);
            System.out.print(num + " ");
        }
    }
    public static int ex3(int num,int exponent)
    {
        if (exponent == 0)
            return 1;
        if (num == 0)
            return 0;
        return num * ex3(num, exponent - 1);
    }
    public static int ex4(int number) {
        if (number == 0) {
            return 0;
        } else {
            return 1 + ex4(number / 10);
        }
    }

    public static int ex5(int number) {
        if (number == 0) {
            return 0;
        } else {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                return 1 + ex5(number / 10);
            } else {
                return ex5(number / 10);
            }
        }
    }

    public static int ex6(int number) {
        if (number < 10) {
            return number;
        } else {
            int lastDigit = number % 10;
            int remainingDigits = ex6(number / 10);
            return Math.max(lastDigit, remainingDigits);
        }
    }
}
