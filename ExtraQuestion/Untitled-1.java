import java.util.*;
public class TwoDArray()
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col =sc.nextInt();
        int[][] Array = new Array[row][col];
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                numbers[i][j] = sc.nextInt();
            }
        }
        //Output
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println(Array[i][j] + " ");
            }
            System.out.println();
        }
    }
}