import java.util.Scanner;
import java.lang.Math;

public class lesson9 {

    // Function to generate a random array of specified size
    public int[] generateRandomArray(int size) {
        int min = -2147483647;
        int max = 2147483647;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return arr;
    }

    // Exercise 1: Increment odd element at the specified index
    public void ex1(int index, int[] arr) {
        if (arr[index] % 2 != 0) {
            arr[index] += 1;
        }
    }

    // Exercise 2: Calculate and display the average of 5 grades
    public void ex2() {
        Scanner scan = new Scanner(System.in);
        double grade = 0;
        double sum = 0;
        double[] grade_arr = new double[5];

        for (int i = 0; i < grade_arr.length; i++) {
            System.out.println("Enter a grade:");
            grade = scan.nextDouble();
            grade_arr[i] = grade;
        }

        for (double g : grade_arr) {
            sum += g;
        }
        System.out.println("Average = " + sum / 5);
    }

    // Exercise 3: Find and return the minimum grade from user input
    public double ex3() {
        Scanner scan = new Scanner(System.in);
        double grade = 0;
        double min = 0;
        double[] grade_arr = new double[5];

        for (int i = 0; i < grade_arr.length; i++) {
            System.out.println("Enter a grade:");
            grade = scan.nextDouble();
            grade_arr[i] = grade;
        }

        for (double g : grade_arr) {
            if (g < min) {
                min = g;
            }
        }
        return min;
    }

    // Exercise 4: Display pairs of consecutive odd numbers in an array
    public void ex4(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] % 2 != 0) && (arr[i + 1] % 2 != 0))
                System.out.println(arr[i] + " " + arr[i + 1]);
        }
    }

    // Exercise 5: Check if a given number exists in a randomly generated array
    public boolean ex5(int num) {
        int[] arr = generateRandomArray(10);

        for (int n : arr) {
            if (num == n)
                return true;
        }
        return false;
    }

    // Exercise 6: Display the sum of consecutive elements if the sum is even
    public void ex6() {
        int[] arr = generateRandomArray(10);

        for (int i = 0; i < arr.length - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            if ((sum) % 2 == 0)
                System.out.println(sum);
        }
    }

    // Exercise 7: Replace the last element with the maximum value in the array
    public void ex7() {
        int num_max = 0;
        int[] arr = generateRandomArray(10);

        for (int n : arr) {
            if (n > num_max) {
                num_max = n;
            }
        }
        arr[9] = num_max;

        System.out.println("{");
        for (int num : arr) {
            System.out.println(num + ",");
        }
        System.out.println("}");
    }
}
