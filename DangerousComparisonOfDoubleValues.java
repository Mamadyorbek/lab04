package dangerous.comparison.of.pkgdouble.values;
public class DangerousComparisonOfDoubleValues {
    public static void main(String[] args) {
        double d = 0.1, sum=0;
        for (int i = 0; i < 10; i++) {
            sum += d;
            System.out.println(i + ") " + sum);
        }
        if(sum == 1.0)
            System.out.print("Equal");
        else
            System.out.print("Not equal");
            
    }
    
    
}
