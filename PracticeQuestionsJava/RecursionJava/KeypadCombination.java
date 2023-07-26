package PracticeQuestionsJava.RecursionJava;
import java.util.*;
public class KeypadCombination {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombo(String str,int idx,String combo){
        if(idx==str.length()){
            System.out.println(combo);
            return;
        }
        char curchar=str.charAt(idx);
        String mapping=keypad[curchar -'0'];
        
        for(int i=0;i<mapping.length();i++){
            printCombo(str, idx+1, combo+mapping.charAt(i));
        }
    }
    public static void main(String args[]){
        String str="23";
        printCombo(str, 0, "");
    }
}
