import java.util.Scanner;

/**
 * largerandsmaller
 */
public class largerandsmaller {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the three numbers ");
        int a = sc.nextInt();
        int  b = sc.nextInt();
         int c = sc.nextInt();
         int larg = larger(a, b, c);
         System.out.println( "The largest number is " + larg);
        int small = smaller(a,b, c);
        System.out.println( "the smaller number is " + small);

        
    }
    static int larger(int x, int y, int z){
        int larger = x;
        if (larger<y) {
            larger =y;
            
        }if (larger<z){
        larger = z;
        
        }
        return larger;
    }
    static int smaller(int x, int y, int z){
        int smaller = x;
        if (smaller>y) {
            smaller = y;
        }if (smaller>z) {
            smaller = z;
        }
        return smaller;
    }
}
