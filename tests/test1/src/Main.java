public class Main {
    public static boolean ex1a(String str, int len)
    {
        return str.length()>len;
    }
    public static int ex1b(String[] arr,int num)
    {
        int count = 0;
        for (String word : arr)
        {
            if (ex1a(word, num))
            {
                count++;
            }
        }
        return count;
    }
    public static int ex4(int[] arr)
    {
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] % 2 != 0 && arr[i+1] % 2 != 0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        System.out.println(ex1b(new String[]{"aba","saba","dana","hana","ana"},3));
        System.out.println(ex4(new int[]{2,-2,3,7,-5,4,8}));
    }
}