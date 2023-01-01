import java.util.Scanner;

public class BiletFiyatiHesaplama {
    public static void main(String[] args) {
        int age,yol,yolculukTipi;
        double oran=0.1,indirim,toplam,indirimliTutar,tutar,biletindirim;

        Scanner input = new Scanner(System.in);

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();


        System.out.print("Yolculuk mesafesini(km) giriniz: ");
        yol = input.nextInt();


        System.out.println("1-Tek yön\n2-Gidiş-Dönüş ");
        System.out.print("Yolculuk tercihinizi seçin: ");
        yolculukTipi = input.nextInt();
        
        /*Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
         Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir. */
        
        if((age<0)||(yol<0)||!(yolculukTipi==1 || yolculukTipi==2)){
            System.out.println("Hatalı veri girdiniz!");
        }
        
        switch (yolculukTipi) {
            case 1:                 //Tek yön bilet alacaksa;
                if (age<=12){          //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
                tutar=yol*oran;
                indirim=tutar*0.5;
                indirimliTutar=tutar-indirim;
                System.out.print("Bilet fiyatı: "+ indirimliTutar);
                
            }
                else if(age>12 && age<=24){ //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
                tutar=yol*oran;
                indirim=tutar*0.1;
                indirimliTutar=tutar-indirim;
                System.out.print("Bilet fiyatı: "+ indirimliTutar);
            }
                else if (age>65){ //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
                tutar=yol*oran;
                indirim=tutar*0.30;
                indirimliTutar=tutar-indirim;
                System.out.print("Bilet fiyatı: "+ indirimliTutar);
            }
                else{
                tutar=yol*oran;
                indirimliTutar=tutar;
                System.out.print("Bilet fiyatı: "+ indirimliTutar);
            }
                break;
            case 2:             //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
                if (age<=12){          //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
                tutar=yol*oran;
                indirim=tutar*0.5;
                indirimliTutar=tutar-indirim;
                biletindirim=indirimliTutar*0.2;
                toplam=(indirimliTutar-biletindirim)*2;
                System.out.print("Bilet Fiyatı: " + toplam);
                
            }
                else if(age>12 && age<=24){ //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
                tutar=yol*oran;
                indirim=tutar*0.1;
                indirimliTutar=tutar-indirim;
                biletindirim=indirimliTutar*0.2;
                toplam=(indirimliTutar-biletindirim)*2;
                System.out.print("Bilet Fiyatı: " + toplam);
            }
                else if (age>65){ //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
                tutar=yol*oran;
                indirim=tutar*0.30;
                indirimliTutar=tutar-indirim;
                biletindirim=indirimliTutar*0.2;
                toplam=(indirimliTutar-biletindirim)*2;
                System.out.print("Bilet Fiyatı: " + toplam);
            }
                else{
                tutar=yol*oran;
                indirimliTutar=tutar;
                biletindirim=indirimliTutar*0.2;
                toplam=(indirimliTutar-biletindirim)*2;
                System.out.print("Bilet Fiyatı: " + toplam);
            }
                break;
        }               
    }
}
