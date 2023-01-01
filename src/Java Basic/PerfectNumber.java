import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int num,total=0,select=1;
    
        do{
            System.out.print("Sayı giriniz: ");
            num=scan.nextInt();
        
            for(int i=1;i<num;i++ ){
                if(num%i==0){
                total+=i;
                }
            }
            if(total==num){
                System.out.print(num + " Mükemmel Sayıdır.");
            }else{
                System.out.print(num + " Mükemmel Sayı Değildir.");
            }
            System.out.println();
            System.out.print("Birbaşka sayı öğrenmek ister misiniz?\n1-Evet\n2-Hayır\nSeçim: ");
            select=scan.nextInt();
        }while(select==1);
        System.out.print("Tekrar görüşürüz!");
        
    }
    
}
