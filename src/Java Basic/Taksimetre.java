import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double yol,oran = 2.20 , fiyat, minimum = 20, baslangic = 10;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen yolu km cinsinden giriniz:");
        yol = input.nextDouble();
        fiyat = baslangic + (yol*oran);

        fiyat = ( fiyat<20 ) ? minimum : fiyat;
        System.out.print("Toplam Tutar:" + fiyat);

    }
}
