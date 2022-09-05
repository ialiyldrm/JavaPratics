import java.util.Scanner;
public class JavaLoopII {
    public static void main(String[] args) {
        /* https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=false
           Solution. */

        Scanner input=new Scanner(System.in);
        int q=input.nextInt();
        
        for(int i=0;i<q;i++){
            int a=input.nextInt();
            int b=input.nextInt();
            int n=input.nextInt();
            int total=a;
            for(int j=0;j<n;j++){
                int x = (int)Math.pow(2,j)*b;
                total = total + x;
                System.out.print(" "+total);
            }
            if(i<q-1){
                System.out.print("\n");
            }              
        }
    }   
}
