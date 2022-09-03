import java.util.Scanner;

public class HarmonikSeri{
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int sayi=input.nextInt();

        double sonuc=0;
        int i=1;
        while(i<=sayi){
            sonuc+=(1.0/i);
            i++;
        }
        System.out.print("Sayının Harmonik Serisi: "+ sonuc);

    }
}