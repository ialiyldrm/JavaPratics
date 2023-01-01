import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican;
        //meyvelerin fiyatları
        double armutf=2.14, elmaf=3.67, domatesf=1.11, muzf=0.95, patlicanf=5.00;
        Scanner input=new Scanner(System.in);
        System.out.print("Armut Kilosunu Giriniz:");
        armut=input.nextDouble();
        System.out.print("Elma Kilosunu Giriniz:");
        elma=input.nextDouble();
        System.out.print("Domates Kilosunu Giriniz:");
        domates=input.nextDouble();
        System.out.print("Muz Kilosunu Giriniz:");
        muz=input.nextDouble();
        System.out.print("Patlıcan Kilosunu Giriniz:");
        patlican=input.nextDouble();
        double Toplam=(armut*armutf)+(elma*elmaf)+(domates*domatesf)+(muz*muzf)+(patlican*patlicanf);
        System.out.print("Toplam Tutar:"+ Toplam +" Tl");



    }
}
