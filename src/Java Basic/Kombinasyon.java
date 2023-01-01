import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        /*Kombinasyon formülü
          C(n,r) = n! / (r! * (n-r)!) */
        
        int n,r,nFaktöriyel=1,rFaktöriyel=1,n_rFaktöriyel=1,kombinasyon;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        n = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        r = input.nextInt();

        for(int i=1; i<=n;i++){
            nFaktöriyel = nFaktöriyel*i;
        }

        for(int i=1; i<=r;i++){
            rFaktöriyel = rFaktöriyel*i;
        }
        
        for(int i=1; i<=(n-r);i++){
            n_rFaktöriyel = n_rFaktöriyel*i;
        }
        
        kombinasyon= nFaktöriyel / (rFaktöriyel * n_rFaktöriyel);

        System.out.print(n+"'in "+ r + " Kombinasyonu: " + kombinasyon);

    }
    
}
