class RunnableThread1 extends Thread{
    public void run(){
        int i=100;
        while(i>0){
            i--;
            System.out.println("I am thread 1");
        }
    }
}
class RunnableThread2 extends Thread{
    public void run(){
        int i=100;
        while(i>0){
            i--;
            System.out.println("I am thread 2");
        }
    }
}
class Thread1{
    public static void main(String[] args) {
        RunnableThread1 gun1 = new RunnableThread1();
        RunnableThread2 gun2 = new RunnableThread2();
        gun1.start();
        gun2.start();
    }
}