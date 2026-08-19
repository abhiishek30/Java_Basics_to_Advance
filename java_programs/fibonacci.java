import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter number upto you want to print this series");
        int x = s.nextInt();
        int a=0;
        int b=1;
        int c=a+b;
        System.out.println("0");
        System.out.println("1");
        for(int i=2;i<x;i++) {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
