import java.util.Scanner;

public class FibonacciNumber{
    public static void main(String[] args) {

        int num1,num2=1,result=0;

        Scanner scan=new Scanner(System.in);

        System.out.print("Fibonacci Dizisi Basamak Sayısı Giriniz:");
        int num=scan.nextInt();

        for(int i=1;i<num;i++){
            
            num1=num2;
            num2=result;
            result=num1+num2;
            System.out.print(result+" ");           
        }
    }

}