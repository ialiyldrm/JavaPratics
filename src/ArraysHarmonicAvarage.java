public class ArraysHarmonicAvarage {
    public static void main(String[] args){
        /*Dizideki sayıların harmonik ortalamasını hesaplayan program.
        Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
        Harmonik Seri Formülü :1+ 1/2 + 1/3 + ... + 1/n */
       
        int[] list={1,2,3,4,5};

        double sum=0;
        for(int i=0;i<list.length;i++){
            sum+=(1.0/list[i]);
        }
        double harmonicAvarage=list.length/sum;
        System.out.println("Harmonic Avarage :"+harmonicAvarage);       
    }
}
