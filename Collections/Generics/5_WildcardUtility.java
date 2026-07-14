import java.util.*;
public class WildcardUtility{
    public static void printList(List<?> list){
        for(Object o:list) System.out.println(o);
    }
}