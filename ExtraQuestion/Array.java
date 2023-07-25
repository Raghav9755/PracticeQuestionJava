import java.util.*;
public class Array {
    public static void main(String args[]){
        int arr1[] ={1,2,1,4,3,6,7,8,4};
        int arr2[] ={1,9,7,8,6,4,61,2,9};
        int sum=0,T=7;
        Scanner sc = new Scanner(System.in);
        for (int j =0;j<arr1.length;j++)
        {
            for(int i=j+1;i<arr1.length;i++)
            {
                if(arr1[i] == (T-arr1[j]))
                {
                    System.out.println("index are " + j + " and "+i );
            
                }
            } 
        }
  
}
}
