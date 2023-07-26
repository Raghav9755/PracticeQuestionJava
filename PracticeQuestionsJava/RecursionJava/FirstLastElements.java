package PracticeQuestionsJava.RecursionJava;

public class FirstLastElements {
    public static int first=-1;
    public static int last=-1;
    public static void printElements(String str,int i,char element){
        if(i==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar =str.charAt(i);
        if(currChar == element){
            if(first ==-1)
            {
                first=i;
            }
            else{last=i;}
        }
        printElements(str, i+1, element);
    }
    public static void main(String args[]){
        String str="raghava";

        printElements(str, 0, 'a');
    }    
}
