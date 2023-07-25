package PracticeQuestionsJava.RecursionJava;

public class PrintNo {
    public static void printNo(int n){
        if(n==0){
            return;
        }
       
        n=n-1;
        printNo(n);

    }
    public static void main(String args[])
    {
        int n=5;
        System.out.print(n);
        printNo(n);
    } 

}
