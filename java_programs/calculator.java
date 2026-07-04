import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("\nChoose option\n \n1.addition\n2.substraction\n3.multiplication\n4.division");
        int n=S.nextInt();
        switch (n) {
            case 1:

                System.out.print("enter first number : ");
                int a = S.nextInt();
                System.out.print("enter second number : ");
                int b = S.nextInt();
                int c = a + b;
                System.out.println(c);
                break;

            case 2:

                System.out.print("enter first number : ");
                int d = S.nextInt();
                System.out.print("enter second number : ");
                int e =S.nextInt();
                int f= d-e;
                System.out.println(f);
                break;
            case 3:

                System.out.print("enter first number : ");
                int g = S.nextInt();
                System.out.print("enter second number : ");
                int h =S.nextInt();
                int i= g*h;
                System.out.println(i);
                break;
            case 4:

                System.out.print("enter first number : ");
                int j = S.nextInt();
                System.out.print("enter second number : ");
                int k =S.nextInt();
                int l= j/k;
                System.out.println(l);
                break;
            default:
                System.out.println("enter valid number");

        }

    }
}
