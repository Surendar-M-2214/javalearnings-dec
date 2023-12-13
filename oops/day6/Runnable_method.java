package day6;

//class C implements Runnable{
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("HIii");
//        }
//    }
//}
public class Runnable_method {
    public static void main(String[] args) {
        Runnable obj1=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hii");
                }
            }
        };
        Runnable obj2=new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello");
                }
            }
        };

        Thread t1= new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();

    }
}
