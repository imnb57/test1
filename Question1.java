// 1. Write a Java program to reverse a word provided by the user. 
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.nextLine();
        String reversedword="";
        sc.close();
        for(int i =word.length()-1;i>=0;i--){
            reversedword =reversedword + word.charAt(i);
        }
        System.out.println("reversed word is "+reversedword);
    }

}
