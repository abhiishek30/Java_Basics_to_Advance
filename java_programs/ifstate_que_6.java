//calculate bonus if salary>50k and if less,no bonus

import java.util.Scanner;

public class ifstate_que_6 {
    public static void main() {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter your salary in numbers : ");
        int sal = S.nextInt();
        if(sal>50000) {
            System.out.print("you get bonus of :  ");
            int b = 10 * sal /100 ;
            System.out.println(b);
            System.out.print("your new salary is : ");
            sal+= b;
            System.out.println(sal);
        }
        if(sal<50000){
            System.out.println("you did not get any bonus ");
            System.out.print("your salary will be remain same :  ");
            System.out.print(sal);
        }

    }
}
