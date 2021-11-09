package programming.exercises.pkg3.pkg15;

import java.util.Scanner;

public class ProgrammingExercises315 {
    public static void main(String[] args) {
        
        int lot = (int)(Math.random() * 1000);
        
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a three-digit number: ");
        int n = inp.nextInt();
        
        int lot1 = lot % 100;
        int lot2 = lot % 100 / 10;
        int lot3 = lot / 100;
        
        int lot5 = n % 100;
        int lot6 = n % 100 / 10;
        int lot7 = n / 100;
        
        System.out.println("The lottery numbers are: " + lot);
        String str = "";
        if(n == lot)
            str = "The award is $10000. Congratulation!";
        else if(lot6 == lot1 && lot5 == lot2 && lot7 == lot3)
            str = "The award is $3000. Congratulation!";
        else if( lot5 == lot1 || lot5 == lot2 || lot5 == lot3
                || lot6 == lot1 || lot6 == lot2 || lot6 == lot3
                || lot7 == lot1 || lot7 == lot2 || lot7 == lot3)
            str = "The award is $1000. Congratulation!";
        else
            str = "The award is $0. We are sorry!";
          
        }
    }
    