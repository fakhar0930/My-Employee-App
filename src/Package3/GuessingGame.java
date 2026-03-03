package Package3;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        int number = (int) (Math.random()*100 +1);
        //System.out.println(number);

        System.out.println("Guess Your Number: ");

        Scanner sc = new Scanner(System.in);
        int counter=1;

        int guess=sc.nextInt();

       if (guess==number){
           System.out.println("You Guessed it right");
       } else {
           while (guess!=number){
               if (guess>number){
                   System.out.println("Too high! Try again.");
               } else {
                   System.out.println("Too low! Try again.");
               }
               counter++;
               guess=sc.nextInt();
               if (guess==number){
                   System.out.println("You Guessed it right, Woohoooo! Attempts Took : " + counter);
               }
           }
       }


    }
}
