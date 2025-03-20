import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close(); // Always close Scanner to avoid memory leaks

        int reversed = 0;

        while (n > 0) {
            int digit = n % 10; // Extract last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
            n = n / 10; // Remove last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}
