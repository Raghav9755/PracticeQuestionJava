package PracticeQuestionsJava.RecursionJava;
import java.util.Scanner;
public class PowerOfNumber {
    public static int powerOfNumber(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int xm1=powerOfNumber(x, n-1);
        int ans=x*xm1;
        return ans;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value of .x");
        int x=sc.nextInt();
        System.out.println("Enter power of X");
        int n=sc.nextInt();
        int fans=powerOfNumber(x,n);
        System.out.println(fans);
    }
    
}
