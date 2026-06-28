//find the sum of all even numbers from 1 to N.

import java.util.Scanner;

public class for_sumof_numbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print(" sum of all even numbers from 1 to ");
        int n = s.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++) {
            if (i % 2 == 0) {
                //System.out.println(i);
                sum = sum + i;
               System.out.println(sum);
            }
        }
    }
}
