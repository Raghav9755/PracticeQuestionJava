package PracticeQuestionsJava.RecursionJava;
import java.util.HashSet;
public class UniqueSubsiquences {
    public static boolean []map=new boolean[26];
    public static void uniqueSub(String str,int idx,String nstr,HashSet<String> set){
        if(idx ==str.length()){
            if(set.contains(nstr)){
                return;
            }
            else{
                System.out.println(nstr);
                set.add(nstr);
                return;
            }
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']=true){
            
        }
        // System.out.println(nstr);
        uniqueSub(str, idx+1, nstr+currchar,set);
        uniqueSub(str, idx+1, nstr,set);
    }
    public static void main(String args[]){
        String str="aab";
        HashSet<String> set=new HashSet<>();
        uniqueSub(str, 0, "",set);
    }
}
