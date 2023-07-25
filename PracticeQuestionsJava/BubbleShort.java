package PracticeQuestionsJava;

public class BubbleShort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]  +" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={7,9,5,8,3,2};
        int var;
        //bubble short
        for(int i=0;i<arr.length-1;i++)
        {
            for (int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    var=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=var;
                }
            }
        }
        printArray(arr);
    }
    
}
