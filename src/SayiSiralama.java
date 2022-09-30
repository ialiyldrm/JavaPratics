import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[] args) {
        //Sayıları küçükten büyüğe sıralama programı
        int num1,num2,num3;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz: ");
        num1=input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        num2=input.nextInt();
        
        System.out.print("Üçüncü Sayıyı Giriniz: ");
        num3=input.nextInt();

        if((num1<num2)&&(num1<num3)){
            if(num2<num3){
                System.out.print(num1+"<"+num2+"<"+num3);
            }else{
                System.out.print(num1+"<"+num3+"<"+num2);
            }
        }else if((num2<num1)&&(num2<num3)){
            if(num1<num3){
                System.out.print(num2+"<"+num1+"<"+num3);
            }else{
                System.out.print(num2+"<"+num3+"<"+num1);

            }
        }else{
            if(num1<num2){
                System.out.print(num3+"<"+num1+"<"+num2);
            }else{
                System.out.print(num3+"<"+num2+"<"+num1);
            }
        }         
    }
    
}
