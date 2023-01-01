import java.util.Arrays;
import java.util.Scanner;

public class MatrisTranspozone {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Matrisin Satır Sayısını Giriniz : ");
        int row=scan.nextInt();
        System.out.print("Matrisin Sütun Sayısını Giriniz : ");
        int column=scan.nextInt();

        int[][] list=new int[row][column];
        
        System.out.println("Matrisin elemanlarını giriniz :");
        
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print((i+1)+". Satır " + (j+1) + ". Sütun Elemanı :");
                int value=scan.nextInt();
                list[i][j]=value;                
            }
        }
        
        int[][] transpoze=new int[column][row];
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                transpoze[i][j]=list[j][i];
            }
        }
        
        System.out.print("Matris :");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(list[i][j] + " ");                               
            }
            System.out.println();
        }
        
        System.out.print("Transpoze :");
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                System.out.print(transpoze[i][j] + " ");                               
            }
            System.out.println();
        }
        
    }
    
}
