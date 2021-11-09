package programming.exercises.pkg3.pkg23;

import java.util.Scanner;

public class ProgrammingExercises323 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double coor1 = inp.nextDouble();
        double coor2 = inp.nextDouble();
        
        String res = "";
        if(coor1 <= (10 / 2) && coor2 <= (5 /2))
            res = " is in the rectangle";
        else
            res = " is not in the rectangle";
        
        System.out.println("Point " + "(" + coor1 + ", " + coor2 + ")" + res);
    }
    
}
