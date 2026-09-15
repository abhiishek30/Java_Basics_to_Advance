import java.util.Scanner;

public class while_factorial {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter number to find factorial : ");
        int n = s.nextInt();
        int f=1;
        int i=1;
        while(i<=n)
        {
            f=f*i;
            i++;
        }
        System.out.println(f);
    }
}
