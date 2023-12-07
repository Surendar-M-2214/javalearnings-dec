package day3;

public abstract class abst {
    abstract void career();
    abstract void partner();
    void greetings(){
        System.out.println("hello ");
    }
}


class son extends abst{

    @Override
    void career() {
        System.out.println(" i am a developer");
    }

    @Override
    void partner() {
        System.out.println("i love vinu");
    }
}
class daughter extends son{

    @Override
    void career() {
        System.out.println("I Am An IAS");
    }

    @Override
    void partner() {
        System.out.println(" I Love Suray");
    }
}
