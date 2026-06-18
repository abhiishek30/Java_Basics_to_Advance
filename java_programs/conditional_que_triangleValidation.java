//check triangle validation


import java.util.Scanner;
// TRIANGLE VALIDATION AND TYPES


public class conditional_que_triangleValidation {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Check Triangle Validation by entering sides ");

        System.out.print("Enter first Side of Triangle : ");
        int fs = S.nextInt();

        System.out.print("Enter second Side of Triangle : ");
        int ss = S.nextInt();

        System.out.print("Enter third Side of Triangle : ");
        int ts = S.nextInt();


        if(fs +ss > ts && fs + ts > ss && ts + ss > fs) {

            System.out.println("Triangle can be formed");
            if (fs == ss && ss == ts && ts == fs) {

                System.out.println("it is equilateral triangle");
            } else if (fs == ss && ss != ts || fs != ss && fs == ts || fs != ss && ss == ts) {

                System.out.println("it is isosceles triangle");
            } else {
                System.out.println("it is scalene triangle");
            }
        }else{
            System.out.println("Invalid sides,Triangle can not be formed");
        }

    }


    }


