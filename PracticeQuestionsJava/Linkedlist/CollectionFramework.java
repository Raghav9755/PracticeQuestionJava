package PracticeQuestionsJava.Linkedlist;
import java.util.LinkedList;
public class CollectionFramework { 
    public static void main(String args[]){
        LinkedList<String> list=new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        System.out.println(list.size());
        list.addFirst("this");
        list.add("list");
        System.out.println(list);
        System.out.println(list.size());
        int n=list.size();
    }
}  
