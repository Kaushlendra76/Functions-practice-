import java.util.Scanner;

/**
 * casecheck
 */
public class casecheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a chracter");
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("LowerCase");
            
        } else {
            System.out.println("UpperCase");
        }
    }
    
}