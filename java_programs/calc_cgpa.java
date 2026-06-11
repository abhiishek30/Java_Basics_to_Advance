import java.util.Scanner;

public class calc_cgpa {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("enter marks of given subjects to calculate cgpa ");
        System.out.println("enter marks of maths : ");
        int maths = S.nextInt();
        System.out.println("enter marks of biology : ");

        int bio = S.nextInt();
        System.out.println("enter marks of english : ");
        int eng = S.nextInt();

        float cgpa = (maths + bio + eng) / 30F;
        System.out.println(cgpa);
    }
}
