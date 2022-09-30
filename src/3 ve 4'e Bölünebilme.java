import java.util.Scanner;

public class SayiBulma {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int number,bolunenler=0,toplam=0;
        double ortalama;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        for(int i=0; i<=number; i++){
            if((i%3==0) && (i%4==0)){
                toplam += i;
                bolunenler++;
            }
        }
        if (bolunenler==1){
            System.out.print("Bölülen sayı yok");
        }else {
            ortalama = toplam/(bolunenler-1);
            System.out.print("3'e ve 4'e Bölünebilen sayıların ortalaması:" + ortalama);
        }
    }
}
