import java.util.Scanner;

public class while_multiplicationtable {
    public static void main(String[]args){
        System.out.print("Multiplication table of : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i<=10)
        {
            System.out.println(n*i);
            i++;
        }
    }
}
