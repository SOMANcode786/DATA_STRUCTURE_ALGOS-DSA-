package BasicMathForJava;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number: ");
	        int n = sc.nextInt();
	        sc.close();
	        
	        int reversed=0;
	        int dup=n;
	        while(n>0) {
	        	  int digit = n % 10;  // Extract last digit
	              reversed = reversed * 10 + digit; // Append digit to reversed number
	              n = n / 10;
	           
	        }
	        if(reversed==dup) {
          	  System.out.println("true the number you enter not a palindrome");
            }
            else {
          	  System.out.println("False");
            }
		
    }
}
