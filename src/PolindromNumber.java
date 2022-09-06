import java.util.Scanner;

public class PolindromNumber{
    static boolean isPolindrom(int number){
        int temp=number,reverseNumber=0,lastNumber;
        while(temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10) + lastNumber;
            temp/=10;
        }
        if(number==reverseNumber){
            System.out.print(number + " sayısı bir polindrom sayıdır.");
            return true;
        }
        else{
            System.out.print(number + " sayısı bir polindrom sayı değildir.");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        while(true){
        System.out.print("Sayıyı giriniz:");
        int number=input.nextInt();
        isPolindrom(number);
        System.out.println();
        }       
    }
}