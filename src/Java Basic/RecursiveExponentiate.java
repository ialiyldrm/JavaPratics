/*Taban ve üs değerleri kullanıcıdan alınan üs alma işlemini 
"Recursive" metot kullanarak yapan program*/
import java.util.Scanner;
public class RecursiveExponentiate {
    static double exponentiate(int a,int b){
        double result=1;

        if(b>0){
            for(int i=1 ; i<=b ; i++){
                result*=a;     
            }
        }
        else if(b<0){
            for(int i=-1;i>=b;i--){
                result*=a;
            }
            result=(1/result);
        }
        System.out.print("Sonuç:" + result);
        
        return result;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.print("Taban değeri giriniz :");
        a=input.nextInt();
        System.out.print("Üs değerini giriniz :");
        b=input.nextInt();
        
        exponentiate(a, b);
        
    }
    
}
