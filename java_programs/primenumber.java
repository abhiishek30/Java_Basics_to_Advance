import java.util.Scanner;

public class primenumber {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not prime");
                break;
            } else {
                System.out.println(num + " is prime");
                break;
            }
        }
    }
}
