package PracticeQuestionsJava;
import java.util.*;

public class ToReversreAnIngerAtMPosition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int k = 0; k < n; k++) {
            arr.add(sc.nextInt());
        }

        System.out.println("Enter Position to switch:");
        int m = sc.nextInt();
        int n1=sc.nextInt();
        int l = arr.size();
        int i = m ;
        int j = n -1 ;

        for (int o = 0; o < l; o++) {
            System.out.print(arr.get(o) + " ");
        }

        while (i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }

        System.out.println("\nReversed array:");
        for (int o = 0; o < l; o++) {
            System.out.print(arr.get(o) + " ");
        }
    }
}
