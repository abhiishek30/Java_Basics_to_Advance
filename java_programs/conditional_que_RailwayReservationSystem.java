//RAILWAY RESERVATION SYSTEM

import java.util.Scanner;

public class conditional_que_RailwayReservationSystem {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);

        System.out.println("\nWelcome to cheap IRCTC reservation system\n");

        System.out.print("enter your name : ");
        String name = S.nextLine();

        System.out.print("choose gender(M/F) : ");
        String gen = S.next();

        System.out.print("enter age : ");
        int age=S.nextInt();

        System.out.println("Total Seats in Sleeper class : 72 ");
        System.out.println("Total Seats in A.C. class : 20 ");

        System.out.println("Which class you want to book ");
        System.out.println(" 1.Sleeper Class\n 2.A.C. class");
        int cls = S.nextInt();
         switch (cls){
             case 1 :
                 System.out.println("you choose Sleeper class");
                 break;
             case 2 :
                 System.out.println("you choose A.C. class");
                 break;
             default:
                 System.out.println("choose valid class");
                 return;
         }

         if(cls==1) {
             if (age <= 5) {
                 System.out.println("but you do not have to buy ticket,age is too low ");
             } else {
                 System.out.println("--Distance price of sleeper class -- ");

                 System.out.println("1.Distance <=100 =  2rs/km \n2.Distance <=500 = 1.85rs/km \n3.Distance <=1000 = 1.75rs/km \n4.Distance >1000 = 1.65rs/km");

                 System.out.print("Enter number of tickets you want to book : ");
                 int tc = S.nextInt();
                 if (tc > 72) {
                     System.out.println("tickets is not available");
                     System.out.println("you are in waiting list");
                 } else {
                     System.out.println("ticket is available");

                     System.out.print("Enter Destination Distance : ");
                     int dtn = S.nextInt();

                     if (dtn <= 100) {
                         System.out.print(" The ticket price is : ");
                         int prs = 2 * dtn * tc;
                         System.out.print(prs);
                         System.out.println("Rs");
                         System.out.println("Your Seats are Confirmed");
                     } else if (dtn <= 500) {
                         System.out.println(" The ticket price is : ");
                         float prs = 1.85f * dtn * tc;
                         System.out.print(prs);
                         System.out.println("Rs");
                         System.out.println("Your Seats are Confirmed");
                     } else if (dtn <= 1000) {
                         System.out.println(" The ticket price is : ");
                         float prs = 1.75f * dtn * tc;
                         System.out.print(prs);
                         System.out.println("Rs");
                         System.out.println("Your Seats are Confirmed");
                     } else {
                         System.out.println(" The ticket price is : ");
                         float prs = 1.65f * dtn * tc;
                         System.out.print(prs);
                         System.out.println("Rs");
                         System.out.println("Your Seats are Confirmed");
                     }
                 }
             }
         }
        else {
             if (age <= 5) {
                 System.out.println("but you do not have to buy ticket,age is too low ");
             } else {
                 System.out.println("--Distance price of A.C. class -- ");

                 System.out.println("1.Distance <=100 =  4rs/km \n2.Distance <=500 = 4.85rs/km \n3.Distance <=1000 = 4.75rs/km \n4.Distance >1000 = 4.65rs/km");

                 System.out.print("Enter number of tickets you want to book : ");
                 int tc = S.nextInt();
                 if (tc > 20) {
                     System.out.println("tickets is not available");
                     System.out.println("you are in waiting list");
                 } else {
                     System.out.println("ticket is available");

                     System.out.print("Enter Destination Distance : ");
                     int dtn = S.nextInt();
                     if (dtn <= 100) {
                         System.out.print(" The ticket price is : ");
                         int prs = 4 * dtn * tc;
                         System.out.print(prs);
                         System.out.println("Rs");
                         System.out.println("Your Seats are Confirmed");
                     } else if (dtn <= 500) {
                         System.out.println(" The ticket price is : ");
                         float prs = 4.85f * dtn * tc;
                         System.out.print(prs);
                         System.out.println("Rs");
                         System.out.println("Your Seats are Confirmed");
                     } else if (dtn <= 1000) {
                         System.out.println(" The ticket price is : ");
                         float prs = 4.75f * dtn * tc;
                         System.out.print(prs);
                         System.out.println("Rs");
                         System.out.println("Your Seats are Confirmed");
                     } else {
                         System.out.println(" The ticket price is : ");
                         float prs = 4.65f * dtn * tc;
                         System.out.print(prs);
                         System.out.println("Rs");
                         System.out.println("Your Seats are Confirmed");
                     }
                 }
             }
         }

    }
}
