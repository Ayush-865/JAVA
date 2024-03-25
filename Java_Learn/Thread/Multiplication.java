class Table{
	public synchronized static void getTable(int n){
		for(int i=1; i<=10; i++){
			System.out.println(n*i);
		}
	}
}
class Thread1 extends Thread{
	public void run(){
		Table.getTable(5);
	}
}
class Thread2 extends Thread{
	public void run(){
		Table.getTable(7);
	}
}
class Multiplication{
	public static void main(String[] args){
		Thread1 t1= new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
}
