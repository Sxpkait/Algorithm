import java.util.Scanner;

public class Sum {
    public static void main (String args[]) {
        // int num1 =4;
        // int num2 =6;
 
        Scanner Scanner=new Scanner (System.in);

        System.out.print("Enter num1: ");
        int num1 = Scanner.nextInt();
        
        System.out.print("Enter num2: ");
        int num2 = Scanner.nextInt();


        int sum = num1+num2;
        System.out.println("Sum of " +num1 + " and " +num2 +" = " +sum);
    }
}