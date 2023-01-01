import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        // Artık yıl hesaplama.
        int year;

        Scanner input= new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();

        if ((year%100==0)){
            if(year%400==0){
                System.out.print(year + " bir artık yıldır!");
            }else{
                System.out.print(year + " bir artık yıl değildir!");
            }    
        }
        else if(year%4==0){
            System.out.print(year + " bir artık yıldır!");
        }
        else{
            System.out.print(year + " bir artık yıl değildir!");
        }
    }
}