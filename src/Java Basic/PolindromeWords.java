import java.util.Scanner;

class PolindromeWords{
    public static void main(String[] args) {
        
        String original, reverse = ""; // Objects of String class  
        
        Scanner input = new Scanner(System.in);   
        
        System.out.print("Enter a string to check if it is a palindrome:");  
        original = input.nextLine();

        
        int length = original.length(); 

        for ( int i = length - 1; i >= 0; i-- ){
            reverse += original.charAt(i);
        }             

        if (original.equals(reverse)){
            System.out.println(original + " is a palindrome.");  
        }else{  
            System.out.println(original + " isn't a palindrome.");
        }                 
    }
}