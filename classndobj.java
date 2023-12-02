public class classndobj {
    int gender;
    int name;

    void display() {
        System.out.println(gender);
        System.out.println(name);

    }

    public static void main(String[] args) {
        classndobj obj = new classndobj();

        obj.gender = 43;
        obj.name = 435;
        obj.display();
        father f = new father();
        father d = new father();
        System.out.println(f.name);
        System.out.println(d.name);
        f.greetings();
    }
}
class father{
        String name;
        father(){
           this.name="suray";
           name="vinu";
        }
       void greetings(){
        System.out.println("my name is "+this.name);
    }
}


