import java.util.Scanner;

public class KuvvetlerBulma {
    public static void main(String[] args) {

        // Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program
        int sayi,i;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sınır sayısı giriniz: ");
        sayi = input.nextInt();

        System.out.println("4'ün Katları:");
        for ( i=1;i<sayi;i*=4){
            System.out.println(i);
        }
        System.out.println("5'in Katları:");
        for ( i=1;i<sayi;i*=5){
            System.out.println(i);
        }
    }
    
}
