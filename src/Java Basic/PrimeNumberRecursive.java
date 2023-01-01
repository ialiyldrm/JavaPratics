import java.util.Scanner;


public class PrimeNumberRecursive {
    static void primeNumber(int number){

        boolean result=false;
        if(number==2){
            result=true;
        }else{
            for(int i=2;i<number;i++){
                if(number%i==0){
                    result=false;
                    break;
                
                }else{
                    result=true;                    
                }
            }
        }
        
        if(result){
            System.out.println(number + " SAYISI ASALDIR!");
        }else{
            System.out.println(number + " SAYISI ASAL DEĞİlDİR!");
        }
    
    }    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Sayı Giriniz:");
        int number=input.nextInt();

        primeNumber(number);


    }
    
}
