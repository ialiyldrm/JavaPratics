import java.util.Scanner;


public class PrimeNumberRecursive {
    static void primeNumber(int number){

        boolean result=false;
        for(int i=2;i<number;i++){
            if(number%i==0){
                result=false;
                break;
            }else{
                result=true;
                break;
            }
        }
        if(result){
            System.out.println(number + " ASALDIR!");
        }else{
            System.out.println(number + " ASAL DEĞİLDİR!");
        }
    
    }    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Sayı Giriniz:");
        int number=input.nextInt();

        primeNumber(number);


    }
    
}
