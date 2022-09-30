import java.util.Scanner;
public class EtkinlikOneri {
    public static void main(String[] args) {
        
        int sicaklik;
        Scanner input= new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz: ");
        sicaklik = input.nextInt();

        if(sicaklik<=5){
            System.out.println("Kayak yapabilirsiniz. ");
        }
        else if(5<sicaklik && sicaklik<=15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if(10<sicaklik && sicaklik<=25){
            System.out.println("Piknik yapabilirsiniz.");
        }
        if(sicaklik>25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }   
}
