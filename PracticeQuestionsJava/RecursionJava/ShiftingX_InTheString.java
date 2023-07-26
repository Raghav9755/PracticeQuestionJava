package PracticeQuestionsJava.RecursionJava;

public class ShiftingX_InTheString {
    public static void scanningString(String str,int idx,int count,String nstr){
       
        if(idx==str.length()){
            for(int i=0;i<count;i++){
             nstr +='x';
            }
            System.out.println(nstr);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            scanningString(str, idx+1, count, nstr);
        }else{
        nstr += currChar;
        scanningString(str, idx+1, count, nstr);
        }
    }
    public static void main(String args[]){
        String str="rxgxhxv";
        scanningString(str, 0, 0, "");

    }
    
}
