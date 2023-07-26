package PracticeQuestionsJava.RecursionJava;

public class PermutationsString {
    public static void permutationsString(String str, String permu){
        if(str.length()==0){
            System.out.println(permu);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String nstr=str.substring(0, i)+ str.substring(i+1);
            permutationsString(nstr, permu+currchar);
        }
    }
    public static void main(String args[]){
        String str="abc";
        permutationsString(str, "");
}
        
}
