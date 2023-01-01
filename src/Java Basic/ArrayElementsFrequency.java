import java.util.Arrays;
public class ArrayElementsFrequency {
    public static void main(String[] args) {
        
        int[] list={10, 20, 20, 10, 10, 20, 5, 20,0,0,0};       
        int [] frequency=new int [list.length];
        
        //Dizi elamanın kendisinden sonra kaç kez tekrar ettiğinin değerlerini listeliyen döngü.
        for(int i =0;i<list.length;i++){ 
            for(int j= i+1; j<list.length;j++){
                if( (list[i]==list[j])){
                    frequency[i]++;
                    
                }
            }
        }
        //System.out.println(Arrays.toString(frequency));
        
        
        //Dizideki elemanların tekrarlarını sıfıra eşitleyen döngü.
        for (int i = 0; i < list.length; i++) {
            for (int j = i+1; j < list.length; j++) {
                if ((list[i] == list[j])) {
                    list[j] = 0;
                }
            }
        }
        //System.out.println(Arrays.toString(list));
        
        //Dizideki elemanların frekansı 1 mi yoksa daha fazla mı diye sorgulayıp frekansını yazdıran döngü.
        for(int i=0;i<list.length;i++){
            if(frequency[i]>1){
                if(list[i] != 0){ //Dizideki eleman tekrar mı değil mi sorgulayan koşul.
                    System.out.println(list[i]+ " sayisi "+ frequency[i]+" kere tekrar edildi.");
                }

            }
            else if(frequency[i] ==1){
                if(list[i] != 0){ //Dizideki eleman tekrar mı değil mi sorgulayan koşul.
                    System.out.println(list[i]+ " sayisi "+ frequency[i]+" kere tekrar edildi.");
                }
            }
        }
    }  
}
