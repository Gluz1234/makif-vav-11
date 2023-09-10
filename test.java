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
