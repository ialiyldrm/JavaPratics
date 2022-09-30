import java.util.Scanner;
public class DersOrtalamaHesaplama 
{
    public static void main(String[] args) {
        
        int mat,fizik,kimya,muzik,tukce,dersler=0,toplam=0;

        
        Scanner input = new Scanner(System.in);
 
        System.out.print("Matematik notunu giriniz:");
        mat=input.nextInt();
        if(!((mat<0)||(mat>100))){
            toplam+=mat;
            dersler ++ ;
        }else{
            System.out.println("Notunuz 0'dan küçük, 100'den büyük olamaz!");
        }

        System.out.print("Fizik notunu giriniz:");
        fizik=input.nextInt();
        if(!((fizik<0)||(fizik>100))){
            toplam+=fizik;
            dersler ++ ;
        }else{
            System.out.println("Notunuz 0'dan küçük, 100'den büyük olamaz!");
        }

        System.out.print("Kimya notunu giriniz:");
        kimya=input.nextInt();
        if(!((kimya<0)||(kimya>100))){
            toplam+=kimya;
            dersler ++ ;
        }else{
            System.out.println("Notunuz 0'dan küçük, 100'den büyük olamaz!");
        }

        System.out.print("Müzik notunu giriniz:");
        muzik=input.nextInt();
        if(!((muzik<0)||(muzik>100))){
            toplam+=muzik;
            dersler ++ ;
        }else{
            System.out.println("Notunuz 0'dan küçük, 100'den büyük olamaz!");
        }

        System.out.print("Türkçe notunu giriniz:");
        tukce=input.nextInt();
        if(!((tukce<0)||(tukce>100))){
            toplam+=tukce;
            dersler ++ ;
        }else{
            System.out.println("Notunuz 0'dan küçük, 100'den büyük olamaz!");
        }

        double ortalama = toplam / dersler;
        if(ortalama<55){
            System.out.println("Sınıfta Kaldınız!");
        }else{
            System.out.println("Sınıfı geçtiniz!");
        }
        System.out.print("Ortalamanız: " + ortalama);
    }
}