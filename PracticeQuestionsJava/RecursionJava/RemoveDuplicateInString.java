package PracticeQuestionsJava.RecursionJava;

public class RemoveDuplicateInString {
    public static boolean[] map =new boolean[26];
    public static void removeDuplicates(String str,int idx,String nstr){
        if(idx ==str.length()){
            System.out.println(nstr);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            removeDuplicates(str, idx+1, nstr);
        }else{
            nstr += currchar;
            map[currchar -'a']=true;
            removeDuplicates(str, idx+1, nstr);
        }
    }
    public static void main(String args[]){
        String str="raaghaghghv";
        removeDuplicates(str, 0, "");
    }
    
}
