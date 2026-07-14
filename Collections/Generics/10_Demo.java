import java.util.*;
public class Demo{
    public static void main(String[] args){
        Pair<String,Integer> p=new Pair<>("Java",101);
        System.out.println(p.getFirst()+" "+p.getSecond());

        GenericStack<Integer> gs=new GenericStack<>();
        gs.push(5); gs.push(10);
        System.out.println(gs.pop());

        Integer[] arr={5,2,9,1};
        System.out.println(GenericMethods.findMax(arr));

        Repository<String> repo=new Repository<>();
        repo.add("Alice"); repo.add("Bob");
        WildcardUtility.printList(repo.getAll());
    }
}