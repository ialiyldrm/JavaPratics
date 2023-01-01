import java.util.Scanner;

public class Exponentiate {
    public static void main(String[] args) {
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan program
        int a,b;
        Scanner input=new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz:");
        a=input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz:");
        b=input.nextInt();

        double total=1;

        if(b>0){
            for(int i=1 ; i<=b ; i++){
                total*=a;     
            }
        }
        else if(b<0){
            for(int i=-1;i>=b;i--){
                total*=a;
            }
            total=(1/total);
        }  
        System.out.print(a+"^"+b+"="+total);
    }
    
}
