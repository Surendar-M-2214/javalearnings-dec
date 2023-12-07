package accesscontrol;

public class access {
    int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

protected int num;
    String name;
    int[] arr;

    public access(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }



}