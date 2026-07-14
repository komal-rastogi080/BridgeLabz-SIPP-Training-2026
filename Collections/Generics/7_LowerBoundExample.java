import java.util.*;
public class LowerBoundExample{
    public static void addIntegers(List<? super Integer> list){
        list.add(10);
        list.add(20);
    }
}