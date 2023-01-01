import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int kenar1,kenar2;
        double kenar3;

        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin 1.kenar uzunluğu:");
        kenar1= input.nextInt();
        System.out.print("Üçgenin 2.kenar uzunluğu:");
        kenar2= input.nextInt();
        kenar3 = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
        System.out.print("Hipotenüs:"+ kenar3);

    }
}
