package PracticeQuestionsJava;
public class SlectionShort{
    
    public static void main(String []args){
        int arr[]={7,8,9,2,3,4,1};
        for(int i=0;i<arr.length;i++)
        {
            int smallest=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printArray(arr);
    }
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }

    }
   
}