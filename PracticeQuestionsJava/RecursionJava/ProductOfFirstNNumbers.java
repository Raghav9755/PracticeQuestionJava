package PracticeQuestionsJava.RecursionJava;

public class ProductOfFirstNNumbers {
    public static void printSum(int i,int n,int sum){
        if(i==n)
        {
            sum=sum*i;
            System.out.print(sum);
            return;
        }
        sum=i*sum;
        printSum(i+1,n,sum);
    }
    public static void main(String[] args){
        printSum(1,5,1);
    }
}
