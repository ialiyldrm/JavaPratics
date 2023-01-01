package MyListClass;
public class MyList<T> {
    private int capacity =10;
    private T[] array;
    private int index=0;

    //Sınıfa ait iki tür constructor metot bulunmalı
    public MyList(){//Boş contructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır.
        this.array = (T[])new Object[capacity];
    }
    
    public MyList(int capacity){ //Dizinin başlangıç değeri capacity parametresinden alınmalıdır.
        this.capacity = capacity;
    }

    public int getCapacity() { //dizinin kapasite değerini verir.
        return capacity;
    }

    public int size(){ //dizinin kapasite değerini verir.
        return index;
    }
    
    /*
    add(T data) : sınıfa ait diziye eleman eklemek için kullanılmalıdır. 
    Eğer dizide yeteri kadar yer yok ise, dizi boyutu 2 katına çıkartılmalıdır.
    */
    public void add(T data){
        if(index == this.capacity){
            T[] newArray=(T[]) new Object[capacity*2];
            int i=0;
            for(T arr : this.array){
                newArray[i] = arr;
                i++;
            }
            this.array = newArray;
            this.capacity = this.capacity*2;
        }
        array[index] = data;
        index++;
    }

    //get(int index): verilen indisteki değeri döndürür. Geçersiz indis girilerse null döndürür.
    public T get(int index){
        if(index < 0 || index >this.index){
            return null;
        }else{
            return array[index];
        }
    }

    /*
    remove(int index): verilen indisteki veriyi silmeli ve silinen indis sonrasında ki verileri sola doğru kaydırmalı.
    Geçersiz indis girilerse null döndürür.

    */
    public T remove(int index){
        this.index--;
        if(index < 0 || index >this.index){
            return null;
        }else{
            T deleteIndexValue = this.array[index];
            for(int j=index ; j < this.index ; j++ ){
                this.array[j] = this.array[j+1];
            }
            return deleteIndexValue;
        }
    }

    /*
    set(int index, T data) : verilen indisteki veriyi yenisi ile değiştirme işlemini yapmalıdır. 
    Geçersiz indis girilerse null döndürür.
    */
    public T set(int index,T data){
        if(index < 0 || index >this.index){
            return null;
        }else{
            T setIndexValue = this.array[index];
            this.array[index] = data;
            return setIndexValue;
        }
    }

    //String toString() : Sınıfa ait dizideki elemanları listeleyen bir metot.
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for(T arr : this.array){
            if(arr !=null){
                stringBuilder.append(arr.toString() + ",");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);//En sondaki virgülü silmek için kod satırı.
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /*
    int indexOf(T data) : Parametrede verilen nesnenin listedeki indeksini verir. 
    Nesne listede yoksa -1 değerini verir.
    */
    public int indexOf(T data){
        int dataIndex = 0;
        boolean isThere =false;
        for (T arr : this.array) {
            if(arr==data){
                isThere=true;
                break;
            }
            dataIndex++;          
        }
        return isThere == true ? dataIndex :-1;
    }

    /*
    int lastIndexOf(T data) : Belirtilen öğenin listedeki son indeksini söyler.
    Nesne listede yoksa -1 değerini verir.
    */
    public int lastIndexOf(T data){
        int dataIndex = 0;
        int lastIndex = 0;
        boolean isThere = false;
        for(T arr : this.array){
            if(arr==data){
                isThere=true;
                lastIndex = dataIndex;
            }
            dataIndex++;
        }
        return isThere == true ? lastIndex:-1;
    }

    //boolean isEmpty() : Listenin boş olup olmadığını söyler.
    public boolean isEmpty(){
        return index==0 ? true:false;
    }

    //T[] toArray() : Listedeki öğeleri, aynı sırayla bir array haline getirir.
    public T[] toArray(){
        return this.array;
    }

    //clear() : Listedeki bütün öğeleri siler, boş liste haline getirir.
    public void clear(){
        this.index=0;
        this.capacity=0;
        T[] newArray =(T[]) new Object[this.capacity];
        this.array=newArray;
    }

    //MyList<T> sublist(int start,int finish) : Parametrede verilen indeks aralığına ait bir liste döner.
    public MyList<T> subList(int start,int finish){
        MyList<T> newMyList = new MyList<>();
        for(int i=start;i<finish+1;i++){
            newMyList.add(this.array[i]);
        }
        return newMyList;
    }

    //boolean contains(T data) : Parametrede verilen değerin dizide olup olmadığını söyler.
    public boolean contains(T data){
        boolean isThere=false;
        for (T arr : this.array) {
            if(arr==data){
                isThere=true;
            }
        }
        return isThere;
    }
}
