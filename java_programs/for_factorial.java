//find factorial of given numbers


import java.util.Scanner;

public class for_factorial {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("\nfactorial of number : ");
        int fc=S.nextInt();
        int f=1;
       for(int i=1;i<=fc;i++){
            f=f*i;
        }
        System.out.println(f);
    }
}
