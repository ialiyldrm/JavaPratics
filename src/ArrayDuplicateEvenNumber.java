import java.util.Arrays;

public class ArrayDuplicateEvenNumber {
    public static void main(String[] args) {
        
        int [] list={2,4,7,5,3,2,4,10,22,8,11,7,11,3,22,10,8,2};
        int [] duplicateEven=new int [list.length];
        int startIndex=0;
        for(int i=0;i<list.length;i++){    
            for(int j=0;j<list.length;j++){
                if((i!=j)&&(list[i]==list[j])){
                    if((list[i]%2==0)){
                        duplicateEven[startIndex++]=list[i];
                        break;
                    }                   
                }
            }                     
        }
        System.out.println(Arrays.toString(duplicateEven));
    }   
}
