package programming.exercises.pkg3.pkg1;

import java.util.Scanner;

public class ProgrammingExercises31 {
    public static void main(String[] args) {
    
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        double D = b * b - 4.0 * a * c;
        if(D > 0){
        double root1 = (-b + Math.pow(D, 0.5)) / (2 * a); 
        double root2 = (-b - Math.pow(D, 0.5)) / (2 * a);
        System.out.println("The equation has two roots " + root1 + " and " + root2);
        }
        else if(D == 0.0){
        double root = -b / (2.0 * a);     
        System.out.println("The equation has one root " + root );
        }
        else
        System.out.println("The equation has no real roots");
        
    }
    
}
