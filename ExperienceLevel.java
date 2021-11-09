package experience.level;

import java.util.Scanner;

public class ExperienceLevel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("complexity level? ");
        int level = inp.nextInt();
        String l = "";
        if(level >= 0 && level <= 5){   
            if(level <= 5 && level >= 4){
                l = "You are a pro gamer";
            }else if(level <=3 && level >= 2){
                l = "You are an experienced gamer";
            }else if(level == 1){
                l = "You are a beginner";
            }else 
                l = "You are a total newbie";
        }else 
            l = "Wrong input";
        
        System.out.println(l);
    }
    
}