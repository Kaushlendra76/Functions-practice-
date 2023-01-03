import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter the counting number");
        int a = sc.nextInt();
        int count = 0;
        while (n>0) {
            int rem = n%10;
            if(rem==a){
                count++;
            }
            n = n/10;
            
        }
        System.out.println(count);
    }
}
