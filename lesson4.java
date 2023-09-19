import java.util.Scanner;
import java.util.Random;
public class MAIN_2
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three names: ");
        String name1 = scan.next();
        String name2 = scan.next();
        String name3 = scan.next();

        System.out.println("Enter a three lettered word to check if it is a palindrome: ");
        char[] arr = new char[3];
        arr = scan.next().toCharArray();
        boolean v = ex3(arr,0,arr.length-1);
        System.out.println("v = " + v);
        System.out.println("Enter a three lettered word to print it the other way around: ");
        String word_4 = scan.next();
        ex4(word);
        String vowel_str = "aeoiu";
        System.out.println("Enter a four lettered word to print it without vowels: ");
        String word_5 = scan.next();
        ex5(word_5,0,"",vowel_str);
        Random r = new Random();
        ex6(r.nextInt(99));
    }
    public static boolean ex3(char[] arr, int left, int right)
    {
        if(arr[left++] != arr[right--])
            return false;
        if(left < right)
            ex3(arr, left++, right--);
        return true;
    }
    public static void ex4(String str4)
    {
        String new_str4 = str4.substring(2) + str4.substring(1,2) + str4.substring(0,1);
        System.out.println("str4 = " + str4);
    }
    public static void ex5(String str5,int i,String new_string, String vowel_str)
    {
        if (str5.length() == new_string.length())
        {
            System.out.println("new_string = " + new_string);
            return;
        }
        char cur_letter = str5.charAt(i);
        if (vowel_str.indexOf(cur_letter) == -1)
        {
            new_string += cur_letter;
        }
        else {
            new_string += '*';
        }
        i++;
        ex5(str5,i,new_string,vowel_str);
    }
    public static void ex6(int num)
    {
        if (num < 10)
        {
            System.out.println("The number is one digit");
        }
        else
        {
            System.out.println("The number is two digit");
        }
        if (num % 2 == 0 & num % 3 == 0)
        {
            System.out.println("The number is dividable by 2 and 3");
        }
        else if (num % 2 == 0)
        {
            System.out.println("The number is dividable by 2");
        }
        else if (num % 3 == 0)
        {
            System.out.println("The number is dividable by 3");
        }
        else
        {
            System.out.println("The number is not dividable by 2 or 3");
        }
    }
}
