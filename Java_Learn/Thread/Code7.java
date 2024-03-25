 //practice
 class X{
    X(){
        System.out.println("Hello X");
    }
    void meth1(){
        System.out.println("Meth 1");
    }
 }
 interface A{
    public void meth2();
    public void meth3();
 }
 interface B extends A{
    public void meth4();
    public void meth5();
 }
 interface C{
    default public void meth6(){
        System.out.println("Meth 6");
    }
 }
 class Z extends X implements A, B, C{
    Z(){
        System.out.println("Hello Z");
    }
    public void meth2(){
        System.out.println("Meth 2");
    }
    public void meth3(){
        System.out.println("Meth 3");
    }
    public void meth4(){
        System.out.println("Meth 4");
    }
    public void meth5(){
        System.out.println("Meth 5");
    }
 }
public class Code7 {
    public static void main(String[] args) {
        Z z = new Z();
        z.meth1();
        z.meth2();
        z.meth3();
        z.meth4();
        z.meth5();
        z.meth6();
    }
}
