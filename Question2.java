// 2. Write a Java program that calculates the sum of the digits in a number entered by the user using a loop. 
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum=0;
        sc.close();
        for(int i = 0; num>0;i++){
            int digit = num%10;
            sum = sum+digit;
            num = num/10;
        }
        System.out.println("the sum of digits is "+sum);
        
    }
    
}
