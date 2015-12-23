/**
 * Created by Arlekino on 12/23/2015.
 */
public class ElementMinMax {
    public static void main(String[] args){
        int[] intArray={1,2,3,-7,5,-9,9,};
        boolean swapOc=true;
        while(swapOc){
            swapOc=false;
            for(int i=0; i < intArray.length - 1; i++){
                if(intArray[i]<intArray[i+1]){
                    int tempVariable=intArray[i];
                    intArray[i]=intArray[i+1];
                    intArray[i+1]=tempVariable;
                    swapOc=true;
                }
            }
        }
        for (int element : intArray){
            System.out.println("Min элемент массива intArray="+intArray[6]+"; а Max элемент массива="+intArray[0]);
            break;
        }
    }
}
