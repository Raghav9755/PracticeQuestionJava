package PracticeQuestionsJava.RecursionJava;

public class PrintNo {
    public static void printNo(int n){
        if(n==6){
            return;
        }
        System.out.print(n);
        n++;
        printNo(n);

    }
    public static void main(String args[])
    {
        int n=1;
        printNo(n);
    } 

}
