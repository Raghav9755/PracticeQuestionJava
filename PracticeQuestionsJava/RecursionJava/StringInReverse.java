package PracticeQuestionsJava.RecursionJava;

public class StringInReverse {
    public static void stringInReverse(int i,String str){
        if(i == 0){
            System.out.print(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        stringInReverse(i-1, str);
    }
    public static void main(String args[]){
        String str="Raghav";
        stringInReverse(str.length()-1 ,str);
    }
    
}
