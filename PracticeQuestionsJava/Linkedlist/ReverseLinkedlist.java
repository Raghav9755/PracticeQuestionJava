package PracticeQuestionsJava.Linkedlist;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class ReverseLinkedlist {
    // public static void reverseList(int n1,int n2, LinkedList<Integer> l){
    //    Scanner sc =new Scanner(System.in);
    //     if(n2==0)
    //     {
    //         System.out.println(n1);
    //         return;
    //     }
    //     l.add(10);
    //     reverseList(n1, n2--, l);
    // }
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Length of List");
        int n=sc.nextInt();

        //input
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        //output (Reverse list)
        for(int i=n-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
