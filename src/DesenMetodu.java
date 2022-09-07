/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan 
döngü kullanmadan bir "Recursive" metot yazın

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. 
Her çıkarma işlemi sırasında ekrana son değeri yazdırın. 
Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. 
Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
*/
import java.util.Scanner;
public class DesenMetodu {
    /* Döngü ile oluşturumuş Desen Metodu:

    static void desen(int N){
        
        System.out.print("Deseni: " + N +" ");
        int temp=N;
        while(true){  
            int result=N;
            result-=5;
            N=result;
            System.out.print(N+" ");
            if(result<=0){
                break;
            }
        }
        while(true){
            int result=N;
            result+=5;
            N=result;
            System.out.print(N+" ");
            if(result==temp){
                break;
            }
        }
        
    }
    */
    static void desen(int N){
        //döngü kullanmadan oluşturulan desen metodu:
        if(N>0){
            System.out.print(N+" ");
            desen(N-5);
        }
        System.out.print(N +" ");
            
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("N Sayısı:");
        int N=input.nextInt();
        System.out.print("Çıktısı:");
        desen(N);

        
    }
    
}
