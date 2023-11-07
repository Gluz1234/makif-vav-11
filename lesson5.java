import java.util.Scanner;

public class ex5 
{
    public static void greetStudent() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
    }

    public static void calculateDivision(int number) 
    {
        int result = 0; 
        result = 5 / number;
        System.out.println("Number of integers obtained in the division: " + result);
    }

    public static int calculateProduct(int num1, int num2) 
    {
        return num1 * num2;
    }

    public static double calculateSumAndAverage(double num1, double num2, double num3) 
    {
        double sum = 0;
        double average = 0;
        sum = num1 + num2 + num3;
        average = sum / 3;
        System.out.println("Sum of the three numbers: " + sum);
        return average;
    }

    public static void calculateCircleProperties(double radius) 
    {
        double circumference = 0;
        double area = 0;
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);
    }

    public static double calculateTriangleHypotenuse(double sideA, double sideB) 
    {
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }

    public static void printLettersInReverse(String letter1, String letter2, String letter3) 
    {
        String result = letter3 + letter2 + letter1;
        System.out.println(result);
    }

    public static int calculateSeriesTerm(int firstNumber, int difference, int member) 
    {
        return firstNumber + (member - 1) * difference;
    }

    public static void main(String[] args) {
        greetStudent();
        calculateDivision(2);
        int product = calculateProduct(4, 5);
        System.out.println("\n\nProduct of two numbers: " + product);
        double average = calculateSumAndAverage(10.5, 15.3, 20.7);
        System.out.println("\nAverage of three numbers: " + average);
        calculateCircleProperties(3.0);
        double triangleHypotenuse = calculateTriangleHypotenuse(3.0, 4.0);
        System.out.println("\nLength of the remaining side of the triangle: " + triangleHypotenuse);
        printLettersInReverse("A", "B", "C");
        int seriesTerm = calculateSeriesTerm(5, 3, 4);
        System.out.println("\nGeneral term in the series: " + seriesTerm);
    }
}
