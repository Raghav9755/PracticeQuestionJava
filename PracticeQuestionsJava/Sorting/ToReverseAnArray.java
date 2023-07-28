package PracticeQuestionsJava;

public class ToReverseAnArray {
    public static void main(String[] args)
    {
        int Array[] = {3,4,6,3,6,8,9,1,2,3,4};
        for (int i=Array.length-1;i>0;i--)
        {
            System.out.print(Array[i]);
        }
    }    
}