import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayLists {
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        // ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Boolean> List3 = new ArrayList<Bollean>();
        // add elements
        Scanner Sc = new Scanner(System.in);
        int n =Sc.nextInt();
         
        for(int i=0;i<n;i++)
        {
            int n1=1;
            n1=i*2+1;
            list.add(n1);
        }
        // list.add(9);
        // list.add(8);
        System.out.println(list);
        // to get the index of elements
        int elements = list.get(2);
        System.out.println(elements);
        // add elements in between
        list.add(2,5);
        System.out.println(list);
        //to set elements
        list.set(2,1);
        System.out.println(list);
        //to remove/delete elements
        list.remove(1);
        System.out.println(list);
        //to find the size of arraylist
        System.out.println(list.size());
        //loop
        for(int i=0 ; i<list.size();i++)
        {
            System.out.print(list.get(i));
        } 
        System.out.println();
        //shorting
        Collections.sort(list); 
        System.out.println(list);
        list.subList(1,5);
        System.out.print("Sub list " +list);
    }   
}