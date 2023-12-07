package day3;

interface interf {
    void name();
    void age();
}
class suray implements interf,work{

    @Override
    public void name() {
        System.out.println("I am Surendar");
    }

    @Override
    public void age() {
        System.out.println( "i am 20yrs old");
    }

    @Override
    public void work() {
        System.out.println(" I am a developer");
    }
}
class vinu implements interf,work{

    @Override
    public void name() {
        System.out.println("I am VinuPriya");
    }

    @Override
    public void age() {
        System.out.println("I am 21 yrs Old");
    }

    @Override
    public void work() {

    }
}
interface work extends interf{
    void work();
}
