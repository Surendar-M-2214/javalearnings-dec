package day5;

interface k{
   int show(int a,int b);
//    void get();
}
public class lambafunc {
    public static void main(String[] args) {
     k obj = Integer::sum;
  int res= obj.show(2,3);
        System.out.println(res);
    }
}
