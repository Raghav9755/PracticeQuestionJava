import java.util.Scanner;
public class mul {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int sum=sc.nextInt();
            int arr[]={2,3,4,5,6,7,8,8,9};
            int low=0;
            int high=arr.length-1;
            while(low<high)
            {
                if(arr[low] + arr[high]>sum)
                {
                    high--;
                }
                else if(arr[low] + arr[high]<sum)
                {
                    low++;
                }
               else if(arr[low] + arr[high]==sum)
                {
                    System.out.println(arr[low]+" "+arr[high]);
                    low++;
                    high--;

                }
            }
        }
    }
 