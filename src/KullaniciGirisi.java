import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String usurName,password;
        Scanner input= new Scanner(System.in);

        System.out.print("Kullanıcı adı giriniz:");
        usurName=input.nextLine();
        
        System.out.print("Şifre giriniz:");
        password=input.nextLine();

        if(usurName.equals("patika")&& password.equals("java123")){
            System.out.print("Giriş yaptınız !");
        }
        
        else if(!password.equals("java123")){
            System.out.print("Şifreyi yanlış girdiniz!");
            System.out.println("Yeni şifre oluşturmak ister misiniz?");
            System.out.print("Y/N: ");
           
            String cevap=input.nextLine();
           
            if(cevap.equals("Y")){
                System.out.print("Yeni şifre giriniz:");
                String newPassword=input.nextLine();
                if(newPassword.equals("java123")||newPassword.equals(password)){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz." );
                }else{
                    System.out.print("Şifre oluşturuldu,");
                }
            }else{
                System.out.println("Tekrar giriş yapmayı deneyiniz!");
            }

        }else{
            System.out.print("Tekrar giriş yapmayı deneyiniz!");
        }             
    }
    
}
