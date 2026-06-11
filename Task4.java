

import java.util.Scanner;

public class  Task4 {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

      System.out.print("Enter a String: ");

        String charles = input.nextLine();
        StringBuilder sb = new StringBuilder(charles);
        System.out.println(sb.reverse());


        
           if (charles.equals(sb.toString())) {


            System.out.println("The input string is a palindrome");
        } else {
            System.out.println("The input string is not a palindrome.");
        }


       



    }

}