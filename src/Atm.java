import java.util.Scanner;

public class Atm{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        String usurName,password;
        int right=3;
        int select;
        int balance=1500;


        while(right>0){
            System.out.print("Kullanıcı adı giriniz:");
            usurName=input.nextLine();
            System.out.print("Şifre giriniz:");
            password=input.nextLine();

            if(usurName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba,Kodluyoruz Bankasına Hoşgeldiniz!");
                do{
                    System.out.println("1-Para yatırma\n" +
                                    "2-Para Çekme\n" +
                                    "3-Bakiye Sorgula\n" +
                                    "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
                    select=input.nextInt();

                    switch(select){
                        case 1:
                            System.out.print("Para miktarı: ");
                            int price=input.nextInt();
                            balance+=price;
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            price=input.nextInt();
                            if(price>balance){
                                System.out.println("Bakiyeniz yetersiz!");                           
                            }else{
                                balance-=price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+balance);
                            break;
                        default:
                            System.out.println("Hatalı seçim yaptınız.tekrar deneyiniz!");
                            break;
                    }

                }while (select != 4);      
                System.out.println("Tekrar görüşmek üzere.");
                break;

            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz!");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz!");
                }else{
                    System.out.println("Kalan hakkınız: "+ right);
                }
            }           
        }
    }
}