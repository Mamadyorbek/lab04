package season.name.pkgif.pkgelse.pkgif;

import java.util.Scanner;

public class SeasonNameIfElseIf {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("month? ");
        int month = inp.nextInt();
        String t = "";
        if(month>=1 && month<=12){
            if(month >= 3 && month <= 5){
                t = "Spring";
            }else if(month >= 6 && month <= 8){
                t = "Summer";
            }else if(month >= 9 && month <= 11){
                t = "Autumn";
            }else 
                t = "Winter";
        }else
            t = "Didn't found month with this number";
        System.out.println(t);
        switch(month){
            case 3: t = "Spring"; break;
            case 6: t = "Summer"; break;
            case 9: t = "Autumn"; break;
            case 12: t = "Winter";
        }
        System.out.println(t);
    }
    
    
}
