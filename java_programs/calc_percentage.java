import java.util.Scanner;

//que... calculate percentage of given student in CBSE board exam .
//       his marks from 5 subjects must be taken as input from the keyboard(marks are out of hundred)


public class calc_percentage {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("write total marks of individual subject like 100 or 200 or AS you wish");
        int f = S.nextInt();
        System.out.print("write marks of 5 subejcts you get , out of ");
        System.out.println(f);
        System.out.print("marks of Maths : ");
        int a = S.nextInt();
        System.out.print("marks of Chemistry : ");
        int b = S.nextInt();
        System.out.print("marks of physics : ");
        int c = S.nextInt();
        System.out.print("marks of Hindi : ");
        int d = S.nextInt();
        System.out.print("marks of English : ");
        int e = S.nextInt();

        float sum= a+b+c+d+e;
       // System.out.print("write total marks of all subject : ");
        //int g = S.nextInt();
        int g = (f+f+f+f+f);
        float percentage = sum/g*100F;
        System.out.println("percentage of 5 subject of student is : ");
        System.out.print(percentage);
    }
}
