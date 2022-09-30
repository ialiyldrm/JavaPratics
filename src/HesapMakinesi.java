import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args){
        int n1,n2,islem;
        Scanner input=new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz:");
        n1=input.nextInt();
        System.out.print("2. Sayıyı Giriniz:");
        n2=input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak istediğiniz işleminin numarasını seçiniz:");
        islem=input.nextInt();
        switch(islem){
            case 1:
                System.out.print("Toplam:"+ (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkan:"+ (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpım:"+ (n1 * n2));
                break;
            case 4:
                if(n2!=0){
                    System.out.print("Bölüm:"+ (n1 / n2));
                }else{
                    System.out.println("Bir sayı sıfıra bölünemez!");
                }                    
                break;
            default:
                System.out.print("Yanlış işlem yaptınız.Tekrar deneyiniz!");
        }
    }
}
