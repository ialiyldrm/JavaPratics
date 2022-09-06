import java.util.Scanner;
public class HesapMakinesiRecursive {
    //Toplama işlemi metodu:
    static void plus(){
        Scanner input=new Scanner(System.in);
        int number,result=0;
        System.out.print("Kaç tane sayı gireceksiniz:");
        int sayi=input.nextInt();
        for (int i = 1; i <= sayi; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result+=number;
        }
        System.out.print("Sonuç= "+ result);              
    }
    //Çıkarma işlemi metodu:
    static void minus(){
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        int sayi=input.nextInt();
        int number,result=0;
        for (int i = 1; i <= sayi; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }                               
            result-=number;
        }
        System.out.print("Sonuç= "+ result);
    }
    //Çarpma işlemi Metodu:
    static void times(){
        Scanner input = new Scanner(System.in);
        int number, result = 1;

        System.out.print("Kaç tane sayı gireceksiniz:");
        int sayi=input.nextInt();

        for(int i=1;i<=sayi;i++) {
            System.out.print(i + ". sayı :");
            number = input.nextInt();
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç : " + result);
    }
    //Bölme işlemi Metodu:
    static void divided(){
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        int sayi=input.nextInt();
        double number, result=0.0;
        for(int i=1;i<=sayi;i++){
            System.out.print(i + ". sayı :");
            number = input.nextDouble();
            if( i!=1 && number==0){
                System.out.println("Böleni 0 giremezsiniz:");
                continue;
            }
            if(i==1){
                result=number;
                continue;
            }
            result/=number;           
        }
        System.out.println("Sonuç : " + result);
    }
    //Üs alma Metodu:
    static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = input.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }
    //Faktoriyel Hesaplama Metodu:
    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    // Mod Alma Metodu:
    static void mod(){
        Scanner input = new Scanner(System.in);
         
        System.out.println("Sayı giriniz:");
        int number1=input.nextInt();
        
        System.out.println("Mod Değeri Giriniz:");
        int number2=input.nextInt();
        
        int result = number1 % number2;
        
        System.out.println("Sonuç : " + result);
    }
    //Dikdörtgen Alan ve Çevre Hesabı Metodu:
    static void rectangle(){
        Scanner input = new Scanner(System.in);

        System.out.println("1.Kenar Uzunluğu Giriniz::");
        int number1=input.nextInt();
        
        System.out.println("2.Kenar Uzunluğu Giriniz:");
        int number2=input.nextInt();

        int area = number1 * number2;
        System.out.println("Diktörgen Alanı:" + area);

        int circumference = (2 * (number1+number2));
        System.out.println("Diktörgen Çevresi:" + circumference);
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        int select;
        do{
            System.out.println();
            System.out.println(menu);
            System.out.print("Yapmak İstediğiniz işlemi seçiniz:");
            select=input.nextInt();
            switch(select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.print("Hatalı giriş yaptınız.Tekrar deneyiniz!");
            }
        }while(select!=0);
    }
    
}
