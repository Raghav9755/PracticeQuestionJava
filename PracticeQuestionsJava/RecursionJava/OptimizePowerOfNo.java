package PracticeQuestionsJava.RecursionJava;
import java.util.Scanner;
public class OptimizePowerOfNo {
    public static int powerOfNumber(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return powerOfNumber(x, n/2)*powerOfNumber(x, n/2);
        }
        else{
            return powerOfNumber(x, n/2)*powerOfNumber(x, n/2)*x;
        }
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
