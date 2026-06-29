import java.util.Scanner;

public class for_sumof_oddNo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter number from 1 to : ");
        int a=s.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
                System.out.println(sum);
            }
        }
    }
}
