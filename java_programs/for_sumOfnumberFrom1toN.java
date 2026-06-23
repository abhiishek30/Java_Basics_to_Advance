//print sum of numbers from 1 to N


import java.util.Scanner;

public class for_sumOfnumberFrom1toN {
    public static void main(String[] args) {
        System.out.print("\nsum of numbers from 1 to ");
        Scanner S = new Scanner(System.in);
        int n=S.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {                              //first fault is that I declared the sum=0 inside the loop
                                       //second:i tried to print the value inside the loop
            sum = sum + i;
        }
            System.out.println(sum);
    }
}
