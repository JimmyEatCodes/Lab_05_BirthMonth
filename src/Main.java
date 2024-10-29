import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int birthMonth = 0;
    String trash = " ";

        System.out.print("Enter your birth month [1-12]: ");

        if(in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine(); // clear the buffer
            if(birthMonth >= 1 && birthMonth <= 12)
            {
            if(birthMonth == 1)
            {
                 System.out.println("You said your birth month is January");
            }
             else if(birthMonth == 2)
            {
                    System.out.println("You said your birth month is February");
            }
             else if (birthMonth == 3)
             {
                    System.out.println("You said your birth month is March");
             }
             else if (birthMonth == 4)
             {
                    System.out.println("You said your birth month is April");
             }
            else if (birthMonth == 5)
            {
                System.out.println("You said your birth month is May");
            }
            else if (birthMonth == 6)
            {
                System.out.println("You said your birth month is June");
            }
            else if (birthMonth == 7)
            {
                System.out.println("You said your birth month is July");
            }
            else if (birthMonth == 8)
            {
                System.out.println("You said your birth month is August");
            }
            else if (birthMonth == 9)
            {
                System.out.println("You said your birth month is September");
            }
            else if (birthMonth == 10)
            {
                System.out.println("You said your birth month is October");
            }
            else if (birthMonth == 11)
            {
                System.out.println("You said your birth month is November");
            }
            else if (birthMonth == 12)
            {
                System.out.println("You said your birth month is December");
            }


               // System.out.println("You said your birth month is " + birthMonth);
            }
            else
            {
                System.out.println("This is an invalid input, run the program again with a valid input");
            }


        }
    else
    {
    trash = in.nextLine();
        System.out.println("You Entered " + trash + " which is an invalid input." );
        System.out.println("Run the program again with correct inputs");
    }




    }
}