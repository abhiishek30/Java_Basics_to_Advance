import javax.xml.transform.Source;
import java.util.Scanner;

public class greetingtouser {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter your name to greeted : ");
        String ch = S.nextLine();
        System.out.print("hii, ");
        System.out.print(ch);
        System.out.print("  ,how are you?");

    }
}
