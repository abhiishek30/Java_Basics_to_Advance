//write table of any number

import java.util.Scanner;

public class for_multiplicationTable {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("\nprint table of : ");
        int a= S.nextInt();
        for(int i=1;i<=10;i++)
        {
            int b =a*i;
            System.out.println(b);
        }

    }
}
