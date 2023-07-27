package PracticeQuestionsJava.oops;
//1.single level inheritance=has one base class and one sub class.
//2.multi level inheritance=has one base class and multiple sub class.
//3.Hierachial inheritance=two or more sub classes use same parent class.
//4.Hybrid inheritance it is an combination of both 1,2,3 inheritance
//base class or parent class
class Shape{
   String color;
   int r;
    public void area(){
        System.out.println("Displays area");
    }
     
}
//sub class or child class
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
   
}
//1.---------------------------------
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
//3.----------------------------------
class EquilateralTriangle extends Triangle{
    public void area(int l,int h){
    System.out.println(5*4);
    }   
}
//2.---------------------------------
//4.---------------------------------
public class Inheritance{
    public static void main(String args[]){
        Shape s1=new Shape();
        Circle c1=new Circle();
        Triangle t1=new Triangle();
        c1.r=4;
        s1.color="blue";
        t1.area(5,4);
        c1.area(c1.r);
    }
}