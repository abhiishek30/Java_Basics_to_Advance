//Que...university admission System

import java.util.Scanner;

public class conditional_que_UniversityAdmissSystem {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);

        System.out.println("\nUniversity Admission System\n");

        System.out.println(" admission rule : \n1.Admission granted if:\n" +
                "\n" +
                "PCM average ≥ 75\n" +
                "OR JEE percentile ≥ 95\n" +
                "\n" +
                "2.Scholarship if:\n" +
                "\n" +
                "PCM average ≥ 90\n" +
                "AND JEE percentile ≥ 98");

        System.out.println("\nEnter your subject marks of PCM");
        System.out.print("enter marks of physiscs : ");
        int p = S.nextInt();

        System.out.print("enter marks of chemistry : ");
        int c = S.nextInt();

        System.out.print("enter marks of maths : ");
        int m = S.nextInt();

        float avg = (p+c+m)/3F;
        System.out.print("your average marks of pcm is : ");
        System.out.print(avg);

        System.out.print("\nEnter your JEE percentile : ");
        float per = S.nextFloat();

        if(avg >= 75 && avg <= 100 || per >=95 && per <= 100)
        {
            System.out.println("your admission granted");
        } else {
            System.out.println(" you can not take admission");
            return;
        }if(avg >= 90 && avg <= 100 && per >=98 && per <= 100){
            System.out.println("you are eligible for your scholarship");
        }else{
            System.out.println("you are not eligible for your scholarship");
        }

        }

    }

