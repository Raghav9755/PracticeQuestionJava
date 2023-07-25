package PracticeQuestionsJava.RecursionJava;

public class FibonacciSeq {
    public static void fibonacciSeq(int a,int b ,int n){
        if(n ==0){
            return;
        }
        int sum =a+b;
        System.out.println(sum);
        fibonacciSeq(b, sum, n-1);
    }
    public static void main(String args[]){
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        fibonacciSeq(a, b, n-2);
    }
    
}
