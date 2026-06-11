import java.util.Scanner; //for using scanner,this is must....

public class que_basic_math {
    public static void main(String[] args) {

        // que: subtract 34.40  from 45.40 and add in substraction of 65 and 21.

        //first we substract 34.40 from 45.40
        float a = 45.40F;
        float b = 34.40F;
        float sub = a-b;
        System.out.print("subs of 45.40 and 34.40 is : ");
        System.out.println(sub);

        System.out.println("now we sub 65 and 21");
        int a_ = 65;
        int b_ = 21;
        int sub_ = a_ - b_;

        System.out.print("Ans is ");
        System.out.println(sub_);

        System.out.print("now we add ");
        System.out.print(sub);
        System.out.print(" and ");
        System.out.print(sub_);
        System.out.println();
        System.out.print("The ans is : ");
        System.out.print(sub + sub_);



    }
}
