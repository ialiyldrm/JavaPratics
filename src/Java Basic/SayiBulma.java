import java.util.Scanner;

public class SayiBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Girilen sayıların en büyük ve en küçük olanlarını bulan program.

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int sayi=input.nextInt();
        
        int n=1;
        System.out.print(n+". "+"Sayıyı giriniz: ");
        int girdi=input.nextInt();
        int enBuyuk=girdi;
        int enKucuk=girdi;
        n++;

        for(int i=1;i<sayi;i++){
            System.out.print(n+". "+"Sayıyı giriniz: ");
            girdi=input.nextInt();
            n++;
            if(girdi>enBuyuk){
                enBuyuk=girdi;
            }
            if(girdi<enKucuk){
                enKucuk=girdi;
            }
        }
        System.out.print("En büyük sayı:"+ enBuyuk);
        System.out.println();
        System.out.print("En küçük sayı:"+ enKucuk);
        
    }
    
}

