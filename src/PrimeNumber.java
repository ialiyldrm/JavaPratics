public class PrimeNumber {
    public static void main(String[] args) {
        
        String primeNumber="";
        

        for(int i=1;i<=100;i++){
            
            int coefficient=0;

            for(int j=i;j>=1;j--){
                if(i%j==0){
                    coefficient++;
                }
            }
            
            if(coefficient==2){
                primeNumber+=i+" ";
            }
        }
       
        System.out.print(primeNumber);
    }   
}
