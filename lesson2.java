import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int a = 100,b=50,c=20;
        float avg = (float)(a+b+c)/3;
        System.out.println("avg = " + avg);
    }

    public static void main(String[] args)
    {
        int a = 100,b=50;
        float c = (float)(a*a+b*b);
        System.out.println("c = " + Math.sqrt(c));
    }

    public static void main(String[] args)
    {
        int x = 2;
        int y = 2*x + 5;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int miny = Math.min(Math.min(a,b),Math.min(c,b));
        System.out.println("miny = " + miny);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two points:");
        System.out.println("Enter x1:");
        int x1 = scan.nextInt();
        System.out.println("Enter y1:");
        int y1 = scan.nextInt();
        System.out.println("Enter x2:");
        int x2 = scan.nextInt();
        System.out.println("Enter y2:");
        int y2 = scan.nextInt();
        double d = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        System.out.println("d = " + d);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = scan.nextInt();
        System.out.println("Enter d: ");
        int d = scan.nextInt();
        int pl_5 = first + (5-1) * d;
        int pl_10 = first + (10-1) * d;
        System.out.println("pl_5 = " + pl_5);
        System.out.println("pl_10 = " + pl_10);;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        if (num > 0)
            System.out.println("num = " + num + " is positive");
        else if (num < 0)
        {
            System.out.println("num = " + num + " is negative");
        }
        else {
            System.out.println("num = " + num + " is zero");
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String l1 = scan.next();
        System.out.println("Enter a speed: ");
        int v1 = scan.nextInt();
        System.out.println("Enter a distance: ");
        int s1 = scan.nextInt();
        System.out.println("Enter a letter: ");
        String l2 = scan.next();
        System.out.println("Enter a speed: ");
        int v2 = scan.nextInt();
        System.out.println("Enter a distance: ");
        int s2 = scan.nextInt();
        if ((s1/v1) > (s2/v2))
        {
            System.out.println("win = " + l2);
        } else if ((s1/v1) < (s2/v2))
        {
            System.out.println("win = " + l1);
        }
        else
        {
            System.out.println("Same arrival time");
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an amount: ");
        int temp;
        int amount = scan.nextInt();
        if (amount > 0 && amount < 10)
        {
            System.out.println("amount = " + amount * 1.2);
        }
        else if (amount < 54)
        {
            temp = amount % 10;
            amount /= 10;
            System.out.println("amount = " + (temp * 10 + amount * 1.2));
        }
        else if (amount < 108)
        {
            temp = amount % 54;
            amount /= 10;
            System.out.println("amount = " + (temp * 10 + amount * 1.2));
        }
    }

}
