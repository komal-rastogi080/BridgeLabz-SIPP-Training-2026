import java.util.*;
public class UpperBoundExample{
    public static double sum(List<? extends Number> nums){
        double s=0;
        for(Number n:nums) s+=n.doubleValue();
        return s;
    }
}