import java.util.Scanner;

public class Exponentiate {
    public static void main(String[] args) {
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan program
        int a,b,total=1;
        Scanner input=new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz:");
        a=input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz:");
        b=input.nextInt();

        for(int i=1 ; i<=b ; i++){
            total*=a;     
        }
        System.out.print(a+"^"+b+"="+total);
    }
    
}
