// // import java.util.*;
// // public class Main{
// //     public static void main(String [] args)
// //     {
// //         int a[] =new int [10];
// //         String name1= "Raghav";
// //         Scanner sc= new Scanner(System.in);
// //         String name2= sc.nextLine();
// //         for (int i=0;i<a.length;i++)
// //         {
// //             a[i]= sc.nextInt();
// //         }
// //         System.out.println(name1.length());
// //         for (int i=0;i<name1.length();i++){
// //             System.out.println(name1.charAt(i));
// //         }
// //         if(name1.compareTo(name1) ==   0)
// //         {
// //             System.out.println("Equal");    
// //         }
// //         else
// //         {
// //             System.out.println("not Equal");
// //         }
// //         String name3= sc.nextLine();
// //         StringBuilder sb = new StringBuilder(name3);
// //         System.out.println(sb.charAt(2));
// //         sb.setCharAt(2,'D');
// //         System.out.println(sb);
// //         sb.insert(1,"MA");
// //         System.out.println(sb);
// //         sb.delete(3,5);
// //         System.out.println(sb);
// //         StringBuilder ma = new StringBuilder(sb);
// //         ma.append("ffs");
// //         System.out.println(ma);
// //         for(int i=0;i<sb.length()/2;i++){
// //              int front = i;
// //              int back = sb.length() -1 -i;
// //              char forntchar = sb.charAt(front);
// //              char backchar =sb.charAt(back);
// //              sb.setCharAt(front, backchar);
// //              sb.setCharAt(back, forntchar);   
// //         }
// //         System.out.println(sb);
// //          for(int ij=0;ij<a.length;ij++);
// //         {
// //             System.out.println(a[2]);
// //         }
// //         int k=0;
// //         int sum=0;
// //         while(k < a.length){
// //             sum = a[k]+a[k+1];
// //         }
// //         int arr[]  ={1,2,3,4,5,3,2,4,5,4};
// //         int targetSum = 8;
// //         int sum1=0;
// //         int front = arr[0];
// //         int last = arr[arr.length-1];
       
// //         for(int i=0;i<arr.length;i++)
// //         {
// //         sum1=arr[i]+sum1;
// //         if(sum1 > targetSum)
// //         {
// //             front = arr[front+1];
// //             last = arr[last-1];
// //             System.out.println("Front " + front);
// //             System.out.println("last" + last);
            
// //         if (front + last == targetSum)
// //         {
// //             System.out.println("yes");
// //         }
// //         }
// //         }
// //         System.out.println("THE SUM IS " + sum);
// //  }

// // }
// import java.util.* ;
// import java.io.*;

// public class Main 
// {
//     public static void main(String[] args) 
//     {
//         //    Write your code here.
//         Scanner sc =new Scanner(System.in);
//         // input
//         int N=sc.nextInt();
//         int arr[]=new int[100];
//         for(int i=0;i<N;i++)
//         {
//             arr[i]=sc.nextInt();
//             // System.out.println(arr[i]);
//         }
		
//         for(int k=0;k<N;k++)
// 		{
// 			for(int j=k+1;j<N;j++)
// 			{
// 				if(arr[k] == arr[j])
// 				{
// 					System.out.println("Answer: " +arr[k]);
//                     return;
// 				}
// 			}
// 		}
         
//     }
// }
import java.util.*;
class Main {
	
	public static void main(String args[]) {
		// Write code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		int x=sc.nextInt();
		for (int i=0;i<n;i++)
		{
            arr[i]=sc.nextInt();
			for (int j=0;j<n;j++)
			{
				
				if(arr[i]==arr[j])
				{
					System.out.print(j);
                    
				}
			}
		}
        

	
		
	}
}