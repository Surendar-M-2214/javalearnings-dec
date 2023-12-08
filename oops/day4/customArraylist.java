package day4;

import java.util.Arrays;

public class customArraylist {

    private int[] data;
//    private static int DEFAULT_SIZE=10;
    private int size =0;

    public customArraylist(int n) {
        this.data = new int[n];
    }
    public void add(int num){
        data[size++]=num;
    }
    public int get(int index){
        return data[index];
    }
  public int size(){
        return data.length;
  }

    @Override
    public String toString() {
        return "customArraylist{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
    }

    public static void main(String[] args) {
        customArraylist cust =new customArraylist(7);
        cust.add(4);
        cust.add(4);
        System.out.println(cust);
        System.out.println( cust.size());
        System.out.println(cust.get(1));

    }
}
