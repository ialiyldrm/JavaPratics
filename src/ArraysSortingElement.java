import java.util.Arrays;
import java.util.Scanner;
public class ArraysSortingElement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Dizinin Boyutunu Giriniz : ");
        int n=scan.nextInt();

        int[] list=new int[n];
        
        System.out.println("Dizinin elemanlarını giriniz :");
        
        for(int i=0;i<list.length;i++){
            System.out.print((i+1)+". Elemanı : ");
            int value=scan.nextInt();
            list[i]=value;
        }

        Arrays.sort(list);
        
        System.out.println("Sıralama : " + Arrays.toString(list));
    }   
}
