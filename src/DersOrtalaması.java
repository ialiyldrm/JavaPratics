
import java.util.Scanner;

public class DersOrtalaması {
    public static void main(String[] args) {
        int tarih, fizik, kimya, mat, turkce, muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.println("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        int toplam = (tarih + fizik + kimya + mat + turkce + muzik);
        double sonuc = toplam / 6.0;

        String durum = (sonuc >= 60) ? "Sınıfı Geçtiniz " : "sınıfta Kaldınız";

        System.out.print(durum);


    }
}


