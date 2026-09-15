import java.util.Scanner;

public class while_sum_of_numbers {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
       // int n = s.nextInt();
        System.out.print("sum of numbers from 1 to ");
        int n = s.nextInt();
        int sum=0;
        int i=1;
        while(i<=n)
        {
            sum = sum+i;
            //System.out.println(sum);
            i++;
        }
        System.out.println(sum);
    }
}
