import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        double alan,cevre,pi=3.14,yaricap,aciAlan,aci;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Dairenin yarıçapı: ");
        yaricap= input.nextDouble();
        
        System.out.print("Açı ölçüsü: ");
        aci=input.nextDouble();

        cevre=2*pi*yaricap;
        alan=pi*yaricap*yaricap;
        aciAlan=(pi*(yaricap*yaricap)*aci)/360;

        System.out.println("Dairenin Çevresi:" + cevre);
        System.out.println("Dairenin Alanı:"+ alan);
        System.out.println("Daire Dilimi Alanı:"+ aciAlan);
    }
}
