class RunnableThread1 implements Runnable{
    RunnableThread1(String name){
        super();
    }
    public void run(){
        int i=10;
        while(i>0){
            i--;
            System.out.println("I am thread 1");
        }
    }
}
class RunnableThread2 implements Runnable{
    String name;
    RunnableThread2(String name){
        super();
    }
    public void run(){
        int i=10;
        while(i>0){
            i--;
            System.out.println("I am thread 2");
        }
    }
}
class Runnable_Interface{
    public static void main(String[] args) {
        RunnableThread1 bullet1 = new RunnableThread1("Ayush");
        Thread gun1 = new Thread(bullet1,"Ayush Thread");
        RunnableThread2 bullet2 = new RunnableThread2("Advait");
        Thread gun2 = new Thread(bullet2, "Advait Thead");
        gun1.start();
        gun2.start();
        System.out.println(gun1.getName());
        System.out.println(gun2.getName());
        System.out.println(gun1.getId());
        System.out.println(gun2.getId());
    }
}