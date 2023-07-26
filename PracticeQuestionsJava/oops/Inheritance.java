package PracticeQuestionsJava.oops;
class sum{
    int sum;
    int sub;
    public void addition(int sum){
        System.out.println(sum);
    }
     
}
class add extends sum{
    public void addition(int sum){
        System.out.println(sum);
    }
}
public class Inheritance{
    public static void main(String args[]){
        sum s1=new sum();
        s1.sum=20+10;
        s1.addition(s1.sum);
    }
}