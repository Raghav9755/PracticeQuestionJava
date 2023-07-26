package PracticeQuestionsJava.RecursionJava;

public class Subsequences {
    public static void subsequences(String str,int idx,String nstr){
        if(idx==str.length()){
            System.out.println(nstr);
            return;
        }
        char currchar=str.charAt(idx);
        subsequences(str, idx+1,nstr+currchar);
        subsequences(str, idx+1, nstr);
    }
    public static void main(String args[]){
        String str="abc";
        subsequences(str, 0, "");
    }
}
