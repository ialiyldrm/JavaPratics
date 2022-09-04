import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        int n1=input.nextInt();

        System.out.print("Bir sayı giriniz: ");
        int n2=input.nextInt();
        int i=1;
        int ebob=1;
        if(n1<n2){
            while(i<=n1){
                if(n1%i==0 && n2%i==0 ){
                   ebob=i;
                }
                i++;
            }
        }else{
            while(i<=n2){
                if(n2%i==0 && n1%i==0 ){
                    ebob=i;
                }
                i++;
            }
        }
        System.out.print(n1+" ve "+n2+" sayısının EBOB'u: "+ebob);
        System.out.println();
        int ekok=(n1*n2)/ebob;
        System.out.print(n1+" ve "+n2+" sayısının EKOK'u: "+ekok);       
    }    
}
