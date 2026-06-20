//user authentication

import java.util.Scanner;

public class conditional_que_userauthentication {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("\nlogin page of your instagram");

        String a = "abhiishek30";
        String b = "567";
        System.out.print("\nEnter Username : ");
        String un = S.next();

        System.out.print("\nEnter your password : ");
        String pw = S.next();


        if(un.equals(a) &&  pw.equals(b)){
            System.out.println("login Successful");
        }
        else if(un.equals(a)){
            System.out.println("wrong password");
        }
        else{
            System.out.println("username not found");
        }
    }
}
