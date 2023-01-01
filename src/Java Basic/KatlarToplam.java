import java.util.Scanner;

public class KatlarToplam {
    public static void main(String[] args) {
        
        int i,toplam=0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Sayı Giriniz: ");
            i=input.nextInt();
            if((i%2==0) && (i%4==0)){
                toplam+=i;
            }
        }while((i%2==0));
        System.out.println("Toplam: " + toplam);
    }
}
