package number.of.days;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
                        
        System.out.print("Year? ");
        int Y = inp.nextInt();
        System.out.print("Month? ");
        int M = inp.nextInt();
        String days = "";
       
        switch (M){
            case 1: days = "31"; break;
            case 2: 
                if((Y % 400 == 0) || ((Y % 4 == 0) && (Y % 100 != 0))){
                    days = "29";
                }else{
                    days = "28";} break;
            case 3: days = "31"; break;
            case 4: days = "30"; break;       
            case 5: days = "31"; break;
            case 6: days = "30"; break;
            case 7: days = "31"; break;
            case 8: days = "31"; break;       
            case 9: days = "30"; break; 
            case 10: days = "31"; break;
            case 11: days = "30"; break;
            case 12: days = "31";            
        } 
         System.out.println(days);
        }
    }
    

