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
    public static void main(String[] args)
    {
        System.out.println(ex1b(new String[]{"aba","saba","dana","hana","ana"},3));
    }
}