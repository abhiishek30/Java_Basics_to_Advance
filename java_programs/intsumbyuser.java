import java.util.Scanner;

public class intsumbyuser {
    public static void main(String[] args) {
        System.out.println("take input from the user : ");
        Scanner S = new Scanner(System.in);
        System.out.println("enter number 1");
        int a =  S.nextInt();
        System.out.println("enter number 2");
        int b = S.nextInt();
        System.out.println("sum of A and B is : ");
        int sum = a+b;
        System.out.println(sum);


    }
}
