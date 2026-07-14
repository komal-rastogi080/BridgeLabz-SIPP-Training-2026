public class GenericMethods{
    public static <T extends Comparable<T>> T findMax(T[] arr){
        T max=arr[0];
        for(T e:arr) if(e.compareTo(max)>0) max=e;
        return max;
    }
}