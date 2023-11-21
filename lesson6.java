import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
        calculateAverage();

        // Task 2
        countWordsUntilEnter();

        // Task 3
        validateCreditCard("1234");  // Replace "1234" with the correct code

        // Task 4
        isPalindrome();

        // Task 5
        printDivisors();

        // Task 6
        printMultiplicationTable();

        // Task 7
        printMinMaxGrades();

        // Task 8
        checkFibonacci();

        // Task 9
        calculateProductWithoutMultiplication();

        // Task 10
        printIsoscelesStarTriangle();
    }

    // Function for Task 1
    public static void calculateAverage() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            sum += grade;
        }

        double average = sum / 5;
        System.out.println("The average grade is: " + average);
    }

    // Function for Task 2
    public static void countWordsUntilEnter() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.print("Enter a word (type 'enter' to stop): ");
            String word = scanner.next();

            if (word.equalsIgnoreCase("enter")) {
                count++;
                break;
            }

            count++;
        }

        System.out.println("Number of words entered: " + count);
    }

    // Function for Task 3
    public static void validateCreditCard(String correctCode) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter the 4-digit credit card code: ");
            String userCode = scanner.next();

            if (userCode.equals(correctCode)) {
                System.out.println("Money much! How!");
                break;
            } else {
                System.out.println("Error");
                attempts--;
            }
        }

        if (attempts == 0) {
            System.out.println("Out of attempts. Exiting.");
        }
    }

    // Function for Task 4
    public static void isPalindrome() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();
        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    // Function for Task 5
    public static void printDivisors() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i);
                if (i != number) {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
    }

    // Function for Task 6
    public static void printMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
        }
    }

    // Function for Task 7
    public static void printMinMaxGrades() {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        double minGrade = findMinGrade(grades);
        double maxGrade = findMaxGrade(grades);

        System.out.println("Minimum grade: " + minGrade);
        System.out.println("Maximum grade: " + maxGrade);
    }

    public static double findMinGrade(double[] grades) {
        double min = grades[0];
        for (double grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }

    public static double findMaxGrade(double[] grades) {
        double max = grades[0];
        for (double grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    // Function for Task 8
    public static void checkFibonacci() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int a = 0, b = 1;

        while (a < number) {
            int temp = a;
            a = b;
            b = temp + b;
        }

        if (a == number) {
            System.out.println("The number is part of the Fibonacci series.");
        } else {
            System.out.println("The number is not part of the Fibonacci series.");
        }
    }

    // Function for Task 9
    public static void calculateProductWithoutMultiplication() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int result = 0;

        for (int i = 0; i < b; i++) {
            result += a;
        }

        System.out.println("The product of " + a + " and " + b + " is: " + result);
    }

    // Function for Task 10
    public static void printIsoscelesStarTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the isosceles star triangle: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j >= 1; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
