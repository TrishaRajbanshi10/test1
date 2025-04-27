import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        int product = 1;
        
        while (num > 0) {
            product = product * (num % 10); 
            num = num / 10;                
        }
        
        System.out.println("The product of the given number: " + product);
        
        input.close();
    }
}

