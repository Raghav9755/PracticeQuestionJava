package PracticeQuestionsJava.Linkedlist;
//In this code we can add required no from user and then shorlist it
import java.util.LinkedList;
import java.util.Scanner;
public class AddingElements {
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Emter length of list");
        int n=sc.nextInt();
        // list.add(0,1);
        // list.add(1,5);
        // list.add(2,7);
        // list.add(3,3);
        // list.add(4,8);
        // list.add(5,2);
        // list.add(6,3);
        // System.out.println(list);
        //input
        for(int i=0;i<n;i++){
           list.add(sc.nextInt());
        }
        //Removing duplicates 
        for(int j=0;j<n;j++){
            if(list.get(j)>25){
                list.remove(j);
                n=list.size();
            }
        }
        //output
        for(int k=0;k<n;k++){
            System.out.print(list.get(k)+" ");
    }
        // for(int j=0;j<list.size();j++){
        //     if(list.get(j)==7){
        //         System.out.println("index:-"+j);
        //     }
    }    
}

