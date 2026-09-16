import java.util.Scanner;

public class menudriven_do_while {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Menu Driven Program\n");

        System.out.println("  1.add\n  2.substract\n  3.press if you want to do again\n");
        int n = s.nextInt();
        switch (n)
        {
            case 1:
                System.out.println("enter two digits to add : ");
                System.out.print("digit a = ");
                int a = s.nextInt();
                System.out.print("digit b = ");
                int b = s.nextInt();
                int c=a+b;
                System.out.println("sum of two digits = "+c);
                break;
            case 2:
                System.out.println("enter two digits to substract : ");
                System.out.print("digit a = ");
                int l = s.nextInt();
                System.out.print("digit b = ");
                int m = s.nextInt();
                int o =l-m;
                System.out.println("sub of two digits = "+o);
                break;
            case 3:
                System.out.println("Run this code again");
                break;
            default:
                System.out.println("invalid number");
        }

    }
}
