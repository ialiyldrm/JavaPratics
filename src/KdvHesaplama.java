import java.util.Scanner;
/* Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18
tutar 1000 TL'den büyük ise KDV oranını %8 olarak
KDV tutarı hesaplayan programı yazınız.
*/
public class KdvHesaplama {
    public static void  main(String[] args){
        double fiyat,kdvoran, kdvTutar,kdvlifiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("Ürünün fiyatını giriniz:");
        fiyat= input.nextDouble();

        if (fiyat<=1000){
            kdvoran = 0.18;
            kdvTutar = fiyat * kdvoran ;
            kdvlifiyat = (fiyat + kdvTutar);
            System.out.println("KDV'siz fiyat: " + fiyat);
            System.out.println("KDV oranı: " + kdvoran);
            System.out.println("KDV tutarı: " + kdvTutar);
            System.out.println("KDV'li fiyat: " + kdvlifiyat);
        }
        else {
            kdvoran = 0.08;
            kdvTutar = fiyat * kdvoran ;
            kdvlifiyat = (fiyat + kdvTutar);
            System.out.println("KDV'siz fiyat: " + fiyat);
            System.out.println("KDV oranı: " + kdvoran);
            System.out.println("KDV tutarı: " + kdvTutar);
            System.out.println("KDV'li fiyat: " + kdvlifiyat);

        }




    }
}
