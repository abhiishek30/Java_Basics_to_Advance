/*   que...Input one character and determine:

 Uppercase?
 Lowercase?
 Vowel?
 Consonant?
 Digit?
 Special character?           */

import java.util.Scanner;

public class star_conditional_que_determine_digit_upper_lower {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.print("\n enter any one character : ");
        char ch = S.next().charAt(0);


        if (ch>='A' && ch<='Z') {
            System.out.println("character is uppercase");
            if (( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                System.out.println("character is vowel");
            } else  {
                System.out.println("character is consonant ");
            }
        }

        else if(ch>='a' && ch<='z') {
            System.out.println("character is lowercase");
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("character is vowel");
            } else {
                System.out.println("character is consonant");
            }
        }
        else if(ch>=0 && ch<=9)
        {
            System.out.println("character is digit");
        }
        else{
            System.out.println("character is special character");
        }
    }
}