import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        int number=input.nextInt();
        int basValue;
        int result=0;
        
        while(number!=0){
            basValue=number%10;
            number/=10;
            result+=basValue;           
        }
        System.out.println(result);

    }
    
}
