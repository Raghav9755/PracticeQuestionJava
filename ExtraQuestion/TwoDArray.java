import java.util.*;
public class TwoDArray
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col =sc.nextInt();
        int[][] Array = new int[row][col];
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                Array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter no to find");
        int x=sc.nextInt();
        //Output
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(Array[i][j] == x)
                {
                   System.out.print("X Find at Location " + (i) + " , " + (j) );
                }
                
            }
            System.out.println();
        }
    }
}