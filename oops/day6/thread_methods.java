package day6;
class A extends Thread{
     public void run(){
         for (int i = 0; i <=10 ; i++) {
             System.out.println(i+" Hii");
             try {
                 Thread.sleep(123);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }

     }
}
class B extends Thread{
    public void run(){
        for (int i = 0; i <=10; i++) {
    System.out.println(i+" Vanakam");
            try {
                Thread.sleep(123);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class thread_methods {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        obj1.setPriority(10);
        obj1.start();
        try {
            Thread.sleep(123);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
    }
}
