package PracticeQuestionsJava.oops;
interface Animal{
    void walk(); 
}
interface Herbivore{
    void eyes();
}
class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("Walks on four legs");
    }
    public void eyes(){
        System.out.println("two eyes");
    }
}
public class Interfaces {
    public static void main(String args[]){
        Horse horse=new Horse();
        horse.walk();
        horse.eyes();
    }
}
