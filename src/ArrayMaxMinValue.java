import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxMinValue {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    
        int[] list={15,12,-5,788,1,-1,-778,2,0};
        int min = list[0];
        int max = list[0];
        
        System.out.println("Dizi :" + Arrays.toString(list));
        
        System.out.print("Girilen Sayı :");
        int n=scan.nextInt();
        
        //Önce diziyi sıralayıp sonra girdiğimiz sayı ile dizinin elemanlarını karşılaştırıyoruz.
        
        Arrays.sort(list);{
        }
        
        for (int i : list) {
            
            if (i < n) {
                min = i;
            }

            if (i > n) {
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı :" + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı :" + max);      
    }
    
}
