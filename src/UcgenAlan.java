import  java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        // üçgenin kenarları a,b,c
        int a,b,c;

        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin 1.kenar uzunluğu:");
        a= input.nextInt();
        System.out.print("Üçgenin 2.kenar uzunluğu:");
        b= input.nextInt();
        System.out.print("Üçgenin 3.kenar uzunluğu:");
        c= input.nextInt();
        int cevre= a + b + c;
        /* Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/
        double u = cevre/2.0;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin Alanı: "+ alan);
    }
}
