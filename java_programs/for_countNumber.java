//count numbers between 1 and N(given number)


import java.util.Scanner;

public class for_countNumber {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = S.nextInt();

        for (int i = 1; i <= n; i++)
        {
            int df = (n - 1) - 1;
            System.out.println(df);
            break;
        }

    }
}
