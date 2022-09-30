import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        double height,weight,BMI;

        Scanner input= new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu(Metre cinsinden) Giriniz:");
        height=input.nextDouble();

        System.out.print("Lütfen Kilonuzu(Kilogram cinsinden) Giriniz:");
        weight=input.nextDouble();

        BMI=weight/(height*height);

        System.out.print("Beden Kitle Endeksiniz:" + BMI);


    }
}
