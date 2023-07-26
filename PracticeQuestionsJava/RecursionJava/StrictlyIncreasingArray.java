package PracticeQuestionsJava.RecursionJava;

public class StrictlyIncreasingArray {
    public static boolean sortedArray(int a[],int n){
        if(n==a.length-1){
            return true;
        }
        if(a[n]<a[n+1])
        {
         return sortedArray(a, n+1);
        }else{
            return false;
        }

    }
    public static void main(String args[]){
        int a[]={1,3,6,7};
       System.out.println(sortedArray(a, 0)); 
    }
}
