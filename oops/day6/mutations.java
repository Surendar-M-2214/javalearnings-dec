package day6;
class D {
    int count;
    public synchronized void Increment(){
        System.out.println("hi");
        ++count;
    }


}

public class mutations {
    public static void main(String[] args) throws InterruptedException {
      D d=new D();
      Runnable obj1=()->{
          for (int i = 1; i <1000 ; i++) {
              d.Increment();
          }
      };
        Runnable obj2=()->{
            for (int i = 1; i <1000 ; i++) {
                d.Increment();
            }
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(d.count);

    }
}
