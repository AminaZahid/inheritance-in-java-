package pppp;
abstract class A{
    abstract void fun();
    void hh(){
        System.out.println("Hell");
    }
}
abstract class B extends A{
    void fun(){
      System.out.println("Hyyyyy");   
    }
    
}
public class Pppp {
void fun(){
     System.out.println("Hiiii");
}
public static void main(String[] args) {
    A a1;
 a1=new B(){};
a1.fun();
a1.hh(); 
Pppp p2=new Pppp();
p2.fun();
}
}