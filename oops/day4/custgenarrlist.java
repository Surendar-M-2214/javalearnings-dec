package day4;

import java.util.Arrays;

public class custgenarrlist <T>{
    private Object[] data;
    //    private static int DEFAULT_SIZE=10;
    private int size =0;

    public custgenarrlist(int n) {
        this.data = new Object[n];
    }
    public void add(T num){
        data[size++]=num;
    }
    public T get(int index){
        return (T)data[index];
    }

    @Override
    public String toString() {
        return "custgenarrlist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public int size(){
        return data.length;
    }

    public static void main(String[] args) {
        custgenarrlist<String> list =new custgenarrlist<>(6);
        list.add("");
        list.add("fdg");
        System.out.println(list);
    }
}
